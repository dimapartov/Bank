package com.example.bank.controllers;

import com.example.bank.dtos.ClientTransactionDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClientTransactionController {
    @Autowired
    private ClientTrunsactionService clientTrunsactionService;

    @GetMapping("/clients-transactions")
    ClientTransactionDto all(){
        return clientTrunsactionService.getAll();
    }

}
