package com.example.bank.services;

import com.example.bank.dtos.ClientTransactionDto;

import java.util.List;

public interface ClientTransactionService {

    List<ClientTransactionDto> getAll();

    List<ClientTransactionDto> confirmTransaction(Integer senderId, Integer receiverId, Integer transactionId);
}