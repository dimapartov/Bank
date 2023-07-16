package com.example.bank.repositories;

import com.example.bank.dtos.AccountDto;
import com.example.bank.models.Account;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AccountRepository extends JpaRepository<Account, Integer> {
    void deleteAccountByAccountNumber(Integer accountNumber);
    Account findAccountByAccountNumber(Integer accountNumber);
    List<Account> findAccountsByClientId(Integer id);
}