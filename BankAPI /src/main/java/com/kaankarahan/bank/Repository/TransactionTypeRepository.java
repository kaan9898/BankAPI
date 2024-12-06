package com.kaankarahan.bank.Repository;

import com.kaankarahan.bank.Domain.TransactionType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionTypeRepository extends JpaRepository<TransactionType, String> {
}
