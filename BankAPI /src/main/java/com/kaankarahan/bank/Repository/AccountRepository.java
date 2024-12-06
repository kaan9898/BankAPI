package com.kaankarahan.bank.Repository;
import com.kaankarahan.bank.Domain.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

@Repository
public interface AccountRepository extends JpaRepository<Account, String> {

    //GETTING ROWS FROM DATA WITHOUT A DEPENDENCY
    @Query(value = "SELECT accountNumber FROM Account")
    List<String> getAllAccountNumbers();

    @Query(value = "SELECT accountType FROM Account")
    List<String> getAllAccountTypes();

    @Query(value = "SELECT iban FROM Account")
    List<String> getAllIban();

    @Query(value = "SELECT closedDate FROM Account")
    List<Date> getAllClosedDates();

    @Query(value = "SELECT openedDate FROM Account")
    List<Date> getAllOpenedDates();

    //-------------------------------------------------------------------------------------------------------------------------------------

    //GETTING & UPDATING  DATA WITH A SINGLE DEPENDENCY
    List<Account> getAllByPersonID(Integer personID);
    List<Account> getAccountDatesByPersonID(Integer personID);
    @Transactional
    @Modifying
    @Query(nativeQuery = true, value = "UPDATE Account SET account_number =:accountNumber WHERE person_id = :personID")
    void updateAccountNumberByPersonID(@Param("accountNumber") String account_number, @Param("personID") Integer person_id);

    @Transactional
    @Modifying
    @Query(nativeQuery = true, value = "UPDATE Account SET account_type = :accountType WHERE person_id = :personID ")
    void updateAccountTypeByPersonID(@Param("personID") Integer person_id, @Param("accountType") String account_type);

    @Transactional
    @Modifying
    @Query(nativeQuery = true, value = "UPDATE Account WHERE person_id= :personID")
    void addNewData(@Param("personID")Integer person_id);


    //-------------------------------------------------------------------------------------------------------------------------------------

    //GETTING & UPDATING DATA WITH MULTIPLE DEPENDENCIES
/*
    @Transactional
    @Modifying
    @Query
    void deleteAccountByPersonID(Integer person_id);
*/

}
