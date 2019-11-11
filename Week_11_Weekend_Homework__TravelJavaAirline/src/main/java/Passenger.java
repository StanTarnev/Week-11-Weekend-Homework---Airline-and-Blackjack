public class Passenger {

    private String name;
    private int numberOfBags;
    private Flight flight;

    public Passenger(String name, int numberOfBags){
        this.name = name;
        this.numberOfBags = numberOfBags;
        this.flight = flight;
    }

    public String checkName(){
        return this.name;
    }

    public int checkNumberOfBags(){
        return this.numberOfBags;
    }

    public Flight checkFlight(){
        return this.flight;
    }
}
