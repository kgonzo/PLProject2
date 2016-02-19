package gonzalez.business;

public class Employee extends Person {
    private String ss_number;

    public Employee () {
    }

    public void setSSNumber(String ss_number) {
        this.ss_number = ss_number;
    }

    public String getSSNumber() {
        return ss_number;
    }

    @Override
    public String getDisplayText() {
        return super.toString() + " \nSocial security number: " + ss_number;
    }
}
