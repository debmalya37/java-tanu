// Design a class RailwayTicket with the following description:

// Instance variables/data members:

// String name: to store the name of the customer.
// String coach: to store the type of coach customer wants to travel.
// long mobno: to store customer’s mobile number.
// int amt: to store basic amount of ticket.
// int totalamt: to store the amount to be paid after updating the original amount.

// Methods:

// void accept(): to take input for name, coach, mobile number and amount.
// void update(): to update the amount as per the coach selected. Extra amount to be added in the amount as follows:

// Type of coaches                     Amount

// First_AC                            700
// Second_AC                           500
// Third_AC                            250
// sleeper                             None

// void display(): To display all details of a customer such as name, coach, total amount and mobile number.
// Write a main() method to create an object of the class and call the above methods.

import java.util.Scanner;

class RailwayTicket {
    String name;
    String coach;
    long mobno;
    int amt;
    int totalamt;

    void accept() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please Enter name: ");
        name = sc.nextLine();
        System.out.print("Please Enter coach: ");
        System.out.println(" First_AC, Second_AC, Third_AC or sleeper");
        coach = sc.nextLine();
        System.out.print("Please Enter mobno: ");
        mobno = sc.nextLong();
        System.out.print("Please Enter amt: ");
        amt = sc.nextInt();
    }

    void update() {
        if (coach.equalsIgnoreCase("First_AC"))
            totalamt = amt + 700;
        else if (coach.equalsIgnoreCase("Second_AC"))
            totalamt = amt + 500;
        else if (coach.equalsIgnoreCase("Third_AC"))
            totalamt = amt + 250;
        else if (coach.equalsIgnoreCase("sleeper"))
            totalamt = amt;
    }

    void display() {
        System.out.println("Details of customer");
        System.out.println("Name: " + name);
        System.out.println("Coach: " + coach);
        System.out.println("Mobile Number: " + mobno);
        System.out.println("Amount: " + amt);
        System.out.println("Total Amount: " + totalamt);
    }

    public static void main(String args[]) {
        RailwayTicket obj = new RailwayTicket();
        obj.accept();
        obj.update();
        obj.display();
    }
}