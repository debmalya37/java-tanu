package bookSolved;

public class DiscountCalculator {

    public static double Discount(int printedPrice) {
        double discount = 0.10; // 10% discount
        double discountedPrice = printedPrice - (printedPrice * discount);
        return discountedPrice;
    }

    public static double Discount(int printedPrice, int discountPercent) {
        double discount = discountPercent / 100.0;
        double discountedPrice = printedPrice - (printedPrice * discount);
        return discountedPrice;
    }

    public static double Discount(int printedPrice, int discountPercent1, int discountPercent2) {
        double discount1 = discountPercent1 / 100.0;
        double discount2 = discountPercent2 / 100.0;
        double discountedPrice = printedPrice - (printedPrice * discount1);
        discountedPrice -= (discountedPrice * discount2);
        return discountedPrice;
    }

    public static void main(String[] args) {
        int printedPrice = 12000;
        int discount1 = 10;
        int discount2 = 8;

        double discountedPrice1 = Discount(printedPrice);
        double discountedPrice2 = Discount(printedPrice, discount1);
        double discountedPrice3 = Discount(printedPrice, discount1, discount2);

        System.out.println("Printed Price: " + printedPrice);
        System.out.println("Discounted Price (10% discount): " + discountedPrice1);
        System.out.println("Discounted Price (" + discount1 + "% discount): " + discountedPrice2);
        System.out.println("Discounted Price (" + discount1 + "%, " + discount2 + "% discounts): " + discountedPrice3);
    }
}
