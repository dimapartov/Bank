package com.example.bank.services;

import com.example.bank.dtos.AccountDto;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public interface AccountService {

    AccountDto createAccount(AccountDto account, Integer id);

    void terminateAccountByNumber(Integer accountNumber);

    void depositMoneyToAccountById(Integer accountNumber, BigDecimal amountOfMoney);

    Date checkAccountOpenDateByNumber(Integer accountNumber);

    BigDecimal checkBalanceOnAccountByNumber(Integer accountNumber);

    List<AccountDto> findAccountsByClientId(Integer id);

    List<AccountDto> getAll();

}