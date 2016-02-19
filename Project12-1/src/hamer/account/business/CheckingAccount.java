package hamer.account.business;

/**
 * Created by Cameron on 2/17/2016.
 */
public class CheckingAccount extends Account {
    private double fee;

    public void subtractMonthlyFee() {
        balance = balance - fee;
    }
    public void setMonthlyFee(double monthlyFee) {
        fee = monthlyFee;
    }
    public double getMonthlyFee() {return fee;}
    public String getMonthlyFeeFormatted() {
        return String.format("$%.2f",fee);
    }

    //Constructor
    public CheckingAccount() {
        fee = 1.0;
        balance = 1000;
    }

}
