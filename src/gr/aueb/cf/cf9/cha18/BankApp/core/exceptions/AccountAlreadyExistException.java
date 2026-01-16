package gr.aueb.cf.cf9.cha18.BankApp.core.exceptions;

public class AccountAlreadyExistException extends Exception{

    public AccountAlreadyExistException(String message){
        super(message);
    }
}
