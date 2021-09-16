/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Thomas Wallsmith
 */

/*
    PSEUDOCODE
        Print "What is the password? " to console
        Read console input into userPass
        If userPass = "abc$123"
            Print "Welcome!"
        Else
            Print "I don't know you."
 */

package Solution15;

import java.util.Objects;
import java.util.Scanner;

public class Solution15 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("What is the password? ");
        String userPass = sc.next();
        if(Objects.equals(userPass, "abc$123")){
            System.out.printf("Welcome!\n");
        }
        else{
            System.out.printf("I don't know you.\n");
        }
    }
}
