package position;

public class TestImmutableBuilding {

    static void main(String[] args) {
        ImmutableBuilding building = new ImmutableBuilding(100, "123 Main St", 10);
        System.out.println(building);
        ImmutableBuilding updatedBuilding = building.update(5.0, " New Ave", 2);
        System.out.println(updatedBuilding);
    }
}
