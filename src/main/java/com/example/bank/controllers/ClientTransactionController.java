package com.example.bank.controllers;

import com.example.bank.dtos.ClientTransactionDto;
import com.example.bank.services.ClientTransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClientTransactionController {

    @Autowired
    private ClientTransactionService clientTransactionService;

    @GetMapping("/clients-transactions")
    Iterable<ClientTransactionDto> all(){
        return clientTransactionService.getAll();
    }

}