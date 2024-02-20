import java.util.Scanner;
import java.util.Random;

public class Pin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

   
        System.out.print("Enter a 4-digit PIN number to encrypt: ");
        int pin = scanner.nextInt();

        // Convert the pin number to hexadecimal
        String pinHex = Integer.toHexString(pin);

        // Generate two random numbers > 1000 and < 65536
        int random1 = random.nextInt(64536) + 1000;
        int random2 = random.nextInt(64536) + 1000;

        // Convert the random numbers to hexadecimal
        String random1Hex = Integer.toHexString(random1);
        String random2Hex = Integer.toHexString(random2);

        // PIN sandwiched between the two random hexadecimal numbers
        String encryptedPin = random1Hex + pinHex + random2Hex;

        System.out.println("Your encrypted PIN number is " + encryptedPin);
    }
}
