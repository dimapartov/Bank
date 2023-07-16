package com.example.bank.dtos;

import java.math.BigDecimal;
import java.time.Instant;
import java.util.Date;

public class AccountDto {

    private Integer id;
    private Integer accountNumber;
    private BigDecimal balance;
    private Date accountOpenDate;
    private ClientDto client;

//    public AccountDto(Integer accountNumber, Integer balance, String accountOpenDate) {
//        this.accountNumber = accountNumber;
//        this.balance = new BigDecimal(balance);
//        this.accountOpenDate = Date.from(Instant.parse(accountOpenDate));
//    }
    public AccountDto(Integer accountNumber, Integer balance) {
        this.accountNumber = accountNumber;
        this.balance = new BigDecimal(balance);
        Date currentDate = new Date();
        this.accountOpenDate = new Date(currentDate.getTime());
    }

    public AccountDto() {
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
                '}';
    }
}