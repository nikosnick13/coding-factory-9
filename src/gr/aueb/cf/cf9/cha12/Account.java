package gr.aueb.cf.cf9.cha12;

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
     * @throws Exception    if the amount is negative.
     */
    public void deposit (double amount) throws Exception{

        try {
            if(amount < 0) throw new Exception("The amount should be positive");
            balance += amount;
        } catch (Exception ex){
            System.err.println("Negative amount " + amount +" is not allowed \n" +  ex.getMessage());
            throw ex;
        }
    }

    /**
     * Withdraw the specified amount of money from the account
     * @param amount the amount of money to withdraw
     * @param ssn the ssn of the account holder
     * @throws Exception if  the amount is negative, the balance is insufficient
     */
    public void withdraw(double amount, String ssn) throws Exception{
        try {
            if(amount < 0) throw new Exception("The amount should be positive.");
            if(amount > balance) throw  new Exception("The balance is insufficient.");
            if(!isSsnValid(ssn)) throw new Exception("The ssn is not match");
            balance -= amount;

        } catch (Exception ex){

            System.err.println("Withdrawal failed. " + "\n" +  ex.getMessage());
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
