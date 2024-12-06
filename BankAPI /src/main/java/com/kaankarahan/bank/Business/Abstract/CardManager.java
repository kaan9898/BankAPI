package com.kaankarahan.bank.Business.Abstract;

import com.kaankarahan.bank.Domain.Card;

import java.util.Date;
import java.util.List;

public interface CardManager {
    List<String> getCardNumbers();
    List<String> getCardTypes();
    List<String> getAccountNumbers();
    List<Date> getExpirationDates();
    List<String> getCV2Numbers();
    List<Integer> getLimit();
    List<Date> getAccountCutOffPeriod();
}
