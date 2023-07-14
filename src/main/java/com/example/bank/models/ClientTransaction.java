package com.example.bank.models;

import jakarta.persistence.*;

import java.util.Set;

@Entity
@Table(name = "client_transaction")
public class ClientTransaction {

    @Id
    @ManyToOne
    private Client client;

    @Id
    @ManyToOne
    private Transaction transaction;

    protected ClientTransaction() {
    }

    public ClientTransaction(Client clients, Transaction transactions) {
        this.client = clients;
        this.transaction = transactions;
    }

    @Column(name = "client_id", nullable = false)
    public Client getClients() {
        return client;
    }

    @Column(name = "transaction_id", nullable = false)
    public Transaction getTransactions() {
        return transaction;
    }
}