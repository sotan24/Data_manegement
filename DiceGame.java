import java.util.Random;
public class DiceGame{
    public static void main(String[] args) {
        Random random = new Random();
        int ran1 = random.nextInt(6)+1;
        int ran2 = random.nextInt(6)+1;
        int total;
        System.out.println("Rolling dice...");
        System.out.println("Die 1: " + ran1);
        System.out.println("Die 2: " + ran2); 
        total = (ran1+ran2);

        System.out.println("Total value: " + total);
    }
}