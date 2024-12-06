package com.kaankarahan.bank.Controller;

import com.kaankarahan.bank.Business.Abstract.TransactionManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/")
public class TransactionController {
    private final TransactionManager transactionManager;
    @Autowired
    public TransactionController(TransactionManager transactionManager) {
        this.transactionManager = transactionManager;
    }
}
