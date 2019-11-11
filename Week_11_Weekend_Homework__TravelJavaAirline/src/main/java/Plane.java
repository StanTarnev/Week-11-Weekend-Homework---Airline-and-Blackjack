public class Plane {

    private Model model;

    public Plane(Model model) {
        this.model = model;
    }

    public Model getModel() {
        return this.model;
    }

    public int getCapacity() {
        return this.model.getCapacity();
    }

    public int getWeight() {
        return this.model.getWeight();
    }

}
