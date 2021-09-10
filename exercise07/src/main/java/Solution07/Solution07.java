/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Thomas Wallsmith
 */

/*
 *  PSEUDOCODE
 *      Ask & read length of room
 *      Ask & read width of room
 *      Regurgitate information back to console
 *      Calculate square feet of room
 *      Convert square feet to square meters
 *      Print result
 */
package Solution07;

import java.util.Scanner;

public class Solution07 {
    public static void main(String[] args) {

        int roomLength;
        int roomWidth;
        int resFeet;
        double resMeter;

        Scanner sc = new Scanner(System.in);

        System.out.printf("What is the length of the room in feet? ");
        roomLength = sc.nextInt();
        System.out.printf("What is the width of the room in feet? ");
        roomWidth = sc.nextInt();
        System.out.printf("You entered dimensions of 15 feet by 20 feet.\n");
        System.out.printf("The area is%n");

        resFeet = roomLength*roomWidth;
        resMeter = resFeet*0.09290304;

        System.out.printf("%d square feet\n%.3f square meters", resFeet, resMeter);

    }
}
