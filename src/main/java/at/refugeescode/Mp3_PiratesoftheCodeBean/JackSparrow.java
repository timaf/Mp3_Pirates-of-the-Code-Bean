package at.refugeescode.Mp3_PiratesoftheCodeBean;


public class JackSparrow {
    private Compass compass = new Compass();

    public Compass getCompass() {
        return compass;
    }

    public void setCompass(Compass compass) {
        this.compass = compass;
    }

    public boolean JackWantsCursedCoin(){
        return (compass.findCoin());
    }
}
