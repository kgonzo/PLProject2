package gonzalez.ui;

import gonzalez.business.Customer;
import gonzalez.business.Employee;
import gonzalez.business.Person;

public class PersonApp {

    public static void print(Person p) {
        System.out.print(p.getDisplayText());
    }

    public static void main(String[] args) {
        Console.displayLine("Welcome to the Person Tester application");
        Console.displayLine();

        Person p;
        String person_choice;
        String cont_choice = "y";
        String tempcont_choice;

        while (cont_choice.equalsIgnoreCase("y")) {

            person_choice = Console.getString("Create customer or employee? (c/e): ");
            Console.displayLine();
            if (person_choice.equalsIgnoreCase("c")) {
                Customer c = new Customer();
                c.setFirstName(Console.getString("Enter first name: "));
                c.setLastName(Console.getString("Enter last name: "));
                c.setEmail(Console.getString("Enter email address: "));
                c.setCustomerNumber(Console.getString("Customer number: "));

                p = c;
                Console.displayLine("\nYou entered: ");
                print(p);
                Console.displayLine();
            } else if (person_choice.equalsIgnoreCase("e")) {
                Employee e = new Employee();
                e.setFirstName(Console.getString("Enter first name: "));
                e.setLastName(Console.getString("Enter last name: "));
                e.setEmail(Console.getString("Enter email address: "));
                e.setSSNumber(Console.getString("Social security number: "));

                p = e;
                Console.displayLine("\nYou entered: ");
                print(p);
                Console.displayLine();
            } else {
                Console.displayLine("Invalid response.");
            }

            Console.displayLine();
            tempcont_choice = Console.getString("Continue? (y/n): ");
            Console.displayLine();

            while (!tempcont_choice.equalsIgnoreCase("y") && !tempcont_choice.equalsIgnoreCase("n")) {
                Console.displayLine("Invalid response.");
                Console.displayLine();
                tempcont_choice = Console.getString("Continue? (y/n): ");
                Console.displayLine();
            }
        }
    }
}