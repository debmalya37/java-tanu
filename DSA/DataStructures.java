package DSA;

public class DataStructures {
    public static void main(String[] args) {
        drawTriangle(5);
        System.out.println();
        drawStarPattern(5);
        System.out.println();
        drawRectangle(4, 6);
    }

    // Function to draw a triangle
    public static void drawTriangle(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // Function to draw a star pattern
    public static void drawStarPattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = n; j > i; j--) {
                System.out.print("  ");
            }
            for (int k = 1; k <= i * 2 - 1; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // Function to draw a rectangle
    public static void drawRectangle(int rows, int columns) {
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= columns; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
