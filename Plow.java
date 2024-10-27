package farm;

public class Plow extends FarmEntity {
    private final String material;

    public Plow(String name, double weight, String material) {
        super(name, weight);
        this.material = material;
    }

    @Override
    public void performFunction() {
        System.out.println(name + " is being used for tilling soil. Material: " + material);
    }
}
