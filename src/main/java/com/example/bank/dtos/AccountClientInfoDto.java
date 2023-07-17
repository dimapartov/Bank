package com.example.bank.dtos;

import java.math.BigDecimal;

public class AccountClientInfoDto {

    private Integer accountNumber;
    private String name;
    private String surname;
    private BigDecimal balance;

    public AccountClientInfoDto(Integer accountNumber, String name, String surname, BigDecimal balance) {
        this.accountNumber = accountNumber;
        this.name = name;
        this.surname = surname;
        this.balance = balance;
    }

    public AccountClientInfoDto() {
    }

    @Override
    public String toString() {
        return "AccountClientInfoDto{" +
                "accountNumber=" + accountNumber +
                ", balance='" + balance + '\'' +
                ", name='" + name + '\'' +
                ", surname=" + surname +
                '}';
    }

    public Integer getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(Integer accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }
}