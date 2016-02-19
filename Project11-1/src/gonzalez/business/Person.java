package gonzalez.business;

public abstract class Person {
    private String first_name;
    private String last_name;
    private String email;

    public Person() {
    }

    public void setFirstName(String first_name) {
        this.first_name  = first_name;
    }
    public String getFirstName(){
        return first_name;
    }

    public void setLastName(String last_name) {
        this.last_name  = last_name;
    }
    public String getLastName(){
        return last_name;
    }

    public void setEmail(String email) {
        this.email  = email;
    }
    public String getEmail(){
        return email;
    }

    @Override
    public String toString() {
        return "Name: " + first_name + " " + last_name + "\nEmail: " + email;
    }

    public abstract String getDisplayText();
}
