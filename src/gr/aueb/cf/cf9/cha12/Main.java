package gr.aueb.cf.cf9.cha12;

import java.awt.font.TextHitInfo;

/**
 *
 */
public class Main {

    public static void main(String[] args) {

        Account aliceAccount = new Account(1L, "GR12345", "Alice", "W.", "A12345", 100);

        try {
            aliceAccount.deposit(500);
            System.out.println(aliceAccount.accountToString());

            aliceAccount.withdraw(70, "A12345");
            System.out.println(aliceAccount.accountToString());

            aliceAccount.withdraw(70, "A2345");
            System.out.println(aliceAccount.accountToString());

        } catch (Exception ex) {
            System.err.println("Something get wrong \n" + ex.getMessage());
        }
    }
}
