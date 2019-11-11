import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlaneTest {

    private Plane plane;

    @Before
    public void before(){
        plane = new Plane(Model.BOEING747);
    }

    @Test
    public void canGetModel(){
        assertEquals(Model.BOEING747, plane.getModel());
    }

    @Test
    public void canGetCapacity(){
        assertEquals(416, plane.getCapacity());
    }

    @Test
    public void canGetWeight() {
        assertEquals(333400, plane.getWeight());
    }


}
