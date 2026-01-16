package gr.aueb.cf.cf9.cha18.BankApp.Models;

/**
 * This class is Java Bean and represent a Account
 * for the bank_app
 *
 */

import java.math.BigDecimal;
import java.util.Objects;

public class Account {
    private String iban;
    private BigDecimal balance;

    public Account(){

    }

    public Account(String iban, BigDecimal balance) {
        this.iban = iban;
        this.balance = balance;
    }

    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal BigDecimal) {
        this.balance = balance;
    }

    @Override
    public boolean equals(Object other) {
        if(!(other instanceof Account account )) return false;
        return Objects.equals(this.getIban(),account.iban);
    }

    @Override
    public int hashCode() {
        return Objects.hash(iban, balance);
    }

    @Override
    public String toString() {
        return "Account{" +
                "iban='" + iban + '\'' +
                ", balance=" + balance +
                '}';
    }
}
