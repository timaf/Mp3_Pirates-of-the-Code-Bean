package at.refugeescode.Mp3_PiratesoftheCodeBean;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Compass {

    private Random random = new Random();
    private static List<String> indicators = Stream.of(
            "north",
            "south",
            "east",
            "west"
    ).collect(Collectors.toList());

    public static List<String> asList(){
        return new ArrayList <>(indicators);
    }

    public boolean findCoin(){
    List<String> directions = Compass.asList();
    int randomIndex = random.nextInt(directions.size());
    String direction = directions.get(randomIndex);
    System.out.println("My direction now is :"+ direction);
    return (CursedCoin.getplace() == direction);
    }
}

