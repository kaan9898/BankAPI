package com.kaankarahan.bank.Controller;
import com.kaankarahan.bank.Business.Abstract.AccountManager;
import com.kaankarahan.bank.Domain.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/api/")
public class AccountController {
    private final AccountManager accountManager;

    @Autowired
    public AccountController(AccountManager accountManager) {
        this.accountManager = accountManager;
    }
    @GetMapping("getAccountNumbers")
    public List<String> getAccountNumbers() {
        return accountManager.getAccountNumbers();
    }
    @GetMapping("getAccountTypes")
    public List<String> getAccountTypes() {
        return accountManager.getAccountTypes();
    }
    @GetMapping("getIban")
    public List<String> getIban() {
        return accountManager.getIban();
    }
    @GetMapping("getClosedDates")
    public List<Date> getClosedDates() {
        return accountManager.getClosedDate();
    }
    @GetMapping("getOpenedDates")
        public List<Date> getOpenedDates() {
        return accountManager.getOpenedDate();
    }

    @GetMapping("getAllAccountNumbers")
    List<Account> getAllAccountNumber(Integer personID) {
        return accountManager.getAllAccountNumberByPersonID(personID);
    }
    @GetMapping("getAllDates")
    List<Account> getAllDates(Integer personID) {
        return accountManager.getAllOpenedDatesAndClosedDatesByPersonID(personID);
    }
    @PostMapping("updateAccountNumberByPersonID")
    void updateAccountNumberByPersonID(@RequestParam(value = "accountNumber") String account_number, @RequestParam(value = "personID") Integer person_id) {
        accountManager.updateAccountNumberByPersonID(account_number,person_id);
    }
    @PostMapping("updateAccountTypeByPersonID")
     void updateAccountTypeByPersonID(@RequestParam(value = "personID") Integer person_id , @RequestParam(value = "accountType") String account_type) {
         accountManager.updateAccountTypeByPersonID(person_id, account_type);
    }
    @PutMapping("addNewData")
    void addNewData(@RequestBody Account account) {
        accountManager.addNewData(account.getPersonID());
    }
}