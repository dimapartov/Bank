package com.example.bank.services.impl;

import com.example.bank.dtos.AccountDto;
import com.example.bank.repositories.AccountRepository;
import com.example.bank.services.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    AccountRepository accountRepository;

    @Override
    public AccountDto createAccount(AccountDto account, Integer id) {
        return null;
    }

    @Override
    public void terminateAccountByNumber(Integer accountNumber) {
        accountRepository.deleteAccountByAccountNumber(accountNumber);
    }

    @Override
    public void depositMoneyToAccountById(Integer accountNumber, BigDecimal amountOfMoney) {

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
}