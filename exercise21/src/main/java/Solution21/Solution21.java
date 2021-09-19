/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Thomas Wallsmith
 *
 *  PSEUDOCODE
 *      Prompt and read integer input
 *      Switch based on input
 *          Case 1
 *              string = "January"
 *          Case 2
 *              string = "February"
 *          ...
 *          Case 12
 *              string = "December"
 *      Output result
 */

package Solution21;

import java.util.Scanner;

public class Solution21 {

    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int input;
        String result;

        input = readInput();

        result = getString(input);

        System.out.printf("%s\n", result);
    }

    private static String getString(int input) {
        return switch (input) {
            case 1  -> "The name of the month is January.";
            case 2  -> "The name of the month is February.";
            case 3  -> "The name of the month is March.";
            case 4  -> "The name of the month is April.";
            case 5  -> "The name of the month is May.";
            case 6  -> "The name of the month is June.";
            case 7  -> "The name of the month is July.";
            case 8  -> "The name of the month is August.";
            case 9  -> "The name of the month is September.";
            case 10 -> "The name of the month is October.";
            case 11 -> "The name of the month is November.";
            case 12 -> "The name of the month is December.";
            default -> "Invalid selection.";
        };
    }

    private static int readInput() {
        int input;
        do{
            System.out.print("Please enter the number of the month: ");
            input = sc.nextInt();
        }while(input > 12 || input < 1);
        return input;
    }
}
