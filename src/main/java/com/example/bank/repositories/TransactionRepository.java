package com.example.bank.repositories;

import com.example.bank.models.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TransactionRepository extends JpaRepository<Transaction, Integer> {
    @Query(value = "SELECT t FROM Client c JOIN c.clientTransactions ct JOIN ct.transaction t WHERE c.id = :id")
    List<Transaction> getAllTransactionsByClientId(@Param(value = "id") Integer id);
    Transaction getTransactionById(Integer id);
}