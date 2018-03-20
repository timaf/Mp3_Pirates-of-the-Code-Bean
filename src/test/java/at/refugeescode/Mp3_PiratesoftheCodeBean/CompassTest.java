package at.refugeescode.Mp3_PiratesoftheCodeBean;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CompassTest {
    private Compass compass = new Compass();
    @Test
    void findCoin() {
        CursedCoin.setPlace("IN THE BOX");
        assertEquals(compass.findCoin(),false);
    }
}