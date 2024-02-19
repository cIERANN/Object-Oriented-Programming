import java.util.Scanner;

public class PunctuationMarks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter a sentence: ");
        String inputString = scanner.nextLine();

      
        scanner.close();

        int dotCount = 0;
        int commaCount = 0;
        int colonCount = 0;
        int semicolonCount = 0;
        int questionMarkCount = 0;
        int exclamationMarkCount = 0;

        for (char c : inputString.toCharArray()) {
            if (c == '.') {
                dotCount++;
            } else if (c == ',') {
                commaCount++;
            } else if (c == ':') {
                colonCount++;
            } else if (c == ';') {
                semicolonCount++;
            } else if (c == '?') {
                questionMarkCount++;
            } else if (c == '!') {
                exclamationMarkCount++;
            }
        }

        // Print the table showing counts of each punctuation mark
        System.out.println("Punctuation Marks Counts:");
        System.out.println("------------------------");
        System.out.println(". (dot): " + dotCount);
        System.out.println(", (comma): " + commaCount);
        System.out.println(": (colon): " + colonCount);
        System.out.println("; (semicolon): " + semicolonCount);
        System.out.println("? (question mark): " + questionMarkCount);
        System.out.println("! (exclamation mark): " + exclamationMarkCount);
    }
}

