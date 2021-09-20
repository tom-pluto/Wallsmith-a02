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

        Scanner sc = new Scanner(System.in);

        int roomLength = getRoomLength(sc);
        int roomWidth = getRoomWidth(sc);
        System.out.printf("You entered dimensions of %d feet by %d feet.\n", roomWidth, roomLength);
        System.out.print("The area is\n");

        int resFeet = roomLength*roomWidth;
        double resMeter = resFeet*0.09290304;

        printResults(resFeet, resMeter);

    }

    private static int getRoomWidth(Scanner sc) {
        int roomWidth;
        System.out.print("What is the width of the room in feet? ");
        roomWidth = sc.nextInt();
        return roomWidth;
    }

    private static int getRoomLength(Scanner sc) {
        int roomLength;
        System.out.print("What is the length of the room in feet? ");
        roomLength = sc.nextInt();
        return roomLength;
    }

    private static void printResults(int resFeet, double resMeter) {
        System.out.printf("%d square feet\n%.3f square meters", resFeet, resMeter);
    }
}
