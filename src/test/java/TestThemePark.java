import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class TestThemePark {


    ThemePark themePark;
    Customer customer1;
    Customer customer2;
    Rollercoaster rollercoaster;
    Dodgems dodgems;

    @Before
    public void before() {
        themePark = new ThemePark();
        rollercoaster = new Rollercoaster("Infinity", 5, 140, 5);
        dodgems = new Dodgems("Destruction Derby", 2, 120, 2);
        customer1 = new Customer(30, 150, 100);
        customer2 = new Customer(10, 120, 3);
        ArrayList<Rollercoaster> rollercoasters = new ArrayList<>();
        rollercoasters.add(rollercoaster);
    }

    @Test
    public void getCustomerAge(){
        assertEquals(30, customer1.getAge());
        assertEquals(10, customer2.getAge());
    }

    @Test
    public void getCustomerHeight(){
        assertEquals(150, customer1.getHeight());
    }

    @Test
    public void getCustomerMoney(){
        assertEquals(100, customer1.getMoney());
    }

    @Test
    public void getRollercoasterName() {
        assertEquals("Infinity", rollercoaster.getName());
    }

    @Test
    public void getRollercoasterPrice(){
        assertEquals(5, rollercoaster.getPrice());
    }

    @Test
    public void getRollercoasterMinHeight() {
        assertEquals(140, rollercoaster.getMinHeight());
    }

    @Test
    public void rollercoastersStartsEmpty(){
        assertEquals(0, themePark.getRollercoastersInThemePark());
    }

    @Test
    public void addRollerCoasterToPark(){
        themePark.addRollerCoasterToPark(rollercoaster);
        assertEquals(1, themePark.getRollercoastersInThemePark());
    }

    @Test
    public void testAddCustomerToRollercoaster(){
        themePark.addCustomerToRollercoaster(customer1, rollercoaster);
        assertEquals(1, rollercoaster.getCustomerCount());
    }



}
