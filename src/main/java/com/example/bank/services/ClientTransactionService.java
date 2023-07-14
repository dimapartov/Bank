package com.example.bank.services;

import com.example.bank.dtos.ClientTransactionDto;
import com.example.bank.dtos.TransactionDto;

import java.util.List;

public interface ClientTransactionService {
    List<ClientTransactionDto> getAll();

    ClientTransactionDto confirmTransaction(Integer senderId, Integer receiverId, Integer transactionId);
}