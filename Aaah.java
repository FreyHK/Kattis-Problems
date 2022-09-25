/*
 * 22/09/2022
 * Frey Husted
 * 
 * https://open.kattis.com/problems/aaah
 */

import java.util.Scanner;

class Aaah {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()) {
            String a = sc.nextLine();
            String b = sc.nextLine();

            if (a.length() < b.length()) {
                System.out.println("no");
            }else {
                System.out.println("go");
            }
        }
        sc.close();
    }
}
