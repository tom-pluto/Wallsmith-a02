/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Thomas Wallsmith
 */

/*
    PSEUDOCODE
        prompt for principle amount
            read into principle
        prompt for rate
            read into rate
        prompt for number of years
            read into rate
        prompt for compound interval
            read into interval
        calculate result
        print result
 */

package Solution13;

import java.util.Scanner;
import java.lang.Math;

public class Solution13 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double principle = getPrinciple(sc);
        double rate = getRate(sc);
        double years = getYears(sc);
        double interval = getInterval(sc);

        double result = principle * Math.pow(1+rate/interval, interval*years);
        System.out.printf("$%.2f invested at %.1f%% for %.0f years compounded %.0f times a year is $%.2f.", principle, rate*100, years, interval, result);
    }

    private static double getInterval(Scanner sc) {
        System.out.printf("What is the number of time the interest is compounded per year? ");
        double interval = sc.nextDouble();
        return interval;
    }

    private static double getYears(Scanner sc) {
        System.out.printf("What is number of years? ");
        return sc.nextDouble();
    }

    private static double getRate(Scanner sc) {
        System.out.printf("What is the rate? ");
        return sc.nextDouble()/100;
    }

    private static double getPrinciple(Scanner sc) {
        System.out.printf("What is the principle amount? ");
        return sc.nextDouble();
    }
}
