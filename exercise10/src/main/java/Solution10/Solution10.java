/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Thomas Wallsmith
 */

/*
 *  PSEUDOCODE
 *      Prompt & read price & quantity of item 1, 2 and 3
 *      Calculate subtotal, tax, and total amounts
 *      Print results
 */

package Solution10;

import java.util.Scanner;

public class Solution10 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int item01 = getInput(sc, "Enter the price of item 1: ");
        int quantity01 = getInput(sc, "Enter the quantity of item 1: ");
        int item02 = getInput(sc, "Enter the price of item 2: ");
        int quantity02 = getInput(sc, "Enter the quantity of item 2: ");
        int item03 = getInput(sc, "Enter the price of item 3: ");
        int quantity03 = getInput(sc, "Enter the quantity of item 3: ");

        double subtotal = (item01*quantity01)+(item02*quantity02)+(item03*quantity03);
        double tax = subtotal*0.055;
        double total = tax + subtotal;

        printResult(subtotal, tax, total);

    }

    private static void printResult(double subtotal, double tax, double total) {
        System.out.printf("Subtotal: $%.2f\nTax: $%.2f\nTotal: $%.2f\n", subtotal, tax, total);
    }

    private static int getInput(Scanner sc, String s) {
        int number;
        System.out.print(s);
        number = sc.nextInt();
        return number;
    }
}
