package gr.aueb.cf.cf9.cha18.BankApp.DTO;

import java.math.BigDecimal;

public record AccountWithdrawDTO(String iban, BigDecimal amount) {
}
