package com.example.bank.init;

import com.example.bank.dtos.AccountDto;
import com.example.bank.dtos.ClientDto;
import com.example.bank.dtos.TransactionDto;
import com.example.bank.repositories.AccountRepository;
import com.example.bank.repositories.ClientRepository;
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
    private AccountRepository accountRepository;
    @Autowired
    private ClientRepository clientRepository;

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

        ClientDto client1 = new ClientDto("Petrov", "Dima", "Denisovich", "8800");
        client1 = clientService.addClient(client1);
        ClientDto client2 = new ClientDto("Antonov", "Dima", "Evgenievich", "88090909");
        client2 = clientService.addClient(client2);
        ClientDto client3 = new ClientDto("Alabay", "Zhenya", "Bankovich", "88005554454");
        client3 = clientService.addClient(client3);

        System.out.println(clientService.findClientById(2));
        System.out.println(clientService.getAll());
        System.out.println(clientService.updatePhoneNumberById(2, "892929292929"));
        TransactionDto transactionDto = new TransactionDto(new BigDecimal(50), "Перевод");
        transactionDto = transactionService.createTransaction(1,2,transactionDto);
        System.out.println(transactionService.getAllTransactionsByClientId(2));

        TransactionDto transactionDto2 = new TransactionDto(new BigDecimal(5000), "Перевод");
        transactionDto2 = transactionService.createTransaction(1,3,transactionDto2);

        TransactionDto transactionDto3 = new TransactionDto(new BigDecimal(403030), "Перевод");
        transactionDto3 = transactionService.createTransaction(2,3,transactionDto3);

        TransactionDto transactionDto4 = new TransactionDto(new BigDecimal(222323), "Перевод");
        transactionDto4 = transactionService.createTransaction(1,2,transactionDto4);

        System.out.println(clientService.getRelatedInTransactionClientsByClientId(2));

        AccountDto account = new AccountDto(5555, 100);
        AccountDto account2 = new AccountDto(6666, 100);
        AccountDto account3 = new AccountDto(7777, 100);

        System.out.println(accountService.createAccount(account, client1.getId()));
        System.out.println(accountService.createAccount(account2, client2.getId()));
        System.out.println(accountService.createAccount(account3, client3.getId()));

        System.out.println(clientService.getRelatedInTransactionClientsByClientId(1));


//        accountService.removeAccountById(3);
//        accountService.removeAccountByNumber(6666);

//        System.out.println(accountService.depositMoneyToAccountByNumber(5555, new BigDecimal(100)));

//        System.out.println(accountService.checkAccountOpenDateByNumber(5555));
//        System.out.println(accountService.checkBalanceOnAccountByNumber(5555));
//        System.out.println(accountService.findAccountsByClientId(1));




    }
}