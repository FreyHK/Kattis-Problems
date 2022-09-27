/*
 * 27/09/2022
 * Frey Husted
 * 
 * https://open.kattis.com/problems/echoechoecho
 */

import java.util.Scanner;

class EchoEchoEcho {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        String w = sc.next();
        System.out.println(w + " " + w + " " + w);
    }
}