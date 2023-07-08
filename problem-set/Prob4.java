// Define a class named BookFair with the following description:

// Instance variables/Data members:

// String Bname – stores the name of the book.
// double price – stores the price of the book.

// Member Methods:

// (i) BookFair() – Default constructor to initialize data members.
// (ii) void Input() – To input and store the name and the price of the book.
// (iii) void calculate() – To calculate the price after discount. Discount is calculated based on the following criteria.

// PRICE                                                 DISCOUNT

// Less than or equal to Rs 1000                         2% of price
// More than Rs 1000 and less than or equal to Rs 3000   10% of price
// More than Rs 3000                                     15% of price

// (iv) void display() – To display the name and price of the book after discount.
// Write a main method to create an object of the class and call the above member methods.

import java.util.Scanner;

class BookFair {
    String Bname;
    double price;

    public BookFair() {
        Bname = "";
        price = 0.0;
    }

    public void Input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please Enter book name: ");
        Bname = sc.nextLine();
        System.out.print("Please Enter price: ");
        price = sc.nextDouble();
    }

    void calculate() {
        double discountPer = 0;
        if (price <= 1000) {
            discountPer = 2;
        } else if (price > 1000 && price <= 3000) {
            discountPer = 10;
        } else if (price > 3000) {
            discountPer = 15;
        }
        price = price - (price * discountPer / 100);
    }

    void display() {
        System.out.println("Name is: " + Bname);
        System.out.println("Price after discount is: " + price);
    }

    public static void main(String[] args) {
        BookFair obj = new BookFair();
        obj.Input();
        obj.calculate();
        obj.display();
    }
}
