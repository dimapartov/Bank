package com.example.bank.models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;

@Entity
@IdClass(ClientTransactionId.class)
@Table(name = "client_transaction")
public class ClientTransaction {

    @Id
    @ManyToOne
    @JoinColumn(name = "client_id", referencedColumnName = "id")
    @JsonBackReference
    private Client client;

    @Id
    @ManyToOne
    @JoinColumn(name = "transaction_id", referencedColumnName = "id")
    @JsonBackReference
    private Transaction transaction;

    protected ClientTransaction() {
    }

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

//    @Column(name = "client_id", nullable = false)
//    public Client getClients() {
//        return client;
//    }
//
//    @Column(name = "transaction_id", nullable = false)
//    public Transaction getTransactions() {
//        return transaction;
//    }
}