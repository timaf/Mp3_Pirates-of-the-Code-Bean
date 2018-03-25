package at.refugeescode.Mp3_PiratesoftheCodeBean.Sparrow.logic;

import at.refugeescode.Mp3_PiratesoftheCodeBean.Sparrow.model.CursedCoin;
import org.springframework.stereotype.Service;

@Service
public class Compass {

    private CursedCoin cursedCoin;

    public Compass(CursedCoin cursedCoin) {
        this.cursedCoin = cursedCoin;
    }

    public CursedCoin findCursedCoin() {
        return cursedCoin;
    }

}