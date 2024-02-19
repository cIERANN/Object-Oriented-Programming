import java.util.Scanner;

public class StringReverser {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for a sentence
        System.out.print("Enter a sentence: ");
        String inputSentence = scanner.nextLine();

        // Close the scanner after reading the input sentence
        scanner.close();

        // Split the sentence into words and iterate through each word
        for (String word : inputSentence.split("\\s+")) {
            // Reverse each word and print it
            for (int i = word.length() - 1; i >= 0; i--) {
                System.out.print(word.charAt(i));
            }
            // Print a space after each reversed word
            System.out.print(" ");
        }

        // Print a new line after all words are printed
        System.out.println();
    }
}
