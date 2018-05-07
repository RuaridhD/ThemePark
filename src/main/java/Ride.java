import java.util.ArrayList;

public abstract class Ride implements Booth {

    private String name;
    private int price;
    private int minHeight;
    private int capacity;
    private ArrayList<Customer> customers;


    public Ride(String name, int price, int minHeight, int capacity){
        this.name = name;
        this.price = price;
        this.minHeight = minHeight;
        this.capacity = capacity;
        this.customers = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int getMinHeight() {
        return minHeight;
    }
    public int getCustomerCount(){
        return this.customers.size();
    }

    public int getCapacity() {
        return capacity;
    }

    public void checkIn(Customer customer){
            this.customers.add(customer);
    }
}
