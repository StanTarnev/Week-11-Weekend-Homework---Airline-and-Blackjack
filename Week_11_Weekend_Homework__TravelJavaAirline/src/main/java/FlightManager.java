public class FlightManager {

    private int totalBaggageWeight;
    private Plane plane;
    private Flight flight;

    public FlightManager(Plane plane, Flight flight){
        this.plane = plane;
        this.flight = flight;

        totalBaggageWeight = plane.getWeight() / 2;
    }

    public int baggageWeightPerPerson(){
        return totalBaggageWeight / plane.getCapacity();
    }

    public int baggageWeightBooked(){
        return totalBaggageWeight / plane.getCapacity() * flight.getNumberOfPassengers();
    }

    public int baggageWeightAvailable(){
        return totalBaggageWeight - baggageWeightBooked();
    }
}
