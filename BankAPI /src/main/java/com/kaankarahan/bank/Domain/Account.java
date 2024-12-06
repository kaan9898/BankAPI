package com.kaankarahan.bank.Domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.Date;
import java.util.List;

@Table(name = "account")
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Builder
public class Account {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "account_number")
    private String accountNumber;
    @Column(name = "account_type")
    private String accountType;
    @Column(name = "iban")
    private String iban;
    @Column(name = "closed_date")
    private Date closedDate;
    @Column(name = "person_id")
    private Integer personID;
    @Column(name = "opened_date")
    private Date openedDate;

    @OneToMany
    @JoinColumn(name = "account_number", insertable = false, updatable = false)
    private List<Card> card;

    @OneToMany
    @JoinColumn(name = "person_id", insertable = false, updatable = false)
    private List<Transaction> transaction;

}
