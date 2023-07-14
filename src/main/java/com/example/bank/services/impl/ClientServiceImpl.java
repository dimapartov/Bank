package com.example.bank.services.impl;

import com.example.bank.dtos.ClientDto;
import com.example.bank.repositories.ClientRepository;
import com.example.bank.services.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientServiceImpl implements ClientService {

    @Autowired
    ClientRepository clientRepository;
    @Override
    public ClientDto addClient(ClientDto client) {
        return null;
    }

    @Override
    public void removeClientById(Integer id) {
        clientRepository.deleteClientById(id);
    }

    @Override
    public ClientDto findClientById(Integer id) {
        return null;
    }

    @Override
    public ClientDto updatePhoneNumberById(Integer id, String phoneNumber) {
        return null;
    }

    @Override
    public List<ClientDto> getAll() {
        return null;
    }
}