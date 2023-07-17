package com.example.bank.services.impl;

import com.example.bank.dtos.ClientTransactionDto;
import com.example.bank.models.Client;
import com.example.bank.models.ClientTransaction;
import com.example.bank.models.Transaction;
import com.example.bank.repositories.ClientRepository;
import com.example.bank.repositories.ClientTransactionRepository;
import com.example.bank.repositories.TransactionRepository;
import com.example.bank.services.ClientTransactionService;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

@Service
public class ClientTransactionServiceImpl implements ClientTransactionService {
    @Autowired
    private ClientRepository clientRepository;

    @Autowired
    private ClientTransactionRepository clientTransactionRepository;

    @Autowired
    private TransactionRepository transactionRepository;

    @Autowired
    private ModelMapper modelMapper;

    private List<ClientTransactionDto> mapToDtos(List<ClientTransaction> clientTransactions) {
        Type listType = new TypeToken<List<ClientTransactionDto>>() {}.getType();
        return modelMapper.map(clientTransactions, listType);
    }

    @Override
    public List<ClientTransactionDto> getAll() {
        return mapToDtos(clientTransactionRepository.findAll());
    }

    @Override
    public List<ClientTransactionDto> confirmTransaction(Integer senderId, Integer receiverId, Integer transactionId) {
        Client sender = clientRepository.findClientById(senderId);
        Client receiver = clientRepository.findClientById(receiverId);
        Transaction transaction = transactionRepository.getTransactionById(transactionId);
        ClientTransaction clientTransaction1 = new ClientTransaction(sender, transaction);
        clientTransactionRepository.save(clientTransaction1);
        ClientTransaction clientTransaction2 = new ClientTransaction(receiver, transaction);
        clientTransactionRepository.save(clientTransaction2);
        List<ClientTransaction> transactions = new ArrayList<>();
        transactions.add(clientTransaction1);
        transactions.add(clientTransaction2);
        return mapToDtos(transactions);
    }
}