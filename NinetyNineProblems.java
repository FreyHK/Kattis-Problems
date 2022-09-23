/*
 * 22/09/2022
 * Frey Husted
 * 
 * https://open.kattis.com/problems/99problems
 */

import java.util.Scanner;

class NinetyNineProblems {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()) {
            int a = sc.nextInt();
            
            double d = (double)a/100; //Divided number
            double low = Math.floor(d)*100-1; //Low candidate
            double high = Math.ceil(d)*100-1; //High candidate

            int out;
            if (low > 0 && Math.abs(a-low) < Math.abs(a-high)) {
                out = (int)low;
            }else {
                out = (int)high;
            }
            System.out.println(out);
            //System.out.println("num: " + a + " low: " + low + " high: " + high + " out: " + out);
        }
    }
}