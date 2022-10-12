/*
 * 27/09/2022
 * Frey Husted
 * 
 * https://open.kattis.com/problems/heimavinna
 */

import java.util.Scanner;

class HomeWork {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        String in = sc.nextLine();

        int sum = 0;

        String[] blocks = in.split(";");
        for (String block : blocks) {
            if (block.contains("-")) {
                String[] nums = block.split("-");
                sum += Integer.parseInt(nums[1]) - Integer.parseInt(nums[0]) + 1;
            }else {
                sum ++;
            }
        }
        
        System.out.println(sum);
    }
}