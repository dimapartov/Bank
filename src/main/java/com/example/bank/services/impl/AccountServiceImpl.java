package com.example.bank.services.impl;

import com.example.bank.dtos.AccountClientInfoDto;
import com.example.bank.dtos.AccountDto;
import com.example.bank.models.Account;
import com.example.bank.models.Client;
import com.example.bank.repositories.AccountRepository;
import com.example.bank.repositories.ClientRepository;
import com.example.bank.services.AccountService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class AccountServiceImpl implements AccountService {
    @Autowired
    private AccountRepository accountRepository;
    @Autowired
    private ClientRepository clientRepository;
    @Autowired
    private ModelMapper modelMapper;

    @Override
    public AccountDto createAccount(AccountDto account, Integer id) {
        Client client = clientRepository.findClientById(id);
        Account account1 = modelMapper.map(account, Account.class);
        Date currentTime = new Date();
        account1.setAccountOpenDate(new Date(currentTime.getTime()));
        account1.setClient(client);
        return modelMapper.map(accountRepository.save(account1), AccountDto.class);
    }
    @Override
    @Transactional
    public void removeAccountByNumber(Integer accountNumber) {
        accountRepository.deleteAccountByAccountNumber(accountNumber);
    }
    @Override
    public AccountDto depositMoneyToAccountByNumber(Integer accountNumber, BigDecimal amountOfMoney) {
        Account account1 = accountRepository.findAccountByAccountNumber(accountNumber);
        account1.setBalance(account1.getBalance().add(amountOfMoney));
        accountRepository.save(account1);
        return modelMapper.map(account1, AccountDto.class);
    }
    @Override
    public Date checkAccountOpenDateByNumber(Integer accountNumber) {
        Account account = accountRepository.findAccountByAccountNumber(accountNumber);
        return account.getAccountOpenDate();
    }
    @Override
    public BigDecimal checkBalanceOnAccountByNumber(Integer accountNumber) {
        Account account = accountRepository.findAccountByAccountNumber(accountNumber);
        return account.getBalance();
    }
    @Override
    public List<AccountDto> findAccountsByClientId(Integer id) {
        return accountRepository.findAccountsByClientId(id)
                .stream().map((account) -> modelMapper.map(account, AccountDto.class)).collect(Collectors.toList());
    }
    @Override
    public List<AccountDto> getAll() {
        return accountRepository.findAll()
                .stream().map((account) -> modelMapper.map(account, AccountDto.class)).collect(Collectors.toList());
    }
    @Override
    public List<AccountClientInfoDto> getAccountInfoByClientInTransactionById(Integer id) {
        return accountRepository.getAccountInfoByClientInTransactionById(id);
    }
}