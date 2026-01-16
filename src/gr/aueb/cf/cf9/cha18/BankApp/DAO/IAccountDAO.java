package gr.aueb.cf.cf9.cha18.BankApp.DAO;

import gr.aueb.cf.cf9.cha18.BankApp.Models.Account;

import java.util.List;
import java.util.Optional;

/**
 * Data Access Object (DAO) interface for Account entities.
 *
 * Provides CRUD operations and query methods for managing
 * Account persistence.
 */
public interface IAccountDAO {

    Account saveOrUpdate(Account account);

    void remove(String iban);

   Optional<Account> getByIban(String iban);

   List<Account> getAllAccounts();

   long count();

   //Queries
    boolean isAccountExist(String iban);

}
