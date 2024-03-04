import java.util.Scanner;

public class Fractions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the numerator: ");
        int numerator = scanner.nextInt();

        System.out.print("Enter the denominator: ");
        int denominator = scanner.nextInt();
        
        double decimalEquivalent = (double) numerator / denominator;
    
        System.out.println("Decimal equivalent of the fraction: " + decimalEquivalent);
    
	}

}
