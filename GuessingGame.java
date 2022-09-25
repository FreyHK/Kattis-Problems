/*
 * 22/09/2022
 * Frey Husted
 * 
 * https://open.kattis.com/problems/guessinggame
 */

import java.util.Scanner;

class GuessingGame {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        int low = 0;
        int high = 11;
        int guess = -1;

        while (sc.hasNextLine()) {
            if (guess == -1) {
                guess = sc.nextInt();

                if (guess == 0) {
                    break;
                }
            }else {
                //Check a game.
                sc.nextLine();
                String ans = sc.nextLine();

                if (ans.equals("too high")) {
                    high = Math.min(guess, high);
                }else if (ans.equals("too low")) {
                    low = Math.max(guess, low);
                }else {

                    //Determine if Stan was honest
                    if (guess <= low || guess >= high) {
                        System.out.println("Stan is dishonest");
                    }else {
                        System.out.println("Stan may be honest");
                    }
                    //Reset for next round
                    low = 0;
                    high = 11;
                }
                guess = -1;
            }
        }
        sc.close();
    }
}