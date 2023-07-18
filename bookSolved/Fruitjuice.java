package bookSolved;

import java.util.Scanner;

public class Fruitjuice {

    private String flavour;
    private int product_code;
    private String pack_type;
    private int pack_size;
    private int product_price;

    public Fruitjuice() {
        product_price = 0;
        pack_size = 0;
        pack_type = "";
        flavour = "";
        product_code = 0;
    }

    /**
     * 
     */
    public void input() {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the product code is : ");
            product_code = sc.nextInt();
            sc.nextLine();
            System.out.println("Enter the flavour is : ");
            flavour = sc.nextLine();
            System.out.println("Enter the packtype : ");
            pack_type = sc.nextLine();
            System.out.println("Enter Pack Size: ");
            pack_size = sc.nextInt();
            System.out.println("Enter the Product Price : ");
            product_price = sc.nextInt();
        }

    }

    public int discount() {
        product_price = product_price - (product_price * 10 / 100);
        return product_price;
    }

    void display() {
        System.out.println("The Product code is : " + product_code);
        System.out.println("The Product Prize is : " + product_price);
        System.out.println("The Flavour of the juice is : " + flavour);
        System.out.println("The Product Pack type is :  " + pack_type);
        System.out.println("The product pack size is : " + pack_size);
    }

    /**
     * @param args
     */
    public static void main(String[] args) {
        Fruitjuice silk = new Fruitjuice();

        silk.input();
        silk.discount();
        silk.display();
    }
}
