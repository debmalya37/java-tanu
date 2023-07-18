// package com.debmalya;
// import java.util.Scanner;

// public class Main {
//     /**
//      * @param args
//      */
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(system.in);
//         string input = sc.nextLine();
//         System.out.println("input name: ");

//         }

//     }
// }

import java.util.*;

public class Quad {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            int a, b, c;
            System.out.println("For the quadratic equation given by ax^2 + bx + c Choose a, b and c");

            System.out.println("a : ");
            a = sc.nextInt();
            System.out.println("b : ");
            b = sc.nextInt();
            System.out.println("c : ");
            c = sc.nextInt();
            int d = (b * b) - 4 * a * c;

            if (d > 0) {
                System.out.println("The roots are real and unequal");
            } else if (d == 0) {
                System.out.println("The roots are real and equal");
            } else if (d < 0) {
                System.out.println("The roots are imaginary and unreal");
            }
        }
    }
}