package gr.aueb.cf.cf9.cha14.bank_app;

public class NegativeAmountException extends Exception {

    public NegativeAmountException(String message){
        super(message);
    }
}
