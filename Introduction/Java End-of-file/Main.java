package main;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = 0;
        while (scan.hasNextLine()) {
            String a = scan.nextLine();
            number += 1;
            System.out.println(number + " " + a);
        }
    }
}
