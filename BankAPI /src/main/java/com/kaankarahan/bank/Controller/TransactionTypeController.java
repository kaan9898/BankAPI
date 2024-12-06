package com.kaankarahan.bank.Controller;

import com.kaankarahan.bank.Business.Abstract.TransactionTypeManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/")
public class TransactionTypeController {
    private final TransactionTypeManager transactionTypeManager;
    @Autowired
    public TransactionTypeController(TransactionTypeManager transactionTypeManager) {
        this.transactionTypeManager = transactionTypeManager;
    }
}
