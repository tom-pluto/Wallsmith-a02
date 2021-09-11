package Solution12;

import java.util.Scanner;

public class Solution12 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.printf("Enter the principle: ");
        double principle = sc.nextDouble();
        System.out.printf("Enter the rate of interest: ");
        double rate = sc.nextDouble()/100;
        System.out.printf("Enter the number of years: ");
        double years = sc.nextDouble();

        double result = principle*(1+(rate*years));
        System.out.printf("After %.0f years at %.1f%%, the investment will be worth $%.2f\n", years, rate*100, result);
    }
}
