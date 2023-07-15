//package com.example.bank.models;
//
//import jakarta.persistence.*;
//
//import java.math.BigDecimal;
//import java.util.Date;
//import java.util.List;
//import java.util.Set;
//
//@Entity
//@Table(name = "transactions")
//public class Transaction extends BaseEntity {
//    private BigDecimal transactionAmount;
//    private Date date;
//    private String transactionType;
//
//    @OneToMany(fetch = FetchType.LAZY, mappedBy = "transaction")
//    private List<ClientTransaction> clientTransactions;
//
//    protected Transaction() {
//    }
//
//    public Transaction(BigDecimal transactionAmount, Date date, String transactionType) {
//        this.transactionAmount = transactionAmount;
//        this.date = date;
//        this.transactionType = transactionType;
//    }
//
//    @Column(name = "transactionAmount", nullable = false)
//    public BigDecimal getTransactionAmount() {
//        return transactionAmount;
//    }
//
//    @Column(name = "date", nullable = false)
//    public Date getDate() {
//        return date;
//    }
//
//    @Column(name = "transactionType", nullable = false)
//    public String getTransactionType() {
//        return transactionType;
//    }
//
//    public List<ClientTransaction> getClients() {
//        return clientTransactions;
//    }
//
//    @Override
//    public String toString() {
//        return "Transaction{" +
//                "transactionAmount=" + transactionAmount +
//                ", date=" + date +
//                ", transactionType='" + transactionType + '\'' +
//                ", id=" + id +
//                "} " + super.toString();
//    }
//}