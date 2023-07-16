package com.example.bank.dtos;

import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TransactionDto {

    private Integer id;
    private BigDecimal transactionAmount;
    private Date date;
    private String transactionType;
    private List<ClientTransactionDto> clientsTransactions;

    public TransactionDto() {
    }

    public TransactionDto(Integer id, BigDecimal transactionAmount, Date date, String transactionType,
                          List<ClientTransactionDto> clientsTransactions) {
        this.id = id;
        this.transactionAmount = transactionAmount;
        this.date = date;
        this.transactionType = transactionType;
        this.clientsTransactions = clientsTransactions;
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

    public List<ClientTransactionDto> getClientsTransactions() {
        return clientsTransactions;
    }

    public void setClientsTransactions(List<ClientTransactionDto> clientsTransactions) {
        this.clientsTransactions = clientsTransactions;
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