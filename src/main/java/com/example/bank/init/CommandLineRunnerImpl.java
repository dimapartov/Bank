package com.example.bank.init;

import com.example.bank.models.Client;
import com.example.bank.repositories.ClientRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Component
public class CommandLineRunnerImpl implements CommandLineRunner {
    @Autowired
    private ClientRepository clientRepository;

    @Override
    public void run(String... args) throws Exception {
        seedData();
    }

    private void seedData() throws IOException {
        Client client1 = new Client("Petrov", "Dima","Denisovich","8800");
        clientRepository.save(client1);
        System.out.println(clientRepository.findClientById(1));
    }
}