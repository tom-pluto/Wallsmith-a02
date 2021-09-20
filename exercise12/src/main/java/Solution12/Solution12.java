package Solution12;

import java.util.Scanner;

public class Solution12 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double principle = getPrinciple(sc);
        double rate = getRate(sc);
        double years = getYears(sc);

        double result = principle*(1+(rate*years));
        System.out.printf("After %.0f years at %.1f%%, the investment will be worth $%.2f\n", years, rate*100, result);
    }

    private static double getYears(Scanner sc) {
        System.out.printf("Enter the number of years: ");
        return sc.nextDouble();
    }

    private static double getRate(Scanner sc) {
        System.out.printf("Enter the rate of interest: ");
        return sc.nextDouble()/100;
    }

    private static double getPrinciple(Scanner sc) {
        System.out.printf("Enter the principle: ");
        return sc.nextDouble();
    }
}
