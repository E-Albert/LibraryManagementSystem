// class named Patron that will hold the attributes and behaviors of the class.
public class Patron {
    //private attributes
    private int id;
    private String name;
    private String address;
    private double overdueFine;

    //constructor that initializes the attributes of the patron
    Patron(int id, String name, String address, double overdueFine) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.overdueFine = overdueFine;
    }

    //getters. methods that retrieve the private values
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public double getOverdueFine() {
        return overdueFine;
    }

    //setters. methods that change the value of private attributes
    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setOverdueFine(double overdueFine) {
        this.overdueFine = overdueFine;
    }
}

