package com.example.bank.init;

import com.example.bank.dtos.AccountDto;
import com.example.bank.dtos.ClientDto;
import com.example.bank.dtos.TransactionDto;
import com.example.bank.services.AccountService;
import com.example.bank.services.ClientService;
import com.example.bank.services.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.math.BigDecimal;

@Component
public class CommandLineRunnerImpl implements CommandLineRunner {

    @Autowired
    private AccountService accountService;

    @Autowired
    private ClientService clientService;

    @Autowired
    private TransactionService transactionService;

    @Override
    public void run(String... args) throws Exception {
        seedData();
    }

    private void seedData() throws IOException {

        ClientDto client1 =
                new ClientDto("Kubarev", "Dmitriy", "Denisovich", "88005553535");
        client1 = clientService.addClient(client1);

        ClientDto client2 =
                new ClientDto("Loginov", "Evgeniy", "Romanovich", "88006665656");
        client2 = clientService.addClient(client2);

        ClientDto client3 =
                new ClientDto("Alabay", "Thomas", "Bankovich", "88006789898");
        client3 = clientService.addClient(client3);


        TransactionDto transaction1 = new TransactionDto(new BigDecimal(50), "Перевод");
        transaction1 = transactionService.createTransaction(1,2, transaction1);

        TransactionDto transaction2 = new TransactionDto(new BigDecimal(5000), "Перевод");
        transaction2 = transactionService.createTransaction(1,3,transaction2);

        TransactionDto transaction3 = new TransactionDto(new BigDecimal(20100), "Перевод");
        transaction3 = transactionService.createTransaction(1,3,transaction3);

        TransactionDto transaction4 = new TransactionDto(new BigDecimal(50000), "Перевод");
        transaction4 = transactionService.createTransaction(1,2,transaction4);

        AccountDto account1 = new AccountDto(123, 100000);
        AccountDto account2 = new AccountDto(456, 100000);
        AccountDto account3 = new AccountDto(789, 100000);

        account1 = accountService.createAccount(account1, client1.getId());
        account2 = accountService.createAccount(account2, client2.getId());
        account3 = accountService.createAccount(account3, client3.getId());
    }
}