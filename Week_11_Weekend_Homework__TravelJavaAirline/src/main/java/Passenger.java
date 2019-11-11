public class Passenger {

    private String name;
    private int numberOfBags;

    public Passenger(String name, int numberOfBags){
        this.name = name;
        this.numberOfBags = numberOfBags;
    }

    public String checkName(){
        return this.name;
    }

    public int checkNumberOfBags(){
        return this.numberOfBags;
    }
}
