/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Thomas Wallsmith
 */

/*
 *  PSEUDOCODE:
 *      Ask for number of people
 *          store in numPeople
 *      Ask for how many pizzas
 *          store in numPizza
 *      Ask for how many slices per pizza
 *          store in numSlices
 *      Calculate number of slices
 *          store in slicesTotal
 *      Calculate slices per person
 *          store in slicesPerPerson
 *      Calculate leftover slices
 *          store in slicesLeftover
 *      Print read information and resSlices
 *      Print slicesPerPerson
 *      Print slicesLeftover
 */
package Solution08;

import java.util.Scanner;

public class Solution08 {
    public static void main(String[] args) {

        int numPeople;
        int numPizza;
        int numSlice;
        int sliceTotal;
        int slicePerPerson;
        int slicesLeftover;
        Scanner sc = new Scanner(System.in);

        System.out.printf("How many people? ");
        numPeople = sc.nextInt();
        System.out.printf("How many pizzas do you have? ");
        numPizza = sc.nextInt();
        System.out.printf("How many slices per pizza? ");
        numSlice = sc.nextInt();

        sliceTotal = numSlice*numPizza;
        slicePerPerson = sliceTotal/numPeople;
        slicesLeftover = sliceTotal-(numPeople*slicePerPerson);

        System.out.printf("%d people with %d pizzas (%d slices)\n", numPeople, numPizza, sliceTotal);
        System.out.printf("Each person gets %d pieces of pizza.\n", slicePerPerson);
        System.out.printf("There are %d leftover pieces.\n", slicesLeftover);
    }
}
