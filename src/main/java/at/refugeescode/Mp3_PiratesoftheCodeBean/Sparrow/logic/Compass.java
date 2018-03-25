package at.refugeescode.Mp3_PiratesoftheCodeBean.Sparrow.logic;


import at.refugeescode.Mp3_PiratesoftheCodeBean.Sparrow.model.CursedCoin;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;
@Service
public class Compass {

    private CursedCoin cursedCoin = new CursedCoin();

    @Bean
    Random random() {
        return new Random();
    }

    private static List<String> indicators = Stream.of(
            "north",
            "south",
            "east",
            "west"
    ).collect(Collectors.toList());

    public static List<String> asList(){
        return new ArrayList <>(indicators);
    }

    public String changeDirection (){
        List<String> directions = Compass.asList();
        int randomIndex = random().nextInt(directions.size());
        return directions.get(randomIndex);
    }
     public boolean findCoin(){
        return (cursedCoin.getPlace() == changeDirection());
    }
}

