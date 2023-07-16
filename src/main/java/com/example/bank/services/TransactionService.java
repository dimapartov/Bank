package com.example.bank.services;

import com.example.bank.dtos.TransactionDto;

import java.util.Date;
import java.util.List;

public interface TransactionService {

    TransactionDto createTransaction(Integer senderId, Integer receiverId, TransactionDto transaction);

    List<TransactionDto> getAll();

    List<TransactionDto> getAllTransactionsByClientId(Integer id);

    TransactionDto getTransactionById(Integer id);

}