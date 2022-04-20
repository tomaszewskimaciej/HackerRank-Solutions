package main;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Main {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        scanner.close();

        if (N % 2 == 1) {
            System.out.println("Weird");            //checking whether number is odd, if so then pritn Weird
        }
        if (N % 2 == 0 && N >= 2 && N <= 5) {       //checking whether number is even, greater or equal 2 and smaller than 5, if so then print Not Weird
            System.out.println("Not Weird");
        }
        if (N % 2 == 0 && N >= 6 && N <= 20) {      //checking whether number is even, greater/equal 6 and smaller than 20, if so then print Weird
            System.out.println("Weird");
        }
        if (N % 2 == 0 && N > 20) {
            System.out.println("Not Weird");        //checking whether number is even and greater than 20, if so then print Not Weird

        }

    }

}
