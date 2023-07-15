package com.example.bank.dtos;

import java.math.BigDecimal;
import java.util.Date;

public class AccountDto {

    private Integer id;
    private Integer accountNumber;
    private BigDecimal balance;
    private Date accountOpenDate;
    private ClientDto client;

    public AccountDto(Integer accountNumber, BigDecimal balance, Date accountOpenDate) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.accountOpenDate = accountOpenDate;
    }

    public AccountDto() {
    }

    public AccountDto(Integer accountNumber, BigDecimal balance, Date accountOpenDate, ClientDto client) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.accountOpenDate = accountOpenDate;
        this.client = client;
    }

    public AccountDto(Integer id, Integer accountNumber, BigDecimal balance, Date accountOpenDate, ClientDto client) {
        this.id = id;
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.accountOpenDate = accountOpenDate;
        this.client = client;
    }

    public Integer getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(Integer accountNumber) {
        this.accountNumber = accountNumber;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public Date getAccountOpenDate() {
        return accountOpenDate;
    }

    public void setAccountOpenDate(Date accountOpenDate) {
        this.accountOpenDate = accountOpenDate;
    }

    public ClientDto getClient() {
        return client;
    }

    public void setClient(ClientDto client) {
        this.client = client;
    }

    public Integer getId() {
        return id;
    }

    @Override
    public String toString() {
        return "AccountDto{" +
                "id=" + id +
                ", accountNumber=" + accountNumber +
                ", balance=" + balance +
                ", accountOpenDate=" + accountOpenDate +
                ", client=" + client +
                '}';
    }
}