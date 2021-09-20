/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Thomas Wallsmith
 *
 *  PSEUDOCODE
 *      Ask Is the car silent when you turn the key?
 *      If yes
 *          Ask Are the battery terminals corroded?
 *          If yes
 *              Print Clean terminals and try starting again.
 *          If no
 *              Print Replace cables and try again.
 *      If no
 *          Ask Does the car make a slicking noise?
 *          If yes
 *              Print Replace the battery.
 *          If no
 *              Ask Does the car crank up but fail to start?
 *              If yes
 *                  Print Check spark plug connections.
 *              If no
 *                  Ask Does the engine start and then die?
 *                  If yes
 *                      Ask Does you car have fuel injection?
 *                      If yes
 *                          Print Get it in for service.
 *                      If no
 *                          Print Check to ensure the choke is opening and closing.
 *                  If no
 *                      Print this should not be possible
 */

package Solution23;

import java.util.Locale;
import java.util.Scanner;

public class Solution23 {

    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        String choice;

        System.out.print("Is the car silent when you turn the key? ");
        choice = getChoice();

        determineRecommendation(choice);

    }

    private static void determineRecommendation(String choice) {
        if(choice.equals("Y")) {

            System.out.print("Are the battery terminals corroded? ");
            choice = getChoice();

            if(choice.equals("Y")) {
                System.out.print("Clean terminals and try starting again.\n");
            }

            else {
                System.out.print("Replace cables and try again.\n");
            }

        }
        else {

            System.out.print("Does the car make a slicking noise? ");
            choice = getChoice();

            if(choice.equals("Y")) {
                System.out.print("Replace the battery.\n");
            }
            else{
                System.out.print("Does the car crank up but fail to start? ");
                choice = getChoice();

                if(choice.equals("Y")){
                    System.out.print("Check spark plug connections.\n");
                }
                else{
                    System.out.print("Does the engine start and then die? ");
                    choice = getChoice();

                    if(choice.equals("Y")){
                        System.out.print("Does you car have fuel injection? ");
                        choice = getChoice();

                        if(choice.equals("Y")){
                            System.out.print("Get it in for service.\n");
                        }
                        else{
                            System.out.print("Check to ensure the choke is opening and closing.\n");
                        }
                    }
                    else{
                        System.out.print("This should not be possible.\n");
                    }
                }
            }
        }
    }

    private static String getChoice() {
        String choice;
        choice = sc.next();
        choice = choice.toUpperCase(Locale.ROOT);
        return choice;
    }
}
