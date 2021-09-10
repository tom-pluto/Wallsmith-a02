/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Thomas Wallsmith
 */

/*
 *  PSEUDOCODE:
 *      Read current year
 *      Ask & read current age of user
 *      Ask & read desired retirement age of user
 *      Calculate time between now and retirement
 *      Calculate retirement year
 *      Print result
 */

package Solution;

import java.util.Calendar;
import java.util.Scanner;

public class Solution06 {
    public static void main(String[] args) {

        int currentAge;
        int retireAge;
        int currentYear;
        int retireYear;
        int meantime;

        currentYear = Calendar.getInstance().get(Calendar.YEAR);
        Scanner scanner = new Scanner(System.in);

        System.out.printf("What is your current age? ");
        currentAge = scanner.nextInt();
        System.out.printf("At what age would you like to retire? ");
        retireAge = scanner.nextInt();

        meantime = retireAge-currentAge;
        retireYear = currentYear+meantime;

        System.out.printf("You have %d years left until you can retire.%n", meantime);
        System.out.printf("It's %d, so you can retire in %d.%n", currentYear, retireYear);
    }
}
