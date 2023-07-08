import java.util.*;

public class Transloop {
    // do{r=n%10};
    // n = k+r;
    // i++;n = n/10;
    // while(n!=0);
    // }

    // public static void main(String[] args) {

    // // only using for loop
    // int n = 10; // Initialize n with a value
    // int k = 0;
    // int r = 0;

    // for (int i = 0; n != 0; i++, n = n / 10) {
    // r = n % 10;
    // n = k + r;
    // };

    public static void main(String[] args) {
        int min = 0;
        int max = 20;

        int randomInt = min + (int) (Math.random() * (max - min + 1));
        double Fuk = Math.floor(randomInt);
        System.out.println(Fuk);
        System.out.println("Random value: " + Fuk);
    }
}
