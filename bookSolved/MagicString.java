package bookSolved;

public class MagicString {

    public static void magic(String x) {
        for (int i = 0; i < x.length() - 1; i++) {
            if (x.charAt(i) == x.charAt(i + 1)) {
                System.out.println("It is a magic string");
                return;
            }
        }
        System.out.println("It is not a magic string");
    }

    public static void main(String[] args) {
        String input = "hello"; // Example word
        magic(input);
    }
}
