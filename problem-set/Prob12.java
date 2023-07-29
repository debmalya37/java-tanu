// Write a program to accept a number and check and display whether it is a Niven number or not. 
// (Niven number is that number which is divisible by its sum of digits).
// Example :
//       Consider the number 126.
//       Sum of its digits is 1+2+6 = 9 and 126 is divisible by 9.

import java.util.*;

class Niven {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number");
        int num = sc.nextInt();
        int n = num;
        int rem;
        int sum = 0;
        while (num > 0) {
            rem = num % 10;
            sum = sum + rem;
            num = num / 10;
        }
        if (n % sum == 0)
            System.out.println("Niven number");
        else
            System.out.println("not Niven Number");
    }
}