public abstract class Ride {

    private String name;
    private int price;
    private int minHeight;

    public Ride(String name, int price, int minHeight){
        this.name = name;
        this.price = price;
        this.minHeight = minHeight;
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
}
