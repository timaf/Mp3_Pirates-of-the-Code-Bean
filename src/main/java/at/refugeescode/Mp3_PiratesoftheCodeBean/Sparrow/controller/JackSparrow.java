package at.refugeescode.Mp3_PiratesoftheCodeBean.Sparrow.controller;

import at.refugeescode.Mp3_PiratesoftheCodeBean.Sparrow.logic.Compass;
import org.springframework.stereotype.Controller;

@Controller
public class JackSparrow {

    private Compass compass = new Compass();

   public String JackWantsCursedCoin(){
       return (compass.changeDirection());
    }

    public boolean jackWines(){
       return (compass.findCoin());
    }
}
