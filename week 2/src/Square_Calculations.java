import java.util.Scanner;

public class Square_Calculations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

        // Prompt user to enter the length of the square's side
        System.out.print("Enter the length of the square's side: ");
        int sideLength = scanner.nextInt();

        // Calculate perimeter and area
        int perimeter = 4 * sideLength;
        int area = sideLength * sideLength;

        // Print the square's perimeter and area
        System.out.println("Perimeter of the square: " + perimeter);
        System.out.println("Area of the square: " + area);
	}

}
