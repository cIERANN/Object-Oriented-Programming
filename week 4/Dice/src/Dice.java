import java.util.Scanner;
import java.util.Random;

public class Dice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Enter the number of sides for die 1: ");
        int sides1 = scanner.nextInt();
        System.out.print("Enter the number of sides for die 2: ");
        int sides2 = scanner.nextInt();

        int sum1 = 0, sum2 = 0;
        int rolls = 3;

        System.out.println("Rolls for Die 1:");
        for (int i = 0; i < rolls; i++) {
            int roll = random.nextInt(sides1) + 1;
            sum1 += roll;
            System.out.println("Roll " + (i + 1) + ": " + roll);
        }

        System.out.println("Rolls for Die 2:");
        for (int i = 0; i < rolls; i++) {
            int roll = random.nextInt(sides2) + 1;
            sum2 += roll;
            System.out.println("Roll " + (i + 1) + ": " + roll);
        }

        System.out.println("Die 1 total: " + sum1 + ", average: " + (sum1 / (double) rolls));
        System.out.println("Die 2 total: " + sum2 + ", average: " + (sum2 / (double) rolls));
    }
}
