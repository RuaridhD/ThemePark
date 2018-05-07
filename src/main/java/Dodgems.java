public class Dodgems extends Ride{

    public Dodgems(String name, int price, int minHeight, int capacity) {
        super(name, price, minHeight, capacity);
    }

    public void checkIn(Customer customer){
        super.checkIn(customer);
    }
}