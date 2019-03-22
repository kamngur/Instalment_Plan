import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Witaj!");
        int i = createProfile();
        if (i == 1) {
            Customer customer = createCustomer();
            System.out.println(customer);
        }

    }


    static int createProfile() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Chcesz stworzyć profil?" + "\n" + "Wybierz:" + "\n" + "1. Utwórz profil." + "\n" + "2. Nie jestem zainteresowany/a."+ "\n"+"3. Przejdź dalej.");
        int answer = 0;
        do {
            answer = scanner.nextInt();
            switch (answer) {
                case 1:
                    break;
                case 2:
                    System.out.println("Szkoda, że nie jesteś zainteresowany.");
                    break;
                case 3:
                    break;
                default:
                    System.out.println("Nie wybrałeś, żadnego wariantu. Sprubój ponownie.");
                    break;
            }
        }
        while (answer != 1 && answer != 2 && answer != 3);
        return answer;
    }

    static Customer createCustomer() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj imie:");
        String name = scanner.nextLine();
        System.out.println("Podaj nazwisko:");
        String surname = scanner.nextLine();
        Customer customer = new Customer(name,surname);
        return customer;
    }
}
