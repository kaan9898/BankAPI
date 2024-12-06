package com.kaankarahan.bank.Domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Table(name = "transaction")
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Builder
public class Transaction {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "transaction_id")
    private Integer transactionId;
    @Column(name = "amount")
    private Double amount;
    @Column(name = "account_id")
    private Integer accountId;
    @Column(name = "person_id")
    private Integer personID;
    @Column(name = "currency")
    private String currency;
    @Column(name = "from_iban")
    private String fromIban;
    @Column(name = "to_iban")
    private String toIban;
    @Column(name = "transaction_type")
    private String transactionType;
}
