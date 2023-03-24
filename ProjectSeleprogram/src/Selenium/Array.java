package Selenium;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


    import java.io.*;
    import java.util.*;
    import java.text.*;
    import java.math.*;
    import java.util.regex.*;
class Source {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] A = new int[n];
        for (int i = 0; i < n; i++) {
            A[i] = scan.nextInt();
        }
        int X = scan.nextInt();
        int carry = X;
        for (int i = n - 1; i >= 0; i--) {
            int sum = A[i] + carry;
            A[i] = sum % 10;
            carry = sum / 10;
        }
        if (carry > 0) {
            int[] newA = new int[n + 1];
            newA[0] = carry;
            for (int i = 0; i < n; i++) {
                newA[i + 1] = A[i];
            }
            A = newA;
            n++;
        }
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            result.add(A[i]);
        }
        System.out.println(result);
    }
}


