package bookSolved;

import java.util.Scanner;

public class AreaCalculator {

    public static double area(int choice) {
        Scanner scanner = new Scanner(System.in);

        double area = 0.0;

        switch (choice) {
            case 1: // Circle
                System.out.print("Enter the radius of the circle: ");
                double radius = scanner.nextDouble();
                area = 3.14 * radius * radius;
                break;
            case 2: // Square
                System.out.print("Enter the side length of the square: ");
                double side = scanner.nextDouble();
                area = side * side;
                break;
            case 3: // Rectangle
                System.out.print("Enter the length of the rectangle: ");
                double length = scanner.nextDouble();
                System.out.print("Enter the breadth of the rectangle: ");
                double breadth = scanner.nextDouble();
                area = length * breadth;
                break;
            default:
                System.out.println("Invalid choice!");
        }

        scanner.close();
        return area;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Area Calculator");
        System.out.println("1. Circle");
        System.out.println("2. Square");
        System.out.println("3. Rectangle");

        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt();

        double area = area(choice);
        System.out.println("Area: " + area);

        scanner.close();
    }
}
