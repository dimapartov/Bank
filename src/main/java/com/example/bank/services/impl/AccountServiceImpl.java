package com.example.bank.services.impl;

import com.example.bank.dtos.AccountDto;
import com.example.bank.dtos.ClientDto;
import com.example.bank.models.Account;
import com.example.bank.models.Client;
import com.example.bank.repositories.AccountRepository;
import com.example.bank.repositories.ClientRepository;
import com.example.bank.services.AccountService;
import jakarta.transaction.Transactional;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@Service
public class AccountServiceImpl implements AccountService<Integer> {

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
        account1.setClient(client);
        return modelMapper.map(accountRepository.save(account1), AccountDto.class);
    }
    @Override
    public AccountDto createAccount(AccountDto account) {
        Account account1 = modelMapper.map(account, Account.class);
        return modelMapper.map(accountRepository.save(account1), AccountDto.class);
    }

//    @Override
//    public void terminateAccountByNumber(Integer accountNumber) {
//        accountRepository.removeAccountByAccountNumber(accountNumber);
//    }

    @Override
    public void depositMoneyToAccountByNumber(Integer accountNumber, BigDecimal amountOfMoney) {

    }

    @Override
    public Date checkAccountOpenDateByNumber(Integer accountNumber) {
        return null;
    }

    @Override
    public BigDecimal checkBalanceOnAccountByNumber(Integer accountNumber) {
        return null;
    }

    @Override
    public List<AccountDto> findAccountsByClientId(Integer id) {
        return null;
    }

    @Override
    public List<AccountDto> getAll() {
        return null;
    }

    @Override
    public void removeAccountById(Integer id) {
        accountRepository.deleteById(id);
    }

}