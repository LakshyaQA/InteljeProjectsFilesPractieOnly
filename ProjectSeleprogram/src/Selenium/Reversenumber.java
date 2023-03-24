package Selenium;

//import java.util.Scanner;

class Reversenumber {
    //method for reverse a number
    public static void main(String[] args) {

    }
        public static void reverseNumber(int number)
        {
            //prints the same number if the number is less than 10
            // System.out.println(number);
            if (number <= 1000)
                return;
            else
            {
                System.out.print(number % 10);
                reverseNumber(number/10);
            }
        }
}


   /* static int rev_num = 0;
    static int base_pos = 1;
    static int reverseDigits(int num)
    {
        if (num > 0) {
            reverseDigits(num / 10);
            rev_num += (num % 10) * base_pos;
            base_pos *= 10;
        }
        return rev_num;
    }
    public static void main(String[] args)
    {
        int num = 23456;
        System.out.println(reverseDigits(num));
}
}
   public static void main(String[] args) {
        int number = 23456, reverse = 0;
        while (number != 0) {
            int remainder = number % 10;
            reverse = reverse * 10 + remainder;
            number = number / 10;
        }
        System.out.println(reverse);
    }
}*/

