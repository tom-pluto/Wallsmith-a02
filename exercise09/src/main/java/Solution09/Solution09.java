/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Thomas Wallsmith
 */

package Solution09;

import java.util.Scanner;

import static java.lang.Math.ceil;

/*
    PSEUDOCODE
        Prompt for length of room
            Store in roomLength
        Prompt for width of room
            Store in roomWidth
        Calculate square feet of room
            Store in roomSize
        Calculate paint needed
            Divide roomSize by 350
            Store in resGallons
        Print requested string to console
 */
public class Solution09 {
    public static void main(String[] args) {

        double roomSize;
        double resGallons;

        Scanner sc = new Scanner(System.in);

        double roomLength = getDimensions(sc, "What is the length of the room? ");
        double roomWidth = getDimensions(sc, "What is the width of the room? ");

        roomSize = roomWidth*roomLength;
        resGallons = ceil(roomSize/350);

        System.out.printf("You will need to purchase %.0f gallons of paint to cover %.0f square feet.", resGallons, roomSize);
    }

    private static double getDimensions(Scanner sc, String s) {
        double roomLength;
        System.out.printf(s);
        roomLength = sc.nextDouble();
        return roomLength;
    }
}
