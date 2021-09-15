/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Thomas Wallsmith
 */

/*
    PSEUDOCODE
        Ask & read subtotal
        Ask & read user input for state
        if state = MI
            Print subtotal
            Calculate tax
            Print tax
            Calculate total
            Print total
        else
            Print subtotal as total

 */


package Solution14;

import java.util.Objects;
import java.util.Scanner;

public class Solution14 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("What is the order amount? ");
        double subtotal = sc.nextDouble();
        System.out.print("What is the state? ");
        String state = sc.next();

        if(Objects.equals(state, "WI")){
            System.out.printf("The subtotal is $%.2f.\n", subtotal);
            double tax = 0.055*subtotal;
            System.out.printf("The tax is $%.2f.\n", tax);
            double total = tax+subtotal;
            System.out.printf("The total is $%.2f.\n", total);
        }
        else{
            System.out.printf("The total is $%.2f.\n", subtotal);
        }
    }
}
