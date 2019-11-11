import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FlightManagerTest {
    private FlightManager flightManager;
    private Plane BOEING747;
    private Flight flight;
    private Passenger passenger3;
    private Passenger passenger4;

    @Before
    public void before(){
        BOEING747 = new Plane(Model.BOEING747);
        flight = new Flight(BOEING747, "KN234", "LAX", "EDI", "23:05");
        flightManager = new FlightManager(BOEING747, flight);
        passenger3 = new Passenger("Pinocchio", 5);
        passenger4 = new Passenger("Darth Vader", 0);
    }

    @Test
    public void getBaggageWeightPerPerson() {
        assertEquals(400, flightManager.baggageWeightPerPerson());
    }

    @Test
    public void getBaggageWeightBooked(){
        flight.addPassenger(passenger3);
        flight.addPassenger(passenger4);
        assertEquals(800, flightManager.baggageWeightBooked());
    }

    @Test
    public void getBaggageWeightAvailable(){
        flight.addPassenger(passenger3);
        flight.addPassenger(passenger4);
        assertEquals(165900, flightManager.baggageWeightAvailable());
    }
}
