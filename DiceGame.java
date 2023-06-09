import java.util.Random;
import java.util.Scanner;
public class DiceGame{
    public static void main(String[] args) {
        Random random = new Random();
        int ran1 = random.nextInt(6)+1;
        int ran2 = random.nextInt(6)+1;
        int total;

        Scanner scan = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = scan.next();
        System.out.println("Hello, " + name + "!");


        System.out.println("Rolling dice...");
        System.out.println("Die 1: " + ran1);
        System.out.println("Die 2: " + ran2); 
        total = (ran1+ran2);

        System.out.println("Total value: " + total);
    }
}