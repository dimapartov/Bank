package com.example.bank.services;

import com.example.bank.dtos.AccountClientInfoDto;
import com.example.bank.dtos.AccountDto;
import jakarta.transaction.Transactional;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public interface AccountService<ID> {

    AccountDto createAccount(AccountDto account, Integer id);
//    AccountDto createAccount(AccountDto account);

    void removeAccountByNumber(Integer accountNumber);
    void removeAccountById(ID id);

    AccountDto depositMoneyToAccountByNumber(Integer accountNumber, BigDecimal amountOfMoney);

    Date checkAccountOpenDateByNumber(Integer accountNumber);

    BigDecimal checkBalanceOnAccountByNumber(Integer accountNumber);

    List<AccountDto> findAccountsByClientId(Integer id);

    List<AccountDto> getAll();

    List<AccountClientInfoDto> getAccountInfoByClientInTransactionById(Integer id);

}