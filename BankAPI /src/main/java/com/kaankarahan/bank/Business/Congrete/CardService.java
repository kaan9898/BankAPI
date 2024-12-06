package com.kaankarahan.bank.Business.Congrete;
import com.kaankarahan.bank.Business.Abstract.CardManager;
import com.kaankarahan.bank.Domain.Card;
import com.kaankarahan.bank.Repository.CardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.Iterator;
import java.util.List;

@Service
public class CardService implements CardManager {

    private final CardRepository cardRepository;
    @Autowired
    public CardService(CardRepository cardRepository) {
        this.cardRepository = cardRepository;
    }

    @Override
    public List<String> getCardNumbers() {
        return cardRepository.getCardNumbers();
    }

    @Override
    public List<String> getCardTypes() {
        return List.of();
    }

    @Override
    public List<String> getAccountNumbers() {
        return List.of();
    }

    @Override
    public List<Date> getExpirationDates() {
        return List.of();
    }

    @Override
    public List<String> getCV2Numbers() {
        return List.of();
    }

    @Override
    public List<Integer> getLimit() {
        return List.of();
    }

    @Override
    public List<Date> getAccountCutOffPeriod() {
        return List.of();
    }
}
