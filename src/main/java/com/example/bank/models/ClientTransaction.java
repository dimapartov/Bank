package com.example.bank.models;

import jakarta.persistence.*;

import java.util.Set;

@Entity
@Table(name = "client_transaction")
public class ClientTransaction {

//    @EmbeddedId
//    private ClientTransactionPK pk;

    @Id
    @ManyToOne
    private Client clients;

    @Id
    @ManyToOne
    private Transaction transactions;

    protected ClientTransaction() {
    }

    public ClientTransaction(ClientTransactionPK pk, Client clients, Transaction transactions) {
//        this.pk = pk;
        this.clients = clients;
        this.transactions = transactions;
    }

    @Column(name = "client_id", nullable = false)
    public Client getClients() {
        return clients;
    }

    @Column(name = "transaction_id", nullable = false)
    public Transaction getTransactions() {
        return transactions;
    }
}
