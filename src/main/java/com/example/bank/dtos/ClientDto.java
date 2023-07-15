package com.example.bank.dtos;

import java.util.List;
import java.util.Set;

public class ClientDto {

    private Integer id;
    private String surname;
    private String name;
    private String patronymic;
    private String phoneNumber;

//    private List<ClientTransactionDto> clientTransactions;

    public ClientDto() {
    }

//    public ClientDto(String surname, String name, String patronymic, String phoneNumber,
//                     List<AccountDto> accounts, List<ClientTransactionDto> clientTransactions) {
//        this.surname = surname;
//        this.name = name;
//        this.patronymic = patronymic;
//        this.phoneNumber = phoneNumber;
//        this.accounts = accounts;
//        this.clientTransactions = clientTransactions;
//    }
//    public ClientDto(String surname, String name, String patronymic, String phoneNumber,
//                     List<AccountDto> accounts) {
//        this.surname = surname;
//        this.name = name;
//        this.patronymic = patronymic;
//        this.phoneNumber = phoneNumber;
////        this.accounts = accounts;
//    }

    public ClientDto(String surname, String name, String patronymic, String phoneNumber) {
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.phoneNumber = phoneNumber;
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


//
//    public void setAccounts(List<AccountDto> accounts) {
//        this.accounts = accounts;
//    }

//    public List<ClientTransactionDto> getClientTransactions() {
//        return clientTransactions;
//    }
//
//    public void setClientTransactions(List<ClientTransactionDto> clientTransactions) {
//        this.clientTransactions = clientTransactions;
//    }

    public Integer getId() {
        return id;
    }

    @Override
    public String toString() {
        return "ClientDto{" +
                "surname='" + surname + '\'' +
                ", name='" + name + '\'' +
                ", patronymic='" + patronymic + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", id=" + id +
                "} ";
    }
}