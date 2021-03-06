public class Passenger {

    private String name;
    private int numberOfBags;
    private Flight flight;

    public Passenger(String name, int numberOfBags){
        this.name = name;
        this.numberOfBags = numberOfBags;
        this.flight = null;
    }

    public String checkName(){
        return this.name;
    }

    public int checkNumberOfBags(){
        return this.numberOfBags;
    }

    public Flight getFlight() {
        return flight;
    }

    public void setFlight(Flight flight) {
        this.flight = flight;
    }

}
