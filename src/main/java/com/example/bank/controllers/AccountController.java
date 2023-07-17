package com.example.bank.controllers;

import com.example.bank.dtos.AccountClientInfoDto;
import com.example.bank.dtos.AccountDto;
import com.example.bank.dtos.DepositMoneyDto;
import com.example.bank.services.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.Date;

@RestController
public class AccountController {

    @Autowired
    private AccountService accountService;

    @GetMapping("/accounts")
    Iterable<AccountDto> all(){
        return accountService.getAll();
    }

    @PostMapping("/account/new-account/{id}")
    AccountDto newAccount(@RequestBody AccountDto newAccount, @PathVariable Integer id){
       return accountService.createAccount(newAccount, id);
    }

    @PutMapping("/account/deposit-money")
    AccountDto depositMoneyToAccount(@RequestBody DepositMoneyDto depMoney){
        return accountService.depositMoneyToAccountByNumber(depMoney.getNumber(), depMoney.getMoney());
    }

    @DeleteMapping("/account/delete")
    String deleteAccount(@RequestParam Integer number){
        accountService.removeAccountByNumber(number);
        return "Account successfully delete";
    }

    @GetMapping("/account/check-money")
    BigDecimal checkBalanceByAccountNumber(@RequestParam Integer number){
        return accountService.checkBalanceOnAccountByNumber(number);
    }

    @GetMapping("/accounts/{id}")
    Iterable<AccountDto> allClientAccounts(@PathVariable Integer id){
        return accountService.findAccountsByClientId(id);
    }

    @GetMapping("/account/date")
    Date getAccountDate(@RequestParam Integer number){
        return accountService.checkAccountOpenDateByNumber(number);
    }

    @GetMapping("/accounts/client-info-in-transaction/{id}")
    Iterable<AccountClientInfoDto> getAccountInfoByClientTransactionById(@PathVariable Integer id) {
        return accountService.getAccountInfoByClientInTransactionById(id);
    }
}