import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PassengerTest {

    private Passenger passenger;

    @Before
    public void before(){
        passenger = new Passenger("Denpok", 4);
    }

    @Test
    public void canCheckName(){
        assertEquals("Denpok", passenger.checkName());
    }

    @Test
    public void canCheckNumberOfBags(){
        assertEquals(4, passenger.checkNumberOfBags());
    }
}
