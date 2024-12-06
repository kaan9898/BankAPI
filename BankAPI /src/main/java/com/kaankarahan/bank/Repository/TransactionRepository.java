package com.kaankarahan.bank.Repository;

import com.kaankarahan.bank.Domain.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionRepository extends JpaRepository<Transaction, Integer> {

}
