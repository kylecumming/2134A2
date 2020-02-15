import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SpressoBotTest {

    @Test
    void getNextMove() {
        TimBot test = new TimBot(1,3);
        assertEquals(District.CURRENT,test.getNextMove(), "Did not sense current district or a different district");
        assertNotEquals(District.SOUTH,test.getNextMove(), "Did not sense current district or a different district");
        assertNotEquals(District.EAST,test.getNextMove(), "Did not sense current district or a different district");
        assertNotEquals(District.SOUTH,test.getNextMove(), "Did not sense current district or a different district");
        assertNotEquals(District.WEST,test.getNextMove(), "Did not sense current districtor or a different district");
    }
}