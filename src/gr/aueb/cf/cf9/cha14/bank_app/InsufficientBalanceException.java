package gr.aueb.cf.cf9.cha14.bank_app;

public class InsufficientBalanceException extends Exception{

    public InsufficientBalanceException(String msg){
        super(msg);
    }
}
