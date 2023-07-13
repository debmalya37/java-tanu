package bookSolved;

public class VowelFrequency {

    public static void freq(String input) {
        input = input.toLowerCase();
        int[] vowelFrequencies = new int[5]; // Array to store vowel frequencies: a, e, i, o, u

        for (char c : input.toCharArray()) {
            if (isVowel(c)) {
                int index = getVowelIndex(c);
                vowelFrequencies[index]++;
            }
        }

        System.out.println("Vowel frequencies:");
        char[] vowels = { 'a', 'e', 'i', 'o', 'u' };
        for (int i = 0; i < vowels.length; i++) {
            System.out.println(vowels[i] + ": " + vowelFrequencies[i]);
        }
    }

    public static boolean isVowel(char c) {
        c = Character.toLowerCase(c);
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }

    public static int getVowelIndex(char c) {
        c = Character.toLowerCase(c);
        if (c == 'a') {
            return 0;
        } else if (c == 'e') {
            return 1;
        } else if (c == 'i') {
            return 2;
        } else if (c == 'o') {
            return 3;
        } else if (c == 'u') {
            return 4;
        }
        return -1; // Return -1 if the character is not a vowel
    }

    public static void main(String[] args) {
        String input = "Hello World";
        freq(input);
    }
}
