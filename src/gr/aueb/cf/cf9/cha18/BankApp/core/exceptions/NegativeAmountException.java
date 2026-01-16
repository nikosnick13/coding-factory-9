package gr.aueb.cf.cf9.cha18.BankApp.core.exceptions;

public class NegativeAmountException extends Exception{

    public NegativeAmountException(String message){
        super(message);
    }
}
