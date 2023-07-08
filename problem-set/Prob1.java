// Design a class named ShowRoom with the following description:

// Instance variables/data members:

// String name: to store the name of the customer.
// long mobno: to store the mobile number of the customer.
// double cost: to store the cost of the items purchased.
// double dis: to store the discount amount.
// double amount: to store the amount to be paid after discount.

// Member methods:

// ShowRoom(): default constructor to initialize data members.
// void input(): to input customer name, mobile number, cost.
// void calculate(): to calculate discount on the cost of purchased items, based on the following criteria:

// COST                                                      DISCOUNT (IN PERCENTAGE)

// Less than or equal to Rs. 10000                           5%
// More than Rs. 10000 and less than or equal to Rs. 20000   10%
// More than Rs. 20000 and less than or equal to Rs. 35000   15%
// More than Rs. 35000                                       20%

// void display(): to display customer name, mobile number, amount to be paid after discount.
// Write a main() method to create an object of the class and call the above member methods.

import java.util.Scanner;

class ShowRoom {
    // as mentioned in the question
    String name;
    long mobno;
    double cost;
    double dis;
    double amount;

    public ShowRoom() {
        name = "";
        mobno = 0l;
        cost = 0.0;
        dis = 0.0;
        amount = 0.0;
    }

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter Customer name: ");
        name = sc.nextLine();
        System.out.print("Please enter Mobile Number: ");
        mobno = sc.nextLong();
        System.out.print("Please enter Cost: ");
        cost = sc.nextDouble();
    }

    public void calculate() {
        if (cost <= 10000)
            dis = 5.0 / 100.0 * cost;
        else if (cost <= 20000)
            dis = 10.0 / 100.0 * cost;
        else if (cost <= 35000)
            dis = 15.0 / 100.0 * cost;
        else
            dis = 20.0 / 100.0 * cost;
        amount = cost - dis;
    }

    public void display() {
        System.out.println("Customer name is: " + name);
        System.out.println("Mobile Number is: " + mobno);
        System.out.println("Total Amount is: " + amount);
    }

    public static void main(String args[]) {
        ShowRoom obj = new ShowRoom();
        obj.input();
        obj.calculate();
        obj.display();
    }
}
