package gr.aueb.cf.cf9.cha18.BankApp.services;

import gr.aueb.cf.cf9.cha18.BankApp.DTO.AccountDepositDTO;
import gr.aueb.cf.cf9.cha18.BankApp.DTO.AccountInsertDTO;
import gr.aueb.cf.cf9.cha18.BankApp.DTO.AccountReadOnlyDTO;
import gr.aueb.cf.cf9.cha18.BankApp.DTO.AccountWithdrawDTO;
import gr.aueb.cf.cf9.cha18.BankApp.core.exceptions.InsufficientBalanceException;

import javax.security.auth.login.AccountNotFoundException;
import java.math.BigDecimal;
import java.util.List;

public interface IAccountService {

    AccountReadOnlyDTO crateNewAccount(AccountInsertDTO accountInsertDTO);
    void withdraw(AccountWithdrawDTO accountWithdrawDTO) throws InsufficientBalanceException, AccountNotFoundException;
    void deposit (AccountDepositDTO accountDepositDTO) throws  AccountNotFoundException;
    List<AccountReadOnlyDTO> getAllAccounts();
    BigDecimal getBalance(String iban) throws AccountNotFoundException;

}
