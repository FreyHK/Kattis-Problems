/*
 * 27/09/2022
 * Frey Husted
 * 
 * https://open.kattis.com/problems/fyi
 */

import java.util.Scanner;

class FYI {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        if (sc.nextLine().startsWith("555")) {
            System.out.println(1);
        }else {
            System.out.println(0);
        }
    }
}