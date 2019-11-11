import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FlightTest {
    private Flight flight;
    private Plane BOEING747;
    private Passenger passenger1;
    private Passenger passenger2;

    @Before
    public void before(){
        BOEING747 = new Plane(Model.BOEING747);
        flight = new Flight(BOEING747, "FR756", "SFO", "GLA", "14:40");
        passenger1 = new Passenger("Dwight", 2);
        passenger2 = new Passenger("Ingrid", 1);
    }

    @Test
    public void canGetNumberOfPassengers() {
        assertEquals(0, flight.getNumberOfPassengers());
    }

    @Test
    public void canGetPlaneModel(){
        assertEquals(BOEING747, flight.getPlaneModel());
    }

    @Test
    public void canGetFlightNumber(){
        assertEquals("FR756", flight.getFlightNumber());
    }

    @Test
    public void canGetDestination(){
        assertEquals("SFO", flight.getDestination());
    }

    @Test
    public void canGetDepartureAirport(){
        assertEquals("GLA", flight.getDepartureAirport());
    }

    @Test
    public void canGetDepartureTime(){
        assertEquals("14:40", flight.getDepartureTime());
    }

    @Test
    public void canAddPassenger(){
        flight.addPassenger(passenger1);
        assertEquals(1, flight.getNumberOfPassengers());
        flight.addPassenger(passenger2);
        assertEquals(1, flight.getNumberOfPassengers());
    }

    @Test
    public void canCheckAvailableSeats(){
        flight.addPassenger(passenger1);
        assertEquals(0, flight.checkAvailableSeats());
    }
}
