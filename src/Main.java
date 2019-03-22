import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Witaj!");
        int i = Customer.createProfile();
        if (i == 1) {
            Customer customer = Customer.createCustomer();
            System.out.println(customer);
        } else {
            if (i == 2) {
                System.exit(0);
            }
        }


    }

}
