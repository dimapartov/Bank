package com.example.bank.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientTransactionRepository extends JpaRepository<ClientRepository, Integer> {
}
