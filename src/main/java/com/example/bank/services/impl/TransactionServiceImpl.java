package com.example.bank.services.impl;

import com.example.bank.dtos.TransactionDto;
import com.example.bank.services.TransactionService;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class TransactionServiceImpl implements TransactionService {
    @Override
    public TransactionDto createTransaction(Integer senderId, Integer receiverId, TransactionDto transaction) {
        return null;
    }

    @Override
    public List<TransactionDto> findAllTransactionsOnDate(Date date) {
        return null;
    }

    @Override
    public List<TransactionDto> getAll() {
        return null;
    }

    @Override
    public List<TransactionDto> findAllTransactionsByClientId(Integer id) {
        return null;
    }
}