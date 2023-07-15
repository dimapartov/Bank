package com.example.bank.init;

import com.example.bank.dtos.AccountDto;
import com.example.bank.dtos.ClientDto;
import com.example.bank.models.Client;
import com.example.bank.repositories.AccountRepository;
import com.example.bank.repositories.ClientRepository;
import com.example.bank.services.AccountService;
import com.example.bank.services.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.Date;

@Component
public class CommandLineRunnerImpl implements CommandLineRunner {
    @Autowired
    private AccountRepository accountRepository;
    @Autowired
    private ClientRepository clientRepository;

    @Autowired
    private AccountService accountService;

    @Autowired
    private ClientService clientService;

    @Override
    public void run(String... args) throws Exception {
        seedData();
    }

    private void seedData() throws IOException {

        ClientDto client = new ClientDto("Petrov", "Dima", "Denisovich", "8800");
        client = clientService.addClient(client);

//        AccountDto account = new AccountDto(5555, new BigDecimal(10), new Date(1689427769), client);
//        AccountDto account2 = new AccountDto(6666, new BigDecimal(10), new Date(1689427769),client);
//        AccountDto account3 = new AccountDto(7777, new BigDecimal(10), new Date(1689427769),client);
        AccountDto account = new AccountDto(5555, new BigDecimal(10), new Date(1689427769));
        AccountDto account2 = new AccountDto(6666, new BigDecimal(10), new Date(1689427769));
        AccountDto account3 = new AccountDto(7777, new BigDecimal(10), new Date(1689427769));

        System.out.println(clientRepository.findClientById(1));
        System.out.println(accountService.createAccount(account, client.getId()));
        System.out.println(accountService.createAccount(account2, client.getId()));
        System.out.println(accountService.createAccount(account3, client.getId()));
//        System.out.println(accountService.createAccount(account));
//        System.out.println(accountService.createAccount(account2));
//        System.out.println(accountService.createAccount(account3));

        accountService.removeAccountById(3);
//        accountService.removeAccountById(3);

    }
}