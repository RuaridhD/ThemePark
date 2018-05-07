public class Rollercoaster extends Ride {

    public Rollercoaster(String name, int price, int minHeight, int capacity) {
        super(name, price, minHeight, capacity);
    }

    public void checkIn(Customer customer){
        super.checkIn(customer);
    }

}

