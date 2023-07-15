//package com.example.bank.models;
//
//import java.io.Serializable;
//import java.util.Objects;
//
//public class ClientTransactionId implements Serializable {
//    private Client client;
//    private Transaction transaction;
//
//    private ClientTransactionId() {}
//
//    public ClientTransactionId(Client client, Transaction transaction) {
//        this.client = client;
//        this.transaction = transaction;
//    }
//
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (!(o instanceof ClientTransactionId that)) return false;
//        return Objects.equals(client, that.client) && Objects.equals(transaction, that.transaction);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(client, transaction);
//    }
//}