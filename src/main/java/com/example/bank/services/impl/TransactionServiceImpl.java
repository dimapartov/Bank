package com.example.bank.services.impl;

import com.example.bank.dtos.TransactionDto;
import com.example.bank.models.Transaction;
import com.example.bank.repositories.TransactionRepository;
import com.example.bank.services.ClientTransactionService;
import com.example.bank.services.TransactionService;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.lang.reflect.Type;
import java.util.Date;
import java.util.List;

@Service
public class TransactionServiceImpl implements TransactionService {
    @Autowired
    private TransactionRepository transactionRepository;

    @Autowired
    private ModelMapper modelMapper;

    @Autowired
    private ClientTransactionService clientTransactionService;

    public List<TransactionDto> mapTransactionsToDtos(List<Transaction> transactions) {
        Type listType = new TypeToken<List<TransactionDto>>() {}.getType();
        return modelMapper.map(transactions, listType);
    }

    @Override
    public TransactionDto createTransaction(Integer senderId, Integer receiverId, TransactionDto transaction) {
        Transaction transaction1 = modelMapper.map(transaction, Transaction.class);
        Date currentTime = new Date();
        transaction1.setDate(new Date(currentTime.getTime()));
        transactionRepository.save(transaction1);
        clientTransactionService.confirmTransaction(senderId, receiverId, transaction1.getId());
        return modelMapper.map(transaction1, TransactionDto.class);
    }

    @Override
    public List<TransactionDto> getAll() {
        return mapTransactionsToDtos(transactionRepository.findAll());
    }

    @Override
    public List<TransactionDto> getAllTransactionsByClientId(Integer id) {
        List<Transaction> transactions = transactionRepository.getAllTransactionsByClientId(id);
        return mapTransactionsToDtos(transactions);
    }

    @Override
    public TransactionDto getTransactionById(Integer id) {
        return modelMapper.map(transactionRepository.getTransactionById(id), TransactionDto.class);
    }
}