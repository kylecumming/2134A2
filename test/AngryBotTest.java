import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AngryBotTest {

    @Test
    void getNextMove() {
        int id = 1;
        int jolts = 1;
        TimBot test1 = new TimBot(id, jolts);
        assertEquals(District.CURRENT, test1.getNextMove(), "Does not return one of the 5 district choices");


    }

}