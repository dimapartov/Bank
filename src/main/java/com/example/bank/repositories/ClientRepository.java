package com.example.bank.repositories;

import com.example.bank.models.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ClientRepository extends JpaRepository<Client, Integer> {

    Client findClientById(Integer id);

    @Query(value =
            "select distinct c from Client c join c.clientTransactions ct " +
            "where ct.client.id!=:id " +
            "and ct.transaction.id in (select ct.transaction.id from ClientTransaction ct " +
            "where ct.client.id=:id)")
    List<Client> getRelatedInTransactionClientsByClientId(@Param(value = "id") Integer id);
}