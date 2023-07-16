package com.example.bank.repositories;

import com.example.bank.models.ClientTransaction;
import com.example.bank.models.ClientTransactionId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientTransactionRepository extends JpaRepository<ClientTransaction, ClientTransactionId> {
}