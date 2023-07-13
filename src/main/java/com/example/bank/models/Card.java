package com.example.bank.models;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "cards")
public class Card extends BaseEntity {

    private String cardType;
    private Long number;
    private Date validThru;

    @ManyToOne(optional = false)
    @JoinColumn(name = "account_id", referencedColumnName = "id", nullable=false)
    private Account account;

    protected Card() {
    }

    public Card(String cardType, Long number, Date validThru, Account account) {
        this.cardType = cardType;
        this.number = number;
        this.validThru = validThru;
        this.account = account;
    }

    @Column(name = "cardType", nullable = false)
    public String getCardType() {
        return cardType;
    }

    @Column(name = "number", nullable = false)
    public Long getNumber() {
        return number;
    }

    @Column(name = "validThru", nullable = false)
    public Date getValidThru() {
        return validThru;
    }

    public Account getAccount() {
        return account;
    }
}