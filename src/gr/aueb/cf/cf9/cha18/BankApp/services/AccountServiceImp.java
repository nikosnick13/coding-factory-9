package gr.aueb.cf.cf9.cha18.BankApp.services;

import gr.aueb.cf.cf9.cha18.BankApp.DAO.IAccountDAO;
import gr.aueb.cf.cf9.cha18.BankApp.DTO.AccountDepositDTO;
import gr.aueb.cf.cf9.cha18.BankApp.DTO.AccountInsertDTO;
import gr.aueb.cf.cf9.cha18.BankApp.DTO.AccountReadOnlyDTO;
import gr.aueb.cf.cf9.cha18.BankApp.DTO.AccountWithdrawDTO;
import gr.aueb.cf.cf9.cha18.BankApp.Models.Account;
import gr.aueb.cf.cf9.cha18.BankApp.core.exceptions.InsufficientBalanceException;
import gr.aueb.cf.cf9.cha18.BankApp.core.mapper.Mapper;

import javax.security.auth.login.AccountNotFoundException;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

public class AccountServiceImp implements IAccountService{

    private final IAccountDAO accountDAO;

    public AccountServiceImp(IAccountDAO accountDAO){

        this.accountDAO = accountDAO;
    }

    @Override
    public AccountReadOnlyDTO createNewAccount(AccountInsertDTO accountInsertDTO) {

        Account account = Mapper.mapToModelEntity(accountInsertDTO);
        account = accountDAO.saveOrUpdate(account);
        return Mapper.mapToReadOnlyDTO(account);
    }

    @Override
    public void withdraw(AccountWithdrawDTO withdrawDTO) throws InsufficientBalanceException, AccountNotFoundException {
        try {
            Account account = accountDAO.findByIban(withdrawDTO.iban())
                    .orElseThrow(() -> new AccountNotFoundException("Account with iban " + withdrawDTO.iban() + " not found!"));
            if(withdrawDTO.amount().compareTo(account.getBalance()) < 0){
                throw new InsufficientBalanceException("Invalid amount " + withdrawDTO.amount() + " for account with iban "
                        + withdrawDTO.iban() + " was greater than the balance");
            };
            account.setBalance(account.getBalance().subtract(withdrawDTO.amount()));
            accountDAO.saveOrUpdate(account);
            // Logging
        }catch (InsufficientBalanceException ex){
            System.err.printf("%s. The amount=%f is greater then the balance of the account with iban=%s. \n",
                    LocalDateTime.now(), withdrawDTO.amount(), withdrawDTO.iban());
            throw ex;
        }catch (AccountNotFoundException ex){
            System.err.printf("%s The iban=%s is not fount! \n", LocalDateTime.now(), withdrawDTO.iban());
            throw ex;
        }
    }

    @Override
    public void deposit(AccountDepositDTO accountDepositDTO) throws AccountNotFoundException {

        try {
            Account account = accountDAO.findByIban(accountDepositDTO.iban())
                    .orElseThrow( () -> new AccountNotFoundException("Account with iban " + accountDepositDTO.iban() + "not fount"));
            account.setBalance(account.getBalance().add(accountDepositDTO.amount()));
            accountDAO.saveOrUpdate(account);
          // Logging CAPTURE

        }catch (AccountNotFoundException ex){
            System.err.printf("%s The iban=%s is not fount! \n", LocalDateTime.now(), accountDepositDTO.iban());
            throw ex;
        }
    }

    @Override
    public List<AccountReadOnlyDTO> getAllAccounts() {

        return accountDAO.getAllAccounts().stream()
                .map(Mapper::mapToReadOnlyDTO)
                .toList();
    }

    @Override
    public BigDecimal getBalance(String iban) throws AccountNotFoundException {
        try {
            Account account = accountDAO.findByIban(iban)
                    .orElseThrow( () -> new AccountNotFoundException("Account with iban " + iban + "not fount"));
           return account.getBalance();
        }catch (AccountNotFoundException ex){
            System.err.printf("%s The iban=%s is not fount! \n", LocalDateTime.now(),iban);
            throw ex;
        }
    }
}
