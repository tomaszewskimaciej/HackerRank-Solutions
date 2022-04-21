package main;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        int l = A.length() - 1;

        String[] arr = A.split("");
        boolean palindrom = true;

        for (int a = 0; a < l / 2; a++) {
            if (arr[a].equals(arr[l - a])) {

            } else {
                palindrom = false;
            }
        }
        if (palindrom) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }


}
