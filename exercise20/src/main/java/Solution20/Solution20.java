/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Thomas Wallsmith
 *
 *  PSEUDOCODE
 *      Prompt and scan for amount
 *      Prompt and scan for state
 *      If state == Wisconsin
 *          taxRate = 0.05
 *          Prompt and scan for county
 *          If county == Eau Claire
 *              taxRate += 0.005
 *          Else if county == Dunn
 *              taxRate += 0.004
 *      Else if state == Illinois
 *          taxRate = 0.08
 *      Else
 *          taxRate = 0
 *      Calculate tax
 *      Calculate amount + tax
 *      Print results to console
 */

package Solution20;

import java.util.Scanner;

public class Solution20 {

    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        //prompting for stuff
        double amount = scanDoubleOnly();
        System.out.print("What state do you live in? ");
        String state = sc.next();

        //figure out tax rate
        double taxRate = getTaxRate(state);

        //do the calculations
        double tax = amount*taxRate;
        double total = amount+tax;

        //print results
        printResults(tax, total);

    }

    private static void printResults(double tax, double total) {
        System.out.printf("""
                        The tax is $%.2f.
                        The total is $%.2f
                        """,
                tax, total);
    }

    private static double getTaxRate(String state) {
        double taxRate;
        if(state.equals("Wisconsin")){
            taxRate = 0.05;
            System.out.print("What county do you live in? ");
            String county = sc.next();
            if(county.equals("Eau Claire")){
                taxRate += 0.005;
            }
            else if(county.equals("Dunn")){
                taxRate += 0.004;
            }
        }
        else if(state.equals("Illinois")){
            taxRate = 0.08;
        }
        else{
            taxRate = 0;
        }
        return taxRate;
    }

    private static double scanDoubleOnly() {

        double doubleResponse = 0;

        while(true) {

            System.out.printf("%s", "What is the order amount? ");
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
}