package com.example.bank.services.impl;

import com.example.bank.dtos.ClientDto;
import com.example.bank.models.Client;
import com.example.bank.repositories.ClientRepository;
import com.example.bank.services.ClientService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientServiceImpl implements ClientService {

    @Autowired
    private ClientRepository clientRepository;
    @Autowired
    private ModelMapper modelMapper;

    @Override
    public ClientDto addClient(ClientDto client) {
        Client client1 = modelMapper.map(client, Client.class);
        return modelMapper.map(clientRepository.save(client1), ClientDto.class);
    }

    @Override
    public void removeClientById(Integer id) {
        clientRepository.deleteById(id);
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