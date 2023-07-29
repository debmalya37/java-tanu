// Write a program to initialize the seven Wonders of the World along with their locations in two different arrays. 
// Search for a name of the country input by the user. If found, display the name of the country along with its Wonder,
//  otherwise display “Sorry Not Found!”.
// Seven wonders – CHICHEN ITZA, CHRIST THE REDEEMER, TAJMAHAL, GREAT WALL OF CHINA, MACHU PICCHU, PETRA, COLOSSEUM
// Locations – MEXICO, BRAZIL, INDIA, CHINA, PERU, JORDAN, ITALY
// Example – Country Name : INDIA Output : INDIA – TAJMAHAL Country Name : USA Output : Sorry Not Found!

import java.util.*;

class wonders {
    public static void main(String args[]) {
        String w[] = { "CHICHEN ITZA", "CHRIST THE REDEEMER", "TAJMAHAL", "GREATWALL OF CHINA", "MACHU PICCHU", "PETRA",
                "COLOSSEUM" };
        String l[] = { "MEXICO", "BRAZIL", "INDIA", "CHINA", "PERU", "JORDAN", "ITALY" };
        String s;
        int i, len;
        Scanner br = new Scanner(System.in);
        System.out.println("Enter the name of the country to be searched for ");
        s = br.nextLine();
        len = w.length; // OR len = l.length;
        boolean flag = false;
        for (i = 0; i < len; i++) // OR for( i=0;i<7;i++)
        {
            if (s.equalsIgnoreCase(l[i])) {
                System.out.println(l[i] + " - " + w[i]);
                flag = true;
                break;
            }
        }
        if (flag == false)
            System.out.println("Sorry Not Found");
    }
}