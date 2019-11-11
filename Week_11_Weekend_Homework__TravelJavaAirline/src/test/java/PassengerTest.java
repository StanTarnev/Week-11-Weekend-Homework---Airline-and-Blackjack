import org.junit.Before;
import org.junit.Test;

import java.awt.datatransfer.FlavorEvent;

import static org.junit.Assert.assertEquals;

public class PassengerTest {

    private Passenger passenger;
    private Plane BOEING747;

    private Flight flight;

    @Before
    public void before(){
        passenger = new Passenger("Denpok", 4);
        BOEING747 = new Plane(Model.BOEING747);
        flight = new Flight(BOEING747, "KN234", "LAX", "EDI", "23:05");
    }

    @Test
    public void canCheckName(){
        assertEquals("Denpok", passenger.checkName());
    }

    @Test
    public void canCheckNumberOfBags(){
        assertEquals(4, passenger.checkNumberOfBags());
    }

    @Test
    public void canCheckFlight(){
        assertEquals(flight, passenger.checkFlight());
    }
}
