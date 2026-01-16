package gr.aueb.cf.cf9.cha18.BankApp.core.mapper;

import gr.aueb.cf.cf9.cha18.BankApp.DTO.AccountInsertDTO;
import gr.aueb.cf.cf9.cha18.BankApp.DTO.AccountReadOnlyDTO;
import gr.aueb.cf.cf9.cha18.BankApp.Models.Account;

public class Mapper {

    public  Mapper(){

    }

    public static Account mapToModelEntity(AccountInsertDTO accountInsertDTO){
        return new Account(accountInsertDTO.iban(), accountInsertDTO.balance());
    }

    public static AccountReadOnlyDTO mapToReadOnlyDTO(Account account){
        return new AccountReadOnlyDTO(account.getIban(), account.getBalance() );
    }
}
