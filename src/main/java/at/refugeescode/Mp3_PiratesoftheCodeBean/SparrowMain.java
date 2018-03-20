package at.refugeescode.Mp3_PiratesoftheCodeBean;

public class SparrowMain {
    public static void main(String[] args) {
        JackSparrow jackSparrow = new JackSparrow();
        do{
            System.out.println("Try again Compass!");
            System.out.println("--------");
           jackSparrow.JackWantsCursedCoin();
        }while(!(jackSparrow.getCompass().findCoin()));
        System.out.println("I got it....");
        System.out.println("------------");
    }
}
