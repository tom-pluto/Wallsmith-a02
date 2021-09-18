/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Thomas Wallsmith
 *
 *  PSEUDOCODE
 *      Print prompt
 *      If input == "C/c" or input == "F/f"
 *          Continue
 *      Else
 *          Print prompt again and test the if condition again
 *      If input = C
 *          Read input for Fahrenheit
 *          Calculate celsius equivalent
 *          Print result
 *      Else if input = F
 *          Read input for Celsius
 *          Calculate Fahrenheit equivalent
 *          Print result
 */

package Solution18;

import java.util.Locale;
import java.util.Scanner;

public class Solution18 {

    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        String selection;

        do {
            System.out.print("""
                Press C to convert from Fahrenheit to Celsius.
                Press F to convert from Celsius to Fahrenheit.
                """);
            System.out.print("Your choice: ");
            selection = sc.next();
            selection = selection.toUpperCase(Locale.ROOT);
        } while (!selection.equals("C") && !selection.equals("F"));

        if(selection.equals("C")){
            System.out.print("Please enter the temperature in Fahrenheit: ");
            double F = sc.nextDouble();
            double C = (F-32)*5/9;
            System.out.printf("The temperature in Celsius is %.0f.\n", C);
        }
        else
        {
            System.out.print("Please enter the temperature in Celsius: ");
            double C = sc.nextDouble();
            double F = (C*9/5)+32;
            System.out.printf("The temperature in Fahrenheit is %.0f.\n", F);
        }
    }
}
