package Selenium;

//import java.util.Stack;

import java.util.StringTokenizer;

//public class Assesment {
import java.util.*;
import java.lang.*;
import java.io.*;

    /*class Main
    {
        public static void printWords(String str)
        {
            String word;
            StringTokenizer iss = new StringTokenizer(str);
            while (iss.hasMoreTokens()){
                word = iss.nextToken();
                System.out.print(new StringBuilder(word).reverse().toString() + " ");
            }
        }
        public static void main (String[] args) throws java.lang.Exception
        {
            String s = "Perform regression before every sprint release";
            printWords(s);
        }
    }

// Contributed by rishabmalhdijo

//}*/
   // import java.io.*;
//import java.util.Scanner;

    /*static class GFG {
        public static void main(String[] args) {

            String str= "Perform regression before every sprint release", nstr="";
            char ch;

            //System.out.print("Original word: ");
            //System.out.println("Geeks"); //Example word

            for (int i=0; i<str.length(); i++)
            {
                ch= str.charAt(i); //extracts each character
                nstr= ch+nstr; //adds each character in front of the existing string
            }
            System.out.println(nstr);
        }
    }
}*/

    /*static class GFG {

        // reverses individual words of a string
        public static void reverseWords(String str)
        {
            Stack<Character> st=new Stack<Character>();

            // Traverse given string and push all
            // characters to stack until we see a space.
            for (int i = 0; i < str.length(); ++i) {
                if (str.charAt(i) != ' ')
                    st.push(str.charAt(i));

                    // When we see a space, we print
                    // contents of stack.
                else {
                    while (st.empty() == false) {
                        System.out.print(st.pop());

                    }
                    System.out.print(" ");
                }
            }

            // Since there may not be space after
            // last word.
            while (st.empty() == false) {
                System.out.print(st.pop());

            }
        }

        // Driver program to test above function
        public static void main(String[] args)
        {
            String str = "Perform regression before every sprint release";
            reverseWords(str);
}
    }
}*/
       /* public static void main(String[] args)
        {
            int number = 23456, reverse = 0;
            while(number != 0)
            {
                int remainder = number % 10;
                reverse = reverse * 10 + remainder;
                number = number/10;
            }
            System.out.println(reverse);
        }
    }*/

