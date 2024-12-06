package com.kaankarahan.bank.Business.Congrete;

import com.kaankarahan.bank.Business.Abstract.AccountManager;
import com.kaankarahan.bank.Domain.Account;
import com.kaankarahan.bank.Domain.Card;
import com.kaankarahan.bank.Repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
@Service
public class AccountService implements AccountManager {

    private final AccountRepository accountRepository;

    @Autowired
    public AccountService(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    @Override
    public List<String> getAccountNumbers() {
        return accountRepository.getAllAccountNumbers();
    }

    @Override
    public List<String> getAccountTypes() {
        return accountRepository.getAllAccountTypes();
    }

    @Override
    public List<String> getIban() {
        return accountRepository.getAllIban();
    }

    @Override
    public List<Date> getClosedDate() {
        return accountRepository.getAllClosedDates();
    }

    @Override
    public List<Date> getOpenedDate() {
        return accountRepository.getAllOpenedDates();
    }

    @Override
    public List<Account> getAllAccountNumberByPersonID(Integer personID) {
        return accountRepository.getAllByPersonID(personID);
    }

    @Override
    public List<Account> getAllOpenedDatesAndClosedDatesByPersonID(Integer personID) {
        return accountRepository.getAccountDatesByPersonID(personID);
    }

    @Override
    public void updateAccountNumberByPersonID( String account_number,Integer person_id) {
        accountRepository.updateAccountNumberByPersonID(account_number,person_id);
    }

    @Override
    public void updateAccountTypeByPersonID(Integer person_id, String account_type) {
        accountRepository.updateAccountTypeByPersonID(person_id, account_type);
    }

    @Override
    public void addNewData(Integer person_id) {
        accountRepository.addNewData(person_id);
    }

}
