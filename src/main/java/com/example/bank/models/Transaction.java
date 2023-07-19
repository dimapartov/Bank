package com.example.bank.models;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "transactions")
public class Transaction extends BaseEntity {

    @Column(name = "transactionAmount", nullable = false)
    private BigDecimal transactionAmount;

    @Column(name = "date", nullable = false)
    private Date date;

    @Column(name = "transactionType", nullable = false)
    private String transactionType;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "transaction")
    private List<ClientTransaction> clientTransactions;

    protected Transaction() {}

    public Transaction(BigDecimal transactionAmount, Date date, String transactionType) {
        this.transactionAmount = transactionAmount;
        this.date = date;
        this.transactionType = transactionType;
    }

    public BigDecimal getTransactionAmount() {
        return transactionAmount;
    }

    public Date getDate() {
        return date;
    }

    public String getTransactionType() {
        return transactionType;
    }

    public List<ClientTransaction> getClients() {
        return clientTransactions;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "transactionAmount=" + transactionAmount +
                ", date=" + date +
                ", transactionType='" + transactionType + '\'' +
                ", id=" + id +
                "} " + super.toString();
    }

    public void setDate(Date date) {
        this.date = date;
    }
}