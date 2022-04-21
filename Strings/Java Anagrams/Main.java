package main;

import java.util.Scanner;

public class Main {

    static boolean isAnagram(String a, String b) {
        String first = a.toLowerCase();
        String second = b.toLowerCase();
        int al = a.length();
        int check = 0;
        if (first.length() != second.length()) {
            return false;
        }
        char a1[] = first.toCharArray();
        char a2[] = second.toCharArray();

        for (int i = 0; i < a.length(); i++) {
            for (int x = 0; x < b.length(); x++) {
                if (a1[i] == a2[x]) {
                    if (a2[x] != '3') {             //checking whether value of this index of a2 is 3, because if it's 3 it means that this index has already been fitted to a1 character
                        check += 1;
                        a2[x] = 3;                  //changing a2[x] to 3, so if we check this index again we'll see that his one has already been fitted to a1 character
                    }
                    break;
                }
            }
        }
        if (check == al) {
            return true;
        } else {
            return false;
        }


    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println((ret) ? "Anagrams" : "Not Anagrams");
    }
}

