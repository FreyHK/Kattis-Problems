/*
 * 22/09/2022
 * Frey Husted
 * 
 * https://open.kattis.com/problems/2048
 */

import java.util.Scanner;

class TwoThousandFortyEight {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNextLine()) {
            
            int[][] board = {
                { 0, 0, 0, 0 },
                { 0, 0, 0, 0 },
                { 0, 0, 0, 0 },
                { 0, 0, 0, 0 }
            };

            //Load input
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 4; j++) {
                    board[i][j] = sc.nextInt();
                    //System.out.println("reading: " + board[i][j] + " at (" + i + ", " + j + ")");
                }
            }
            int move = sc.nextInt();
            
            


            //Output result
            for (int i = 0; i < 4; i++) {
                String s = board[i][0] + "";
                for (int j = 1; j < 4; j++) {
                    s += " " + board[i][j];
                }
                System.out.println(s);
            }


        }
    }
}