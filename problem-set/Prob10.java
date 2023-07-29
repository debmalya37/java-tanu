// Special words are those words which starts and ends with the same letter.
// Examples:
//        EXISTENCE
//        COMIC
//        WINDOW
// Palindrome words are those words which read the same from left to right and vice-versa
// Examples:
//        MALAYALAM
//        MADAM
//        LEVEL
//        ROTATOR
//        CIVIC
// All palindromes are special words, but all special words are not palindromes. Write a program to accept a word check and print whether the word is a palindrome or only special word.

import java.util.*;

class Prob10 {
    public static void main(String s[])// throws IOException
    {
        Scanner obj = new Scanner(System.in);
        System.out.println(" enter a word ");
        String word = obj.nextLine();
        String rword = "";
        int l, x;
        l = word.length();
        for (x = l - 1; x >= 0; x--)
            rword = rword + word.charAt(x);
        if (word.equals(rword))
            System.out.println(word + " is palindrome");
        else if (word.charAt(0) == word.charAt(l - 1))
            System.out.println(word + " is a special word");
        else {
            System.out.println(" it's a normal word");
        }
    }
}