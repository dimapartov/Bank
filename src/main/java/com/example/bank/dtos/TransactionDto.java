package com.example.bank.dtos;

import java.math.BigDecimal;
import java.util.Date;

public class TransactionDto {

    private Integer id;
    private BigDecimal transactionAmount;
    private Date date;
    private String transactionType;

    public TransactionDto() {}

    public TransactionDto(BigDecimal transactionAmount, String transactionType) {
        this.transactionAmount = transactionAmount;
        Date currentDate = new Date();
        this.date = new Date(currentDate.getTime());
        this.transactionType = transactionType;
    }

    public TransactionDto(Integer id, BigDecimal transactionAmount, Date date, String transactionType) {
        this.id = id;
        this.transactionAmount = transactionAmount;
        this.date = date;
        this.transactionType = transactionType;
    }

    public BigDecimal getTransactionAmount() {
        return transactionAmount;
    }

    public void setTransactionAmount(BigDecimal transactionAmount) {
        this.transactionAmount = transactionAmount;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(String transactionType) {
        this.transactionType = transactionType;
    }

    @Override
    public String toString() {
        return "TransactionDto{" +
                "id=" + id +
                ", transactionAmount=" + transactionAmount +
                ", date=" + date +
                ", transactionType='" + transactionType + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }
}