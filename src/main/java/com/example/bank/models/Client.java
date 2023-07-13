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
    private String phoneNuber;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "client")
    @Cascade(org.hibernate.annotations.CascadeType.ALL)
    private Set<Account> accounts;

    @ManyToMany(cascade = {CascadeType.PERSIST,CascadeType.MERGE})
    @JoinTable(name = "client_transaction",
            joinColumns = @JoinColumn(name = "client_id"),
            inverseJoinColumns = @JoinColumn(name = "transaction_id"))
    private Set<Transaction> transactions = new HashSet<>();


    protected Client() {
    }

    public Client(String surname, String name, String patronymic, String phoneNuber) {
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.phoneNuber = phoneNuber;
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
        return phoneNuber;
    }

    public Set<Account> getAccounts() {
        return accounts;
    }

    public Set<Transaction> getTransactions() {
        return transactions;
    }

    public void addTransaction(Transaction transaction) {
        this.transactions.add(transaction);
        transaction.getClients().add(this);
    }
}