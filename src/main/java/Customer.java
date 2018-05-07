public class Customer implements Booth{

    private int age;
    private int height;
    private int money;

    public Customer(int age, int height, int money) {
        this.age = age;
        this.height = height;
        this.money = money;
    }

    public int getAge() {
        return age;
    }

    public int getHeight() {
        return height;
    }

    public int getMoney() {
        return money;
    }

//    @Override
//    public String sellTicket(String response) {
//        return null;
//    }
}
