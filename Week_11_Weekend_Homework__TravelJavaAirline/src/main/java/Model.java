public enum Model {

    BOEING747(333400, 416 );

    private final int capacity;
    private final int weight;

    Model(int weight, int capacity) {
        this.capacity = capacity;
        this.weight = weight;

    }

    public int getCapacity() {
        return this.capacity;
    }

    public int getWeight() {
        return this.weight;
    }

}
