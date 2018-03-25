package at.refugeescode.Mp3_PiratesoftheCodeBean.Sparrow.controller;

import at.refugeescode.Mp3_PiratesoftheCodeBean.Sparrow.logic.Compass;
import at.refugeescode.Mp3_PiratesoftheCodeBean.Sparrow.model.CursedCoin;
import org.springframework.stereotype.Controller;

@Controller
public class JackSparrow {

    private Compass compass;

    public JackSparrow(Compass compass) {
        this.compass = compass;
    }

    public String findCursedCoin() {
        CursedCoin cursedCoin = compass.findCursedCoin();
        if (cursedCoin == null) {
            return "I couldn't find it";
        }
        return "I found it!";
    }
}
