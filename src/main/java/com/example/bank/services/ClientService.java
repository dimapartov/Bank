package com.example.bank.services;

import com.example.bank.dtos.ClientDto;

import java.util.List;

public interface ClientService {

    ClientDto addClient(ClientDto client);

    void removeClientById(Integer id);

    ClientDto findClientById(Integer id);

    ClientDto updatePhoneNumberById(Integer id, String phoneNumber);

    List<ClientDto> getAll();

}