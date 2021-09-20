/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Thomas Wallsmith
 */

/*
    PSEUDOCODE:
        Prompt & read for number of euros to be exchanged
        Prompt & read for exchange rate
        Calculate USD value
        Print information to console
 */

package Solution11;

import java.util.Scanner;

public class Solution11 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double euros = getInput(sc, "How many euros are you exchanging? ");
        double rate = getInput(sc, "What is the exchange rate? ");

        double result = rate*euros;
        System.out.printf("%.2f euros at an exchange rate of %.2f is\n%.2f U.S. dollars.\n", euros, rate, result);
    }

    private static double getInput(Scanner sc, String s) {
        System.out.print(s);
        return sc.nextDouble();
    }
}
