package com.example.bank.dtos;

import java.util.Set;

public class ClientDto {

    private String surname;
    private String name;
    private String patronymic;
    private String phoneNumber;
    private Set<AccountDto> accounts;
    private Set<ClientTransactionDto> clientTransactions;

    public ClientDto() {
    }

    public ClientDto(String surname, String name, String patronymic, String phoneNumber, Set<AccountDto> accounts,
                     Set<ClientTransactionDto> clientTransactions) {
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.phoneNumber = phoneNumber;
        this.accounts = accounts;
        this.clientTransactions = clientTransactions;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Set<AccountDto> getAccounts() {
        return accounts;
    }

    public void setAccounts(Set<AccountDto> accounts) {
        this.accounts = accounts;
    }

    public Set<ClientTransactionDto> getClientTransactions() {
        return clientTransactions;
    }

    public void setClientTransactions(Set<ClientTransactionDto> clientTransactions) {
        this.clientTransactions = clientTransactions;
    }

    @Override
    public String toString() {
        return "ClientDto{" +
                "surname='" + surname + '\'' +
                ", name='" + name + '\'' +
                ", patronymic='" + patronymic + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", accounts=" + accounts +
                ", clientTransactions=" + clientTransactions +
                '}';
    }
}
