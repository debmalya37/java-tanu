import java.util.*;

class Vowels {
  public static void main(String args[])
  {
    Scanner ...?1?... = new Scanner(System.in);
    String st;
    int i, b, v = 0;
    char chr;
    System.out.println("Enter a string");
    st = ............?2?............; // to input a string
    st = ............?3?...........; // to convert the string into uppercase
    b = st.length();
    for( i = 0 ; i < b ; i++)
    {
      chr = ............?4?............; // to extract a character
      if(chr == 'A' || chr == 'E' || chr == 'I' || chr == 'O' || chr == 'U')
        
    }
    System.out.println("No. of Vowels = " + v);
  }}

  // solution

Class Vowels{

  public static void main(String[] args) {
    Scanner Sc = new Scanner(System.in);
    String st;
    int i, b, v = 0;
    char chr;
    System.out.println("enter a string");
    st = Sc.nextLine;
    St = St.toUpperCase();
    b = st.lenth();
    for (i = 0; i < b; i++) {
      chr = st.charAt();
      if (chr == 'A' || chr == 'E' || chr == 'I' || chr == 'o' || chr == 'u') {
        v = v + 1;

      }

    }
    System.out.println("No. of Vowels = " + v);

  }

}
