package gr.aueb.cf.cf9.cha18.BankApp.DAO;

import gr.aueb.cf.cf9.cha18.BankApp.Models.Account;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

/**
 * In-memory implementation of IAccountDAO.
 *
 * Stores Account objects in a List and provides basic
 * CRUD operations without using a database.
 */
public class AccountDAOImpl implements IAccountDAO{

    List<Account> accounts = new ArrayList<>();

    @Override
    public Account saveOrUpdate(Account account) {

        int index = accounts.indexOf(account); // προιποθεση override equals

        if(index == -1){              // αν δεν υπάρχει
            accounts.add(account);    //τοτε κάνε insert
            return account;
        }
        accounts.set(index,account);  //τοτε κανε update
        return accounts.get(index);
    }

    @Override
    public void remove(String iban) {
        accounts.removeIf( account -> account.getIban().equals(iban));
    }

    @Override
    public Optional<Account> getByIban(String iban) {
        return accounts.stream()
                .filter( account -> account.getIban().equals(iban))
                .findFirst();
    }

    @Override
    public List<Account> getAllAccounts() {
        //return  new ArrayList<>(accounts);
        return Collections.unmodifiableList(accounts);
        //return  List.copyOf(accounts);
    }

    //TODO
    @Override
    public long count() {
        return accounts.size();
    }

    @Override
    public boolean isAccountExist(String iban) {
        return  accounts.stream()
                .anyMatch( account -> account.getIban().equals(iban));
    }
}
