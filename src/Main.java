import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Witaj!");
        ArrayList<Customer> listCustomer = new ArrayList<Customer>();
        listCustomer = Customer.createMoreProfile();
        System.out.println("Lista Klientów: " + listCustomer.subList(0,listCustomer.size()));



    }

}
