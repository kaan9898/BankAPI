package com.kaankarahan.bank.Domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Table(name = "transaction_type")
@AllArgsConstructor
@Entity
@NoArgsConstructor
@Data
@Builder
public class TransactionType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "transactiontype_name")
    private String transactionTypeName;
    @Column(name = "transactiontype_id")
    private Integer transactionTypeId;
}
