// // Define a class named BookFair with the following description :

// class name	BookFair
// Instance variables /Data members :	
// String Bname –	stores the name of the book
// double price –	stores the price of the book
// Member methods :	
// BookFair()	Default constructor to initialize data members
// void Input()	To input and store the name and the price of the book.
// void display()	To display the name and price of the book after discount.
// void calculate()	To calculate the price after discount. Discount is calculated

// based on the following criteria

// Price                                                                                                       Discount
// Less than or equal to Rs.1000                                                        2% of price
// More than Rs. 1000 and less than or equal to Rs. 3000         10% of price
// More than Rs. 3000                                                                        15% of price
// Write a main method to create an object of the class and call the above member methods.

import java.util.*;

class BookFair {
    String Bname;
    double price;

    BookFair() {
        Bname = "";
        price = 0.0d;
    }

    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Name and Price ");
        Bname = sc.next();
        price = sc.nextDouble();
    }

    void calculate() {
        if (price <= 1000)
            price = price - price * 2 / 100;
        else if (price <= 3000)
            price = price - price * 10 / 100;
        else
            price = price - price * 15 / 100;
    }

    void display() {
        System.out.println("Name :" + Bname);
        System.out.println("Price :" + price);
    }

    public static void main(String args[]) {
        BookFair obj = new BookFair();
        obj.input();
        obj.calculate();
        obj.display();
    }
}