import java.util.Scanner;
import java.util.*;

public class Customer {
    private static int nextId = 1;
    private int id = assignId();
    private String name;
    private String surname;

    public Customer() { // konstruktor jest po to by zainicjować obiekt, wczytanie danych w konsoli powinno być w innym obiekcie np class ObjectLoader
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj imie:");
        this.name = scanner.next();
        System.out.println("Podaj nazwisko:");
        this.surname = scanner.next();
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
        return ("ID " + this.id + " " + this.name + " " + this.surname);
    }

    static int createProfile() { // logika wczytywnia danych z źródła powinna być rozdzielona od logiki obiektu
        Scanner scanner = new Scanner(System.in);
        int answer = 0;
        do {
            boolean isInputCorrect = true;
            do {
                try {
                    answer = scanner.nextInt();
                    isInputCorrect = false;
                } catch (InputMismatchException exp) {
                    //exp.printStackTrace();
                    System.err.println("Złe dane wejściowe."); // do logowania  polecam zerknąć na biblioteke log4j
                    scanner.nextLine();          //czyszczenie linii, be tego się zapętla
                    System.out.println("Wybierz ponownie:" + "\n" + "1. Utwórz profil." + "\n" + "2. Nie jestem zainteresowany/a."+ "\n"+"3. Przejdź dalej.");
                }
            } while (isInputCorrect);

            switch (answer) {
                case 1:
                    break;
                case 2:
                    System.out.println("Szkoda, że nie jesteś zainteresowany.");
                    break;
                case 3:
                    break;
                default:
                    System.out.println("Nie wybrałeś żadnego wariantu. Sprubój ponownie.");
                    break;
            }
        }
        while (answer != 1 && answer != 2 && answer != 3);
        return answer;
    }

    static ArrayList<Customer> createMoreProfile() {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Customer> listCustomer = new ArrayList<Customer>();
        System.out.println("Chcesz stworzyć profil?" + "\n" + "Wybierz:" + "\n" + "1. Utwórz profil." + "\n" + "2. Nie jestem zainteresowany/a."+ "\n"+"3. Przejdź dalej.");
        int i = 0;
        do {
            i = createProfile();
            if (i == 1) {
                Customer customer = new Customer();
                System.out.println("Profil: " + customer);
                System.out.println();
                listCustomer.add(customer);
            } else {
                if (i == 2) {
                    System.exit(0);
                }
                else {
                    break;
                }
            }
            System.out.println("Stworzyć kolejny?" + "\n" + "Wybierz:" + "\n" + "1. Tak, stwórz kolejny profil." + "\n" + "2. Nie, wychodzę z programu." + "\n" + "3. Nie, przechodzę dalej. ");

        } while (i==1);
        return listCustomer;
    }



}
