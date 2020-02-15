import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TimBotTest {

    @Test
    void getID() {
        int id = 1;
        int jolts = 1;
        TimBot test = new TimBot(id, jolts);
        assertEquals(1, test.getID(), "Test ID does not match id inputted");
        TimBot test1 = new TimBot(-1,1);
        assertNotEquals(-1,test1.getID(), "Id can equal a value that is not between 0 and 99");
    }

    @Test
    void startRound() {
        TimBot test = new TimBot(1, 2);
        assertTrue(test.startRound(), "Does not return true for a value over 0");
        TimBot test2 = new TimBot(1, -1);
        assertFalse(test2.startRound(), "Returns true for a number under 0");
    }

    @Test
    void senseDistricts() {
        TimBot test = new TimBot(1, 3);
        assertEquals(1|2|3|4, test.spressoSensed[3], "Did not sense the required district");
    }

    @Test
    void getNextMove() {
        TimBot test = new TimBot(1,3);
        assertEquals(District.CURRENT,test.getNextMove(), "Did not sense current district");
    }

    @Test
    void isFunctional() {
        TimBot test = new TimBot(1,1);
        TimBot test2 = new TimBot(1, -1);
        assertTrue(test.isFunctional(), "Returns wrong truth value for energy level being above 1");
        assertFalse(test2.isFunctional(), "Returns wrong truth value for energy level being below 0");
    }

    @Test
    void useShield() {
        TimBot test = new TimBot(1,3);
        TimBot test2 = new TimBot(1, -1);
        assertTrue(test.useShield(), "Returns wrong truth value for having enough jolts to increase sheild");
        assertFalse(test2.useShield(), "Returns wrong truth value for not having enough jolts to increase sheild");
    }

    @Test
    void harvestSpresso() {
        TimBot test = new TimBot(1,100);
        assertNotEquals(100, test.energyLevel, "Value exceeds the maximum of 100");
    }

    @Test
    void fireCannon() {
        TimBot test = new TimBot(1,2);
        assertEquals(null, test.fireCannon(), "Cannon Returns incorrect value for not firing");
    }

    @Test
    void testToString() {
        TimBot test = new TimBot(1,3);
        assertEquals('N', test.personality, "ToString returns the wrong personality");
        assertEquals(1, test.getID(), "ToString returns the wrong id value");
        assertEquals(3, test.energyLevel, "ToString returns the wrong id value");
    }
}