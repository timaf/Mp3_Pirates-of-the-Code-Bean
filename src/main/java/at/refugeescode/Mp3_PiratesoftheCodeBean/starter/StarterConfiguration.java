package at.refugeescode.Mp3_PiratesoftheCodeBean.starter;

import at.refugeescode.Mp3_PiratesoftheCodeBean.Sparrow.controller.JackSparrow;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StarterConfiguration {

    @Bean
    public ApplicationRunner mySparrow (JackSparrow jackSparrow) {
        return args -> {
            do {
                System.out.println("Try again Compass!..Wrong Direction");
                System.out.println("--------");
                jackSparrow.JackWantsCursedCoin();
            } while ( jackSparrow.jackWines() != true);
            System.out.println("I got it....");
            System.out.println("------------");

        };
    }
}
