//  QUESTION

// Define a class named movieMagic with the following description:

// Instance variables/data members:
// int year – to store the year of release of a movie
// String title – to store the title of the movie.
// float rating – to store the popularity rating of the movie.
// (minimum rating = 0.0 and maximum rating = 5.0)

// Member Methods:

// (i) movieMagic() Default constructor to initialize numeric data members to 0 and String data member to "".
// (ii) void accept() To input and store year, title and rating.
// (iii) void display() To display the title of a movie and a message based on the rating as per the table below.

// RATING				MESSAGE TO BE DISPLAYED

// 0.0 to 2.0			Flop
// 2.1 to 3.4			Semi-hit
// 3.5 to 4.5			Hit
// 4.6 to 5.0			Super Hit

// Write a main method to create an object of the class and call the above member methods.
// SOLUTION

import java.util.Scanner;

class movieMagic {

    int year;
    String title;
    float rating;

    public movieMagic() {
        year = 0;
        title = "";
        rating = 0;
    }

    public void accept() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter title:- ");
        title = sc.nextLine();
        System.out.print("Please enter year:- ");
        year = sc.nextInt();
        System.out.print("Please enter rating between 0.0 to 5.0:- ");
        rating = sc.nextFloat();
    }

    public void display() {
        System.out.println("Movie Title:- " + title);
        if (rating >= 0 && rating <= 2.0) {
            System.out.println("Flop");
        } else if (rating >= 2.1 && rating <= 3.4) {
            System.out.println("Semi-hit");
        } else if (rating >= 3.5 && rating <= 4.5) {
            System.out.println("Hit");
        } else if (rating >= 4.6 && rating <= 5.0) {
            System.out.println("Super Hit");
        }
    }

    public static void main(String[] args) {
        movieMagic movie = new movieMagic();
        movie.accept();
        movie.display();
    }

}

