/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Thomas Wallsmith
 */

/*
    PSEUDOCODE
        Print "Enter a 1 if you are male or a 2 if you are female: "
        Read input into gender
        If gender = 1
            Set r to 0.73
        Else
            Set r to 0.66

        Print "How many ounces of alcohol did you have? "
        Read input into A
        Print "What is your weight, in pounds? "
        Read input into W
        Print "How many hours has it been since your last drink? "
        Read input into H
        Calculate BAC using provided formula
        Determine if BAC is above or below legal limit.
        Print result

        ---
        BAC = (A × 5.14 / W × r) − .015 × H
        A is total alcohol consumed, in ounces (oz).
        W is body weight in pounds.
        r is the alcohol distribution ratio:
        0.73 for men
        0.66 for women
        H is number of hours since the last drink.
 */

package Solution17;

import java.util.Scanner;

public class Solution17 {

    //BAC calculation variables
    private static double A;               // total alcohol consumed in ounces
    private static double W;               // body weight in lbs
    private static double r;               // alcohol distribution ratio: 0.73 for men, 0.66 for women
    private static double H;               // # of hours since last drink

    private static final Scanner sc = new Scanner(System.in);

    private static double scanDoubleOnly(String prompt) {

        /*
        Prints the passed string (prompt).
        Scans console for input from user.
        If the input is not a double, tell the user it is invalid and re-print the prompt.
        If the input is a double, accept it and return it from the function.
         */

        double doubleResponse = 0;
        int flag = 0;

        while(flag != 1) {

            System.out.printf("%s", prompt);
            String response = sc.next();

            try {
                doubleResponse = Double.parseDouble(response);
                flag = 1;
            }
            catch(NumberFormatException e) {
                System.out.print("Your input is not a valid number. Please try again using a valid number.\n");
            }
        }
        return doubleResponse;
    }

    private static int scan1or2Only() {

        /*
        Scans console for input from user.
        If the input is not an integer, tell the user it is invalid and re-print the prompt.
        If the input is an integer, check to see if it is 1 or 2.
        If the input is 1 or 2, accept it and move on.
         */

        int intResponse;

        while(true) {

            System.out.printf("%s", "Enter a 1 if you are male or a 2 if you are female: ");
            String response = sc.next();

            try {
                intResponse = Integer.parseInt(response);
                if(intResponse == 1 || intResponse == 2) {
                    break;
                }
                else{
                    System.out.print("Invalid choice.\n");
                }
            }
            catch(NumberFormatException e) {
                System.out.print("Invalid choice.\n");
            }

        }
        return intResponse;
    }

    private static double calculateBAC() {

        /*
        Runs the BAC formula given by exercise 17.
        Returns a double representing the calculated BAC.
         */

        double BAC;
        BAC = (A*5.14 / W*r) - .015*H;
        //debug System.out.printf("=%.5f\n", BAC);
        return BAC;
    }

    public static void main(String[] args) {
        int genderReply;

        genderReply = scan1or2Only();

        if(genderReply == 1) {
            r = 0.73;
        }
        else {
            r = 0.66;
        }

        A = scanDoubleOnly("How many ounces of alcohol did you have? ");
        W = scanDoubleOnly("What is your weight, in pounds? ");
        H = scanDoubleOnly("How many hours has it been since your last drink? ");

        evaluateBAC();

    }

    private static void evaluateBAC() {

        /*
        Calls the BAC calculation function.
        Prints BAC result.
        Prints if the BAC result falls above/below the legal limit (0.08).
         */

        double BAC = calculateBAC();
        System.out.printf("\nYour BAC is %.6f\n", BAC);

        if(BAC < 0.08){
            System.out.printf("%s", "It is legal for you to drive.\n");
        }
        else{
            System.out.printf("%s", "It is not legal for you to drive.\n");
        }
    }
}
