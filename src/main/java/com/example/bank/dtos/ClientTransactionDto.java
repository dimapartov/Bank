package com.example.bank.dtos;

public class ClientTransactionDto {

    private ClientDto client;
    private TransactionDto transaction;


    public ClientTransactionDto() {
    }

    public ClientTransactionDto(ClientDto client, TransactionDto transaction) {
        this.client = client;
        this.transaction = transaction;
    }

    public ClientDto getClient() {
        return client;
    }

    public void setClient(ClientDto client) {
        this.client = client;
    }

    public TransactionDto getTransaction() {
        return transaction;
    }

    public void setTransaction(TransactionDto transaction) {
        this.transaction = transaction;
    }

    @Override
    public String toString() {
        return "ClientTransactionDto{" +
                "client=" + client +
                ", transaction=" + transaction +
                '}';
    }
}