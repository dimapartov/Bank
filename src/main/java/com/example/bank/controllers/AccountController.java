package com.example.bank.controllers;

import com.example.bank.dtos.AccountDto;
import com.example.bank.dtos.DepositMoneyDto;
import com.example.bank.services.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@RestController
public class AccountController {

    @Autowired
    private AccountService accountService;

    @GetMapping("/accounts")
    Iterable<AccountDto> all(){
        return accountService.getAll();
    }

    @PostMapping("/new-client-account/{id}")
    AccountDto newAccount(@RequestBody AccountDto newAccount, @PathVariable Integer id){
       return accountService.createAccount(newAccount, id);
    }

    @PutMapping("/deposit-money")
    void depositMoneyToAccount(@RequestBody DepositMoneyDto depMoney){
        accountService.depositMoneyToAccountById(depMoney.getId(), depMoney.getMoney());
    }

    @DeleteMapping("/delete-account")
    void deleteAccount(@RequestParam Integer number){
        accountService.terminateAccountByNumber(number);
    }

    @GetMapping("/check-money")
    BigDecimal checkBalanceByAccountNumber(@RequestParam Integer number){
        return accountService.checkBalanceOnAccountByNumber(number);
    }

    @GetMapping("/accounts/{id}")
    List<AccountDto> allClientAccounts(@PathVariable Integer id){
        return accountService.findAccountsByClientId(id);
    }

    @GetMapping("/account/date")
    Date getAccountDate(@RequestParam Integer number){
        return accountService.checkAccountOpenDateByNumber(number);
    }
}
