import java.util.Scanner;

public class Miles_To_Kilometers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int val1, val2, val3;
        double average;
        Scanner scan = new Scanner(System.in);
        System.out.println("*** Miles to Kilometers ***");
        System.out.print("Enter miles: ");
        double miles = scan.nextDouble();
        double kilometers = miles * 1.60935;
        System.out.println(miles + " miles is equal to " + kilometers + " kilometers.");
    
	}

}
