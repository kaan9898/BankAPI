package com.kaankarahan.bank.Business.Congrete;

import com.kaankarahan.bank.Business.Abstract.TransactionTypeManager;
import com.kaankarahan.bank.Repository.TransactionTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TransactionTypeService implements TransactionTypeManager {

    private final TransactionTypeRepository transactionTypeRepository;
    @Autowired
    public TransactionTypeService(TransactionTypeRepository transactionTypeRepository) {
        this.transactionTypeRepository = transactionTypeRepository;
    }
}
