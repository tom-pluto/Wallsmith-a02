/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Thomas Wallsmith
 *
 *  PSEUDOCODE
 *      Read number A
 *      Read number B
 *      Read number C
 *      If all numbers are equal
 *          Print that all numbers are equal
 *      Else if A is greater than B and C
 *          Print that A is the greatest number
 *      Else if B is greater than A and C
 *          Print that B is the greatest number
 *      Else if C is greater than A and B
 *          Print that C is the greatest number
 */

package Solution22;

import java.util.Scanner;

public class Solution22 {

    private static final Scanner sc = new Scanner(System.in);

    private static int A;
    private static int B;
    private static int C;

    public static void main(String[] args) {
        readNumbers();
        determineLargest();
    }

    private static void determineLargest() {
        if(A == B && A == C){
            System.out.print("There is no biggest value, because they are all equal.\n");
        }
        else if(A > B && A > C) {
            System.out.printf("The largest number is %d.", A);
        }
        else if(B > A && B > C){
            System.out.printf("The largest number is %d.", B);
        }
        else if(C > A && C > B){
            System.out.printf("The largest number is %d.", C);
        }
    }

    private static void readNumbers() {
        System.out.print("Enter the first number: ");
        A = sc.nextInt();
        System.out.print("Enter the second number: ");
        B = sc.nextInt();
        System.out.print("Enter the third number: ");
        C = sc.nextInt();
    }
}
