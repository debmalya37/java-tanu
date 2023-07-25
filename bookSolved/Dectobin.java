package bookSolved;

public class Dectobin {
    public static String dectobin(int decimalNumber) {
        if (decimalNumber == 0) {
            return "0";
        }

        StringBuilder binaryBuilder = new StringBuilder();
        while (decimalNumber > 0) {
            int remainder = decimalNumber % 2;
            binaryBuilder.insert(0, remainder); // Insert the remainder at the beginning of the string
            decimalNumber /= 2;
        }

        return binaryBuilder.toString();
    }

    public static void main(String[] args) {
        int decimalNumber = 42; // Replace this with the decimal number you want to convert
        String binary = dectobin(decimalNumber);
        System.out.println("Binary representation of " + decimalNumber + " is: " + binary);
    }

}
