package at.refugeescode.Mp3_PiratesoftheCodeBean;

import at.refugeescode.Mp3_PiratesoftheCodeBean.Sparrow.logic.Compass;
import at.refugeescode.Mp3_PiratesoftheCodeBean.Sparrow.model.CursedCoin;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CompassTest {
    private Compass compass;
    private CursedCoin cursedCoin;

    @BeforeEach
    void setUp() {
        compass = new Compass();
        cursedCoin = new CursedCoin();
    }



    @Test
    void findCoin() {
        cursedCoin.setPlace("IN THE BOX");
        assertEquals(compass.findCoin(),false);
    }
}