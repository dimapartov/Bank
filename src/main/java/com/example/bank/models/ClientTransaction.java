//package com.example.bank.models;
//
//import jakarta.persistence.*;
//
//@Entity
//@IdClass(ClientTransactionId.class)
//@Table(name = "client_transaction")
//public class ClientTransaction {
//
//    @Id
//    @ManyToOne
//    @JoinColumn(name = "client_id", referencedColumnName = "id")
//    private Client client;
//
//    @Id
//    @ManyToOne
//    @JoinColumn(name = "transaction_id", referencedColumnName = "id")
//    private Transaction transaction;
//
//    protected ClientTransaction() {
//    }
//
//    public ClientTransaction(Client clients, Transaction transactions) {
//        this.client = clients;
//        this.transaction = transactions;
//    }
//
//    public Client getClient() {
//        return client;
//    }
//
//    public Transaction getTransaction() {
//        return transaction;
//    }
//
////    @Column(name = "client_id", nullable = false)
////    public Client getClients() {
////        return client;
////    }
////
////    @Column(name = "transaction_id", nullable = false)
////    public Transaction getTransactions() {
////        return transaction;
////    }
//}