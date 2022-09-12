public enum Plane {
    BOEING747(300, 10000);
    private int capacity;
    private double weight;
    Plane(int capacity, double weight){
        this.capacity = capacity;
        this.weight = weight;
    }

    public int getCapacity() {
        return capacity;
    }
}
