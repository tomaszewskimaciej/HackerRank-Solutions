package main;

import java.util.Scanner;

public class Main {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        smallest = largest = s.substring(0, k);
        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        for (int i = 0; i < s.length() - k + 1; i++) {
            String substr = s.substring(i, i + k);
            if (largest.compareTo(substr) > 0) {
                largest = substr;
            }
            if (smallest.compareTo(substr) < 0) {
                smallest = substr;
            }
        }

        return largest + "\n" + smallest;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();

        System.out.println(getSmallestAndLargest(s, k));
    }
}
