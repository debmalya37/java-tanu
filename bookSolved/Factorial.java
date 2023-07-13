package bookSolved;

public class Factorial {

  public static int fact(int n) {
    if (n == 0 || n == 1) {
      return 1;
    } else {
      return n * fact(n - 1);
    }
  }

  public static void main(String[] args) {
    int n = 6; // Example value of n
    int m = 3; // Example value of m

    // Calculate factorial of n
    int factorialN = fact(n);

    // Calculate factorial of m
    int factorialM = fact(m);

    // Calculate factorial of (n - m)
    int factorialNM = fact(n - m);

    // Calculate S
    int S = factorialN / (factorialM * factorialNM);

    System.out.println("S = " + S);
  }
}
