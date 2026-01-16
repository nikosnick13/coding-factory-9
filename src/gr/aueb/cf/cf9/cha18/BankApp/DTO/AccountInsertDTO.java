package gr.aueb.cf.cf9.cha18.BankApp.DTO;

public record AccountInsertDTO(String iban, double balance) {
}

//public class AccountInsertDTO {
//    private String iban;
//    private double balance;
//
//    public AccountInsertDTO() {
//
//    }
//
//    public AccountInsertDTO(String iban, double balance) {
//        this.iban = iban;
//        this.balance = balance;
//    }
//
//    public String getIban() {
//        return iban;
//    }
//
//    public void setIban(String iban) {
//        this.iban = iban;
//    }
//
//    public double getBalance() {
//        return balance;
//    }
//
//    public void setBalance(double balance) {
//        this.balance = balance;
//    }
//}