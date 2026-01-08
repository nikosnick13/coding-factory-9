package gr.aueb.cf.cf9.cha14.bank_app;

public class SsnNotValidException extends Exception{

    public  SsnNotValidException(String msg){
        super(msg);
    }
}
