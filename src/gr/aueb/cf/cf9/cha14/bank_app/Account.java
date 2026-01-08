package gr.aueb.cf.cf9.cha14.bank_app;

import java.time.LocalDateTime;

/**
 *  Bean Java Class for Account
 */
public class Account {

    private long id;
    private String iban;
    private String firstname;
    private String lastname;
    private String ssn;
    private double balance;

    public Account(){

    }

    public Account(long id, String iban, String firstname, String lastname, String ssn, double balance) {
        this.id = id;
        this.iban = iban;
        this.firstname = firstname;
        this.lastname = lastname;
        this.ssn = ssn;
        this.balance = balance;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    // Public API

    /**
     * Deposits the specified amount of money into the account.
     *
     * @param amount        the amount of money to deposit.
     * @throws {@link NegativeAmountException} if the amount is negative.
     */
    public void deposit (double amount) throws NegativeAmountException{

        try {
            if(amount < 0) throw new NegativeAmountException("The amount " + amount +" should be positive");
            balance += amount;
        } catch (NegativeAmountException ex){
            System.err.println("Negative amount " + amount +" is not allowed \n" +  ex.getMessage());
            throw ex;
        }
    }

    /**
     * Withdraw the specified amount of money from the account
     * @param amount the amount of money to withdraw
     * @param ssn the ssn of the account holder
     * @throws {@link NegativeAmountException}
     *                          if  the amount is negative
     * @throws {@link InsufficientBalanceException}
     *                          if the balance is insufficient
     * @throws {@link SsnNotValidException }
     *                          if the ssn in not valid
     */
    public void withdraw(double amount, String ssn) throws NegativeAmountException, InsufficientBalanceException,SsnNotValidException{
        try {
            if(amount < 0) throw new NegativeAmountException("The amount " + amount + " mast be not negative");
            if(amount > balance) throw  new InsufficientBalanceException("The balance " + balance + "is insufficient.");
            if(!isSsnValid(ssn)) throw new SsnNotValidException("The ssn= " + ssn + " is not valid");
            balance -= amount;

        } catch (NegativeAmountException | SsnNotValidException | InsufficientBalanceException ex){

            System.err.println(LocalDateTime.now() + "\n" + ex.getMessage());
            throw ex;
        }
    }

    /**
     *  Return the current balance of the account.
     * @return the current  account balance.
     */
    public double getAccountBalance(){
        return getBalance();
    }

    /**
     * Returns the state of the account as a string.
     * @return  the string representation of the {@link Account} object.
     */
    public String accountToString(){
        return "Account Id:" + id + " IBAN: " + iban + " Firstname: " + firstname +
                " Lastname: " + lastname + "SSN: " + ssn + " Balance: " + balance;
    }

    private boolean isSsnValid(String ssn){
        return  this.ssn.equals(ssn) ;
    }
}
