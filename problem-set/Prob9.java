// Using the switch statement , write a menu driven program for the following:
// (i) To print the Floyd’s triangle [Given below]
//                 1
//                 2 3
//                 4 5 6
//                 7 8 9 10
//                 11 12 13 14 15
// (ii) To display the following pattern
//                 I
//                 I C
//                 I C S
//                 I C S E
// For an incorrect option, an appropriate error message should be displayed.

import java.util.*;

class Prob9 {
    public static void main(String args[]) {
        Scanner obj = new Scanner(System.in);
        int choice, x;
        System.out.println("Enter 1 for pattern1 , 2 for Pattern2");
        choice = obj.nextInt();
        switch (choice) {
            case 1:
                int r, c, k = 1;
                for (r = 1; r <= 5; r++) {
                    for (c = 1; c <= r; c++) {
                        System.out.print(" " + k);
                        k++;
                    }
                    System.out.println();
                }
                break;
            case 2:
                String s = "ICSE";
                for (int i = 0; i < s.length(); i++) {
                    System.out.println(s.substring(0, i + 1));
                }
                break;
            default:
                System.out.println("Sorry wrong choice");
        }
    }
}