package com.example.bank.repositories;

import com.example.bank.dtos.AccountClientInfoDto;
import com.example.bank.models.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AccountRepository extends JpaRepository<Account, Integer> {

    void deleteAccountByAccountNumber(Integer accountNumber);
    Account findAccountByAccountNumber(Integer accountNumber);
    List<Account> findAccountsByClientId(Integer id);

    @Query(value =
            "select new com.example.bank.dtos.AccountClientInfoDto( a.accountNumber, c.name, c.surname, a.balance) " +
            "from Client c " +
            "join c.accounts a " +
            "join c.clientTransactions ct " +
            "where ct.transaction.id=:id")
    List<AccountClientInfoDto> getAccountInfoByClientInTransactionById(@Param(value = "id") Integer id);

}