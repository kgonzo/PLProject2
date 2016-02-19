package hamer.account.business;

import hamer.account.interfaces.Depositable;
import hamer.account.interfaces.Withdrawable;

/**
 * Created by Cameron on 2/17/2016.
 */
public class Transactions {
    public static void deposit(Depositable account, double amount) {
        account.deposit(amount);
    }
    public static void withdraw(Withdrawable account, double amount) {
        account.withdraw(amount);
    }
}
