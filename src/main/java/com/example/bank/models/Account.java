package com.example.bank.models;

import jakarta.persistence.*;
import org.hibernate.annotations.Cascade;

import java.math.BigDecimal;
import java.util.Date;
import java.util.Set;

@Entity
@Table(name = "accounts")
public class Account extends BaseEntity {
    private Integer accountNumber;
    private BigDecimal balance;
    private Date accountOpenDate;

    @ManyToOne(optional = false)
    @JoinColumn(name = "client_id", referencedColumnName = "id", nullable=false)
    private Client client;

    protected Account() {
    }

    public Account(Integer accountNumber, BigDecimal balance, Date accountOpenDate, Client client) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.accountOpenDate = accountOpenDate;
        this.client = client;
    }
    @Column(name = "account_number", nullable = false)
    public Integer getAccountNumber() {
        return accountNumber;
    }

    @Column(name = "balance", nullable = false)
    public BigDecimal getBalance() {
        return balance;
    }

    @Column(name = "accountOpenDate", nullable = false)
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
                ", client=" + client +
                ", id=" + id +
                "} " + super.toString();
    }
}