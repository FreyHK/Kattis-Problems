/*
 * 23/09/2022
 * Frey Husted
 * 
 * https://open.kattis.com/problems/3dprinter
 */

import java.util.Scanner;

class ThreeDStatues {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        System.out.println((int)Math.ceil((Math.log(a) / Math.log(2))) + 1);
        
        sc.close();
    }
}