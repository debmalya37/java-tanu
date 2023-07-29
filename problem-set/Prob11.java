// Design a class to overload a function SumSeries() as follows :
// (i) void SumSeries(int n, double x) – with one integer argument and one double argument to find and display the sum of the series given below :
// s = x/1 – x/2 + x/3 – x/4 + x/5… to n terms

// (ii) void SumSeries() – To find and display the sum of the following series :
//              s = 1 + (1 × 2) + (1 × 2 × 3)+. … + (1 × 2 × 3 × 4 …  × 20)

import java.util.*;

class Prob11 {
    void SumSeries(int n, double x) {
        double sum = 0.0d;
        int i;
        for (i = 1; i <= n; i++) {
            if (i % 2 == 0)
                sum = sum - x / (double) i;
            else
                sum = sum + x / (double) i;
        }
        System.out.println("sum=" + sum);
    }

    void SumSeries() {
        int s = 0, p = 1;
        for (int i = 1; i <= 20; i++) {
            p = p * i;
            s = s + p;
        }
        System.out.println("sum=" + s);
    }

    public static void main(String args[]) {
        Prob11 obj = new Prob11();
        obj.SumSeries(5, 2.0);
        obj.SumSeries();
    }
}
