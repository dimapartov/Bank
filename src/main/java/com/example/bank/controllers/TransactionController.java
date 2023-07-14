package com.example.bank.controllers;

import com.example.bank.dtos.TransactionDto;
import com.example.bank.services.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
public class TransactionController {

    @Autowired
    private TransactionService transactionService;

    @GetMapping("/transactions")
    Iterable<TransactionDto> all(){
        return transactionService.getAll();
    }

    @PostMapping("/add-transaction")
    TransactionDto newTransaction(@RequestBody TransactionDto newTransaction,
                                  @RequestParam Integer sender_id, @RequestParam Integer receiver_id){
        return transactionService.createTransaction(sender_id, receiver_id, newTransaction);
    }

    @GetMapping("/transactions-by-date")
    List<TransactionDto> getByDate(@RequestParam Date date){
        return transactionService.findAllTransactionsOnDate(date);
    }

    @GetMapping("/transactions/{client_id}")
    List<TransactionDto> getByClientId(@PathVariable Integer id){
        return transactionService.findAllTransactionsByClientId(id);
    }
}
