package bookSolved;

import java.util.Scanner;

// FIBONACCI NUMBER FORMULA = Fn = Fn-1+Fn-2
public class Fibonacci {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of terms: ");
        int n = sc.nextInt();

        System.out.println("Fibonacci Series up to " + n + " terms:");
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci(i) + " ");
        }
        sc.close();
    }

    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {

            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}
