package hamer.account.ui;

import hamer.account.business.CheckingAccount;
import hamer.account.business.Transactions;

/**
 * Created by Cameron on 2/17/2016.
 */

public class AccountApp {
    public static void main(String[] args) {
        System.out.println("Welcome to the Account Calculator\n");
        System.out.println("Starting Balance");

        CheckingAccount account = new CheckingAccount();

        System.out.println("Checking: " + account.getBalanceFormatted() + "\n");

        System.out.println("Enter the transactions for the month");

        String cont = "y";
        String trans;
        while("y".equals(cont)) {
            trans = Console.getString("\nWithdrawal or deposit? (w/d): ");
            if("w".equals(trans)) {
                double amount = Console.getDouble("Amount: ");
                Transactions.withdraw(account,amount);
            } else if("d".equals(trans)){
                double amount = Console.getDouble("Amount: ");
                Transactions.deposit(account,amount);
            } else {
                System.out.println("Error! Unexpected Input.\n");
            }
            cont = Console.getString("\nContinue? (y/n): ");
        }
        System.out.println("\nMonthly Fees\nChecking fee:\t"+account.getMonthlyFeeFormatted());
        System.out.println("\nFinal Balance\nChecking: "+account.getBalanceFormatted());

    }
}
