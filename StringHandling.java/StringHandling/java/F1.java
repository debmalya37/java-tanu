
public class F1 {
    public static void main(String[] args) {
        // 1
        String n1 = "46", n2 = "64";
        int total = Integer.parseInt(n1) + Integer.parseInt(n2);
        System.out.println("The sum of " + "46 " + "and" + " 64" + " is " + total);

        // 2
        boolean p;
        p = ("BLUEJ".length() > "bluej".length()) ? true : false;

        // 3
        String str = "Information Technology";
        int p;
        p = str.indexOf('n');
        System.out.println(p);

        // 4
        String str1 = "Information Technology";
        String str2 = "information technology";
        boolean p = str1.equalsIgnoreCase(str2);
        System.out.println("The result is " + p);

    }

}
