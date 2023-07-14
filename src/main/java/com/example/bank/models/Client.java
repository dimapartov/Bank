package com.example.bank.models;

import jakarta.persistence.*;
import org.hibernate.annotations.Cascade;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "clients")
public class Client extends BaseEntity {
    private String surname;
    private String name;
    private String patronymic;
    private String phoneNumber;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "client")
    @Cascade(org.hibernate.annotations.CascadeType.ALL)
    private Set<Account> accounts;

    @OneToMany(mappedBy = "client", cascade = {CascadeType.PERSIST,CascadeType.MERGE})
    private Set<ClientTransaction> clientTransactions = new HashSet<>();


    protected Client() {
    }

    public Client(String surname, String name, String patronymic, String phoneNuber) {
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.phoneNumber = phoneNuber;
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
    public String getPhoneNuber() {
        return phoneNumber;
    }

    public Set<Account> getAccounts() {
        return accounts;
    }

    public Set<ClientTransaction> getClientTransactions() {
        return clientTransactions;
    }

    @Override
    public String toString() {
        return "Client{" +
                "surname='" + surname + '\'' +
                ", name='" + name + '\'' +
                ", patronymic='" + patronymic + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", accounts=" + accounts +
                ", clientTransactions=" + clientTransactions +
                ", id=" + id +
                "} " + super.toString();
    }
}