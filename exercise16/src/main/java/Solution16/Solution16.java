/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Thomas Wallsmith
 */

/*
    PSEUDOCODE
        Print "What is your age? "
        Read age from console
        Using ternary statement
            If age>=16 is true: statement = "You are old enough to legally drive."
            If age>=16 is false: statement = "You are not old enough to legally drive."
        Print statement
 */

package Solution16;

import java.util.Scanner;

public class Solution16 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.printf("What is your age? ");
        int age = sc.nextInt();
        String statement = age>=16 ? "You are old enough to legally drive.\n" : "You are not old enough to legally drive.\n";
        System.out.printf("%s", statement);
    }
}
