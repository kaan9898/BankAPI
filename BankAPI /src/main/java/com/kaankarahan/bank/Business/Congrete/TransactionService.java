package com.kaankarahan.bank.Business.Congrete;

import com.kaankarahan.bank.Business.Abstract.TransactionManager;
import com.kaankarahan.bank.Domain.Transaction;
import com.kaankarahan.bank.Repository.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TransactionService implements TransactionManager {

    private final TransactionRepository transactionRepository;
    @Autowired
    public TransactionService(TransactionRepository transactionRepository) {
        this.transactionRepository = transactionRepository;
    }
}
