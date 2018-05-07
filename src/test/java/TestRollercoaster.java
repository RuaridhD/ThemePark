import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestRollercoaster {

    Rollercoaster rollercoaster;

    @Before
    public void before(){
        rollercoaster = new Rollercoaster("Dragonfly", 5, 150, 2);
    }

    @Test
    public void getName() {
        assertEquals("Dragonfly", rollercoaster.getName());
    }

    @Test
    public void getPrice(){
        assertEquals(5, rollercoaster.getPrice());
    }

    @Test
    public void getMinHeight() {
        assertEquals(150, rollercoaster.getMinHeight());
    }
}
