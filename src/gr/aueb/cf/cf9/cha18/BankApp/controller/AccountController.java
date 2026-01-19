package gr.aueb.cf.cf9.cha18.BankApp.controller;

import gr.aueb.cf.cf9.cha18.BankApp.DTO.AccountInsertDTO;
import gr.aueb.cf.cf9.cha18.BankApp.DTO.AccountReadOnlyDTO;
import gr.aueb.cf.cf9.cha18.BankApp.core.exceptions.ValidationException;
import gr.aueb.cf.cf9.cha18.BankApp.services.AccountServiceImp;
import gr.aueb.cf.cf9.cha18.BankApp.services.IAccountService;

import java.math.BigDecimal;

public class AccountController {

    private final IAccountService accountService;

    public AccountController(IAccountService accountService){
        this.accountService = accountService;
    }

    public AccountReadOnlyDTO createNewAccount(String iban, BigDecimal balance) throws ValidationException {

        AccountInsertDTO insertDTO = new AccountInsertDTO(iban, balance);

//        TODO: validation package
        return accountService.crateNewAccount(insertDTO);


    }

}
