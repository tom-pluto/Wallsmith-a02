/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Thomas Wallsmith
 *
 *  PSEUDOCODE:
 *      Prompt for weight
 *      Prompt for height
 *      Calculate BMI
 *      Determine underweight/ideal/overweight
 *      Print results
 */

package Solution19;

import java.util.Scanner;

public class Solution19 {

    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        double weight = scanDoubleOnly("Please enter your weight: ");
        double height = scanDoubleOnly("Please enter your height: ");

        evaluateBMI(weight, height);
    }

    private static double scanDoubleOnly(String prompt) {

        /*
        Prints the passed string (prompt).
        Scans console for input from user.
        If the input is not a double, tell the user it is invalid and re-print the prompt.
        If the input is a double, accept it and return it from the function.
         */

        double doubleResponse = 0;

        while(true) {

            System.out.printf("%s", prompt);
            String response = sc.next();

            try {
                doubleResponse = Double.parseDouble(response);
                break;
            }
            catch(NumberFormatException e) {
                System.out.print("Your input is not a valid number. Please try again using a valid number.\n");
            }
        }
        return doubleResponse;
    }

    private static void evaluateBMI(double weight, double height) {
        /*
        Calculates BMI from passed weight and height.
        Compares the calculated BMI to determine if the BMI is underweight (>18.5) or overweight (>25)
        Prints all results to console.
         */
        double bmi = (weight / (height * height)) * 703;
        System.out.printf("Your BMI is %.1f.\n", bmi);
        if(bmi > 18.5 && bmi < 25){
            System.out.printf("%s", "You are within the ideal weight range.\n");
        }
        else if(bmi < 18.5){
            System.out.printf("%s", "You are underweight. You should see your doctor.\n");
        }
        else if(bmi > 25){
            System.out.printf("%s", "You are overweight. You should see your doctor.\n");
        }
    }
}
