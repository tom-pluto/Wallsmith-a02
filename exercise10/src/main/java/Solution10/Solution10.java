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

        int item01, quantity01;
        int item02, quantity02;
        int item03, quantity03;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the price of item 1: ");
        item01 = sc.nextInt();
        System.out.print("Enter the quantity of item 1: ");
        quantity01 = sc.nextInt();
        System.out.print("Enter the price of item 2: ");
        item02 = sc.nextInt();
        System.out.print("Enter the quantity of item 2: ");
        quantity02 = sc.nextInt();
        System.out.print("Enter the price of item 3: ");
        item03 = sc.nextInt();
        System.out.print("Enter the quantity of item 3: ");
        quantity03 = sc.nextInt();

        double subtotal = (item01*quantity01)+(item02*quantity02)+(item03*quantity03);
        double tax = subtotal*0.055;
        double total = tax + subtotal;

        System.out.printf("Subtotal: $%.2f\nTax: $%.2f\nTotal: $%.2f\n", subtotal, tax, total);

    }
}
