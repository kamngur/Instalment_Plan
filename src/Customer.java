import java.util.Scanner;

public class Customer {
    private static int nextId = 1;
    private int id = assignId();
    private String name;
    private String surname;

    public Customer(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public static int assignId() {
        int numberId = nextId;
        nextId++;
        return numberId;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    @Override
    public String toString() {
        return (this.id + " " + this.name + " " + this.surname);
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
        Customer customer = new Customer(name, surname);
        return customer;
    }
}
