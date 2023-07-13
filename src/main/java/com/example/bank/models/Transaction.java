package com.example.bank.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "transactions")
public class Transaction extends BaseEntity{
    private BigDecimal transactionAmount;
    private Date date;
    private String transactionType;


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
}
