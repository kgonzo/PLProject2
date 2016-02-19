package gonzalez.business;

public class Customer extends Person {
    private String customer_number;

    public Customer () {
    }

    public void setCustomerNumber(String customer_number) {
        this.customer_number = customer_number;
    }

    public String getCustomerNumber() {
        return customer_number;
    }

    @Override
    public String getDisplayText() {
        return super.toString() + " \nCustomer number: " + customer_number;
    }
}
