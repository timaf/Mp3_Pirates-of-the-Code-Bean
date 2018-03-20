package main.java.at.refugeescode.Mp3_PiratesoftheCodeBean;

public class JackSparrow {
    private Compass compass;

    public Compass getCompass() {
        return compass;
    }

    public void setCompass(Compass compass) {
        this.compass = compass;
    }

    public void JackWantsCursedCoin(){
        if (compass.findCoin()){
            System.out.println("I got it....");
        }else{
            System.out.println("Try again Compass");
        }
    }
}
