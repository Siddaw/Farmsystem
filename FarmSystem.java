package farm;

import java.util.ArrayList;
import java.util.List;

public class FarmSystem {
    public static void main(String[] args) {
        FarmEntity tractor = new Tractor("John Deere Tractor", 5000, 75);
        FarmEntity plow = new Plow("Steel Plow", 120, "Steel");
        Harvester harvester = new Harvester("Case IH Harvester", 8000, 80);

        List<FarmEntity> farmEntities = new ArrayList<>();
        farmEntities.add(tractor);
        farmEntities.add(plow);
        farmEntities.add(harvester);

        System.out.println("Farm system operations:");
        for (FarmEntity entity : farmEntities) {
            System.out.println(entity.toString());
            entity.performFunction();
            System.out.println();
        }

        harvester.adjustHarvestLevel(60);
        harvester.performFunction();
    }
}
