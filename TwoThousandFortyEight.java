/*
 * 27/09/2022
 * Frey Husted
 * 
 * https://open.kattis.com/problems/2048
 */

import java.util.Scanner;

class TwoThousandFortyEight {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNextLine()) {
            
            int[][] board = new int[4][4];

            //Load input
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 4; j++) {
                    board[i][j] = sc.nextInt();
                    //System.out.println("reading: " + board[i][j] + " at (" + i + ", " + j + ")");
                }
            }
            //0, 1, 2, 3 - left, up, right, down
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
        sc.close();
    }

    boolean isInsideBoard(int x, int y) {
        return x >= 0 && x <= 4 && y >= 0 && x <= 4;
    }

    void pushCell(int ix, int iy, int jx, int jy) {

    }
}