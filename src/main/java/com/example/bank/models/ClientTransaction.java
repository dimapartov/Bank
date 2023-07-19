package com.example.bank.models;

import jakarta.persistence.*;

@Entity
@IdClass(ClientTransactionId.class)
@Table(name = "client_transaction")
public class ClientTransaction {

    @Id
    @ManyToOne
    @JoinColumn(name = "client_id", referencedColumnName = "id")
    private Client client;

    @Id
    @ManyToOne
    @JoinColumn(name = "transaction_id", referencedColumnName = "id")
    private Transaction transaction;

    protected ClientTransaction() {}

    public ClientTransaction(Client client, Transaction transaction) {
        this.client = client;
        this.transaction = transaction;
    }

    public Client getClient() {
        return client;
    }

    public Transaction getTransaction() {
        return transaction;
    }
}