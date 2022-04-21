package main;

import java.util.Scanner;

public class Main {

    static int B, H;
    static Boolean flag = false;

    static {
        Scanner scan = new Scanner(System.in);
        H = scan.nextInt();
        B = scan.nextInt();

        if (B > 0 && H > 0) {
            flag = true;
        } else {
            try {
                throw new Exception("Breadth and height must be positive");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }

    public static void main(String[] args) {
        if (flag) {
            int area = B * H;
            System.out.print(area);
        }
    }
}

