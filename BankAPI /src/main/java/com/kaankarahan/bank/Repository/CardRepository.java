package com.kaankarahan.bank.Repository;
import com.kaankarahan.bank.Domain.Card;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CardRepository extends JpaRepository<Card, String> {
    @Query(value = "SELECT cardNumber FROM Card" )
    List<String> getCardNumbers();

}
