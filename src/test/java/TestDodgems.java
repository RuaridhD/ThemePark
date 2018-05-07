import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestDodgems {

    Dodgems dodgems;

    @Before
    public void before(){
        dodgems = new Dodgems("Destruction Derby", 3, 130, 2);
    }

    @Test
    public void getName() {
        assertEquals("Destruction Derby", dodgems.getName());
    }

    @Test
    public void getPrice(){
        assertEquals(3, dodgems.getPrice());
    }

    @Test
    public void getMinHeight() {
        assertEquals(130, dodgems.getMinHeight());
    }
}

