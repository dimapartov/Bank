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
        return modelMapper.map(clientRepository.findClientById(id), ClientDto.class);
    }

    @Override
    public ClientDto updatePhoneNumberById(Integer id, String phoneNumber) {
        Client client = clientRepository.findClientById(id);
        client.setPhoneNumber(phoneNumber);
        clientRepository.save(client);
        return modelMapper.map(client, ClientDto.class);
    }

    @Override
    public List<ClientDto> getAll() {
        return modelMapper.map(clientRepository.findAll(), List.class);
    }

    @Override
    public List<ClientDto> getRelatedInTransactionClientsByClientId(Integer id) {
        return modelMapper.map(clientRepository.getRelatedInTransactionClientsByClientId(id), List.class);
    }
}