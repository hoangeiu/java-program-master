package com.company;

public class DecimalComparator {
    public static void main(String[] args) {
        System.out.println(areEqualByThreeDecimalPlaces(-3.1756, -3.175));
        System.out.println(areEqualByThreeDecimalPlaces(3.175, 3.174));
        System.out.println(areEqualByThreeDecimalPlaces(3.0, 3.0));

    }

    public static boolean areEqualByThreeDecimalPlaces(double firstNumber, double secondNumber) {
        return Math.abs((int)(firstNumber * 1000) - (int)(secondNumber * 1000)) == 0;
    }
}
