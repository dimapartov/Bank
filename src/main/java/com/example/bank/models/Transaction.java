package com.example.bank.models;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "transactions")
public class Transaction extends BaseEntity {
    private BigDecimal transactionAmount;
    private Date date;
    private String transactionType;

    @OneToMany(mappedBy = "transaction")
    private Set<ClientTransaction> clientsTransactions = new HashSet<>();


    protected Transaction() {
    }

    public Transaction(BigDecimal transactionAmount, Date date, String transactionType) {
        this.transactionAmount = transactionAmount;
        this.date = date;
        this.transactionType = transactionType;
    }

    @Column(name = "transactionAmount", nullable = false)
    public BigDecimal getTransactionAmount() {
        return transactionAmount;
    }

    @Column(name = "date", nullable = false)
    public Date getDate() {
        return date;
    }

    @Column(name = "transactionType", nullable = false)
    public String getTransactionType() {
        return transactionType;
    }

//    public Set<Client> getClients() {
//        return clients;
//    }
}