package at.refugeescode.Mp3_PiratesoftheCodeBean.Sparrow.model;

import org.springframework.stereotype.Component;

@Component
public class CursedCoin {

    private  String place = "east";

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }
}
