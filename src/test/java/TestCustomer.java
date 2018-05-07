import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestCustomer {

    Customer customer;
    Customer customer2;

    @Before
    public void before(){
        customer = new Customer(40, 170, 50);
        customer2 = new Customer(12, 120, 5);
    }

    @Test
    public void testGetAge(){
        assertEquals(12, customer2.getAge());
    }

    @Test
    public void testGetHeight(){
        assertEquals(170, customer.getHeight());
    }

    @Test
    public void testGetMoney(){
        assertEquals(50, customer.getMoney());
    }
}
