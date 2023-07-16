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
        clientService.addClient(client);
        ClientDto client2 = new ClientDto("Antonov", "Dima", "Evgenievich", "88090909");
        clientService.addClient(client2);

//        System.out.println(clientService.findClientById(2));
        System.out.println(clientService.getAll());
        System.out.println(clientService.updatePhoneNumberById(2, "892929292929"));
//        AccountDto account = new AccountDto(5555, 100);
//        AccountDto account2 = new AccountDto(6666, 100);
//        AccountDto account3 = new AccountDto(7777, 100);
//
//        System.out.println(clientRepository.findClientById(1));
//
//        System.out.println(accountService.createAccount(account, client.getId()));
//        System.out.println(accountService.createAccount(account2, client.getId()));
//        System.out.println(accountService.createAccount(account3, client.getId()));
//
//        accountService.removeAccountById(3);
//        accountService.removeAccountByNumber(6666);
//
//        System.out.println(accountService.depositMoneyToAccountByNumber(5555, new BigDecimal(100)));
//
//        System.out.println(accountService.checkAccountOpenDateByNumber(5555));
//        System.out.println(accountService.checkBalanceOnAccountByNumber(5555));
//        System.out.println(accountService.findAccountsByClientId(1));




    }
}