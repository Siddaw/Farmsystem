package farm;

public class Harvester extends FarmEntity {
    private double harvestLevel;

    public Harvester(String name, double weight, double harvestLevel) {
        super(name, weight);
        this.harvestLevel = harvestLevel;
    }

    @Override
    public void performFunction() {
        System.out.println(name + " is harvesting crops. Harvest efficiency level: " + (harvestLevel > 75 ? "High" : "Low"));
    }

    public void adjustHarvestLevel(double newLevel) {
        this.harvestLevel = newLevel;
        System.out.println(name + " adjusted harvest level to: " + harvestLevel);
    }
}
