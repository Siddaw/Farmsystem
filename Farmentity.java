package farm;

public abstract class FarmEntity {
    private String name;
    protected double weight;

    public FarmEntity(String name, double weight) {
        this.name = name;
        this.weight = weight;
    }

    public abstract void performFunction();

    @Override
    public String toString() {
        return "Name: " + name + ", Weight: " + weight;
    }
}
