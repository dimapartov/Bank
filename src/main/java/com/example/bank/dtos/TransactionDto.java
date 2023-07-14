package com.example.bank.dtos;

import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class TransactionDto {
    private BigDecimal transactionAmount;
    private Date date;
    private String transactionType;
    private Set<ClientTransactionDto> clientsTransactions = new HashSet<>();

    public TransactionDto() {
    }

    public TransactionDto(BigDecimal transactionAmount, Date date, String transactionType, Set<ClientTransactionDto> clientsTransactions) {
        this.transactionAmount = transactionAmount;
        this.date = date;
        this.transactionType = transactionType;
        this.clientsTransactions = clientsTransactions;
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

    public Set<ClientTransactionDto> getClientsTransactions() {
        return clientsTransactions;
    }

    public void setClientsTransactions(Set<ClientTransactionDto> clientsTransactions) {
        this.clientsTransactions = clientsTransactions;
    }

    @Override
    public String toString() {
        return "TransactionDto{" +
                "transactionAmount=" + transactionAmount +
                ", date=" + date +
                ", transactionType='" + transactionType + '\'' +
                ", clientsTransactions=" + clientsTransactions +
                '}';
    }
}
