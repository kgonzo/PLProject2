package hamer.account.business;

import hamer.account.interfaces.Balanceable;
import hamer.account.interfaces.Depositable;
import hamer.account.interfaces.Withdrawable;

/**
 * Created by Cameron on 2/17/2016.
 */
public class Account implements Withdrawable, Balanceable, Depositable {
    public double balance;
    public void deposit(double amount) {
        if (amount > 10000) {
            System.out.println("Cannot Exceed Maximum Deposit ($10,000)");
        } else {
            balance = balance + amount;
        }
    }
    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient Funds");
        } else {
            balance = balance - amount;
        }
    }
    public double getBalance() {
        return(balance);
    }
    public String getBalanceFormatted() {
        return String.format("$%.2f",balance);
    }
}
