package com.example.bank.models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;

import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "accounts")
public class Account extends BaseEntity {

    @Column(name = "account_number", nullable = false)
    private Integer accountNumber;

    @Column(name = "balance", nullable = false)
    private BigDecimal balance;

    @Column(name = "accountOpenDate", nullable = false)
    private Date accountOpenDate;

    @ManyToOne(optional = false)
    @JoinColumn(name = "client_id", referencedColumnName = "id", nullable = false)
    @JsonBackReference
    private Client client;

    protected Account() {}

    public Account(Integer accountNumber, BigDecimal balance, Date accountOpenDate, Client client) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.accountOpenDate = accountOpenDate;
        this.client = client;
    }

    public Integer getAccountNumber() {
        return accountNumber;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public Date getAccountOpenDate() {
        return accountOpenDate;
    }

    public Client getClient() {
        return client;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Account{" +
                "accountNumber=" + accountNumber +
                ", balance=" + balance +
                ", accountOpenDate=" + accountOpenDate +
                ", id=" + id +
                "} " + super.toString();
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public void setAccountOpenDate(Date accountOpenDate) {
        this.accountOpenDate = accountOpenDate;
    }
}