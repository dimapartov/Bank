package com.example.bank.services.impl;

import com.example.bank.dtos.ClientTransactionDto;
import com.example.bank.services.ClientTransactionService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientTransactionServiceImpl implements ClientTransactionService {
    @Override
    public List<ClientTransactionDto> getAll() {
        return null;
    }

    @Override
    public ClientTransactionDto confirmTransaction(Integer senderId, Integer receiverId, Integer transactionId) {
        return null;
    }
}