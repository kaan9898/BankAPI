package com.kaankarahan.bank.Business.Abstract;

import com.kaankarahan.bank.Domain.Account;

import java.util.Date;
import java.util.List;

public interface AccountManager {
    List<String> getAccountNumbers();
    List<String> getAccountTypes();
    List<String> getIban();
    List<Date> getClosedDate();
    List<Date> getOpenedDate();
    List<Account> getAllAccountNumberByPersonID(Integer personID);
    List<Account> getAllOpenedDatesAndClosedDatesByPersonID(Integer personID);
    void updateAccountNumberByPersonID(String account_number,Integer person_id);
    void updateAccountTypeByPersonID(Integer person_id,String account_type);
    void addNewData(Integer person_id);
}
