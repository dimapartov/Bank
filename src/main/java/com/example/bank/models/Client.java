package com.example.bank.models;

import jakarta.persistence.*;
import org.hibernate.annotations.Cascade;

import java.util.Set;

@Entity
@Table(name = "clients")
public class Client extends BaseEntity {
    private String surname;
    private String name;
    private String patronymic;
    private String phoneNuber;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "account")
    @Cascade(org.hibernate.annotations.CascadeType.ALL)
    private Set<Account> accounts;

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
}