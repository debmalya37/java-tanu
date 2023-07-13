package bookSolved;

public class LowercaseLetters {

    public static void lower(String x) {
        System.out.println("Lower case letters:");
        for (int i = 0; i < x.length(); i++) {
            char c = x.charAt(i);
            if (Character.isLowerCase(c)) {
                System.out.print(c + " ");
            }
        }
        System.out.println(); // Print a new line after the lower case letters
    }

    public static void main(String[] args) {
        String input = "HeLLo WoRld"; // Example input string
        lower(input);
    }
}
