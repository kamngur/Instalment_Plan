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

}
