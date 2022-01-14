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
}
