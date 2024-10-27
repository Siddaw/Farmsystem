package farm;

public class Tractor extends FarmEntity {
    private final double fuelLevel;

    public Tractor(String name, double weight, double fuelLevel) {
        super(name, weight);
        this.fuelLevel = fuelLevel;
    }

    @Override
    public void performFunction() {
        System.out.println(name + " is plowing the field with fuel level: " + fuelLevel);
    }
}
