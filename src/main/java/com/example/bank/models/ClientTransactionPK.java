package com.example.bank.models;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;

@Embeddable
public class ClientTransactionPK implements Serializable {

    @Column(name = "client_id")
    private Client client;
    @Column(name = "transaction_id")
    private Transaction transaction;
}
