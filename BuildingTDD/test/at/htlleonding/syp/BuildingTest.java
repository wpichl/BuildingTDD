package at.htlleonding.syp;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BuildingTest {
    @Test
    public void itShouldReturn1WhenCreatingBuildingWith1InitialResident() {
        Building building = new Building("Huber");
        assertEquals(1, building.getNumberOfResidents());
    }

    @Test
    public void itShouldReturnTrueCreatingBuildingWith1InitialResident() {
        Building building = new Building("Huber");
        assertEquals(true, building.containsResident("Huber"));
    }

    @Test
    public void itShouldReturnTrueWhenCreatingBuildingWithMultipleResidents() {
        String[] residents = {"Huber", "Karl", "Klaus"};
        Building building = new Building(residents);
        assertEquals(true, building.containsResident("Huber"));
        assertEquals(true, building.containsResident("Karl"));
        assertEquals(true, building.containsResident("Klaus"));
    }

    @Test
    public void itShouldReturn3Given3Residents() {
        String[] residents = {"Huber", "Karl", "Klaus"};
        Building building = new Building(residents);

        assertEquals(3, building.getNumberOfResidents());
    }

    @Test
    public void itShouldReturn3Removing1From4Residents() {
        String[] residents = {"Huber", "Karl", "Klaus", "Maier"};
        Building building = new Building(residents);
        building.removeResident("Karl");
        assertEquals(3, building.getNumberOfResidents());
    }

    @Test
    public void itShouldFailSilentlyRemovingInvalidResident() {
        String[] residents = {"Huber", "Karl", "Klaus", "Maier"};
        Building building = new Building(residents);
        building.removeResident("X");
        assertEquals(4, building.getNumberOfResidents());
    }

    @Test
    public void itShouldReturn3Adding1Resident() {
        String[] residents = {"Huber", "Karl"};
        Building building = new Building(residents);
        building.addResident("Klaus");
        assertEquals(3, building.getNumberOfResidents());
    }
}
