package com.example.bank.models;

import jakarta.persistence.*;
import org.hibernate.annotations.Cascade;

import java.util.List;

@Entity
@Table(name = "clients")
public class Client extends BaseEntity {
    private String surname;
    private String name;
    private String patronymic;
    private String phoneNumber;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "client")
    @Cascade(org.hibernate.annotations.CascadeType.ALL)
    private List<Account> accounts;

//    @OneToMany(fetch = FetchType.LAZY, mappedBy = "client")
//    @Cascade(org.hibernate.annotations.CascadeType.ALL)
//    private List<ClientTransaction> clientTransactions;


    protected Client() {
    }

    public Client(String surname, String name, String patronymic, String phoneNumber) {
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.phoneNumber = phoneNumber;
    }

    @Column(name = "surname", nullable = false)
    public String getSurname() {
        return surname;
    }

    @Column(name = "name", nullable = false)
    public String getName() {
        return name;
    }

    @Column(name = "patronymic", nullable = false)
    public String getPatronymic() {
        return patronymic;
    }

    @Column(name = "phone_number", nullable = false)
    public String getPhoneNumber() {
        return phoneNumber;
    }

    public List<Account> getAccounts() {
        return accounts;
    }

//    public List<ClientTransaction> getClientTransactions() {
//        return clientTransactions;
//    }

    @Override
    public String toString() {
        return "Client{" +
                "surname='" + surname + '\'' +
                ", name='" + name + '\'' +
                ", patronymic='" + patronymic + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", id=" + id +
                "} " + super.toString();
    }
}