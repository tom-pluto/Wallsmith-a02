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

        System.out.printf("What is the principle amount? ");
        double principle = sc.nextDouble();
        System.out.printf("What is the rate? ");
        double rate = sc.nextDouble()/100;
        System.out.printf("What is number of years? ");
        double years = sc.nextDouble();
        System.out.printf("What is the number of time the interest is compounded per year? ");
        double interval = sc.nextDouble();

        double result = principle * Math.pow(1+rate/interval, interval*years);
        System.out.printf("$%.2f invested at %.1f%% for %.0f years compounded %.0f times a year is $%.2f.", principle, rate*100, years, interval, result);
    }
}
