package gr.aueb.cf.cf9.cha18.BankApp.DTO;

import java.math.BigDecimal;

public record AccountReadOnlyDTO(String iban, BigDecimal balance) {

    @Override
    public String toString() {
        return "IBAN: " + iban + ", Balance: " + balance;
    }
}
