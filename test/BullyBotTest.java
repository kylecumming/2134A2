import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BullyBotTest {

    @Test
    void fireCannon() {
        TimBot test = new TimBot(1,2);
        assertEquals(null, test.fireCannon(), "Cannon Returns incorrect value for not firing");
    }

}