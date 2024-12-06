package com.kaankarahan.bank.Domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.Date;

@Table(name = "card")
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Builder
public class Card {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "card_number")
    private String cardNumber;
    @Column(name = "card_type")
    private String cardType;
    @Column(name = "account_number")
    private String accountNumber;
    @Column(name = "expiration_date")
    private Date expirationDate;
    @Column(name = "opened_date")
    private Date openedDate;
    @Column(name = "cv2")
    private String cv2Number;
    @Column(name = "limit")
    private Integer limit;
    @Column(name = "accountcutoff_period")
    private Date accountCutOffPeriod;

}
