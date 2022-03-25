package com.company;

public class LeapYear {
    public static void main(String[] args) {
        System.out.println(isLeapYear(1924));
    }

    public static boolean isLeapYear(int year) {
        if (year < 1 || year > 9999) return false;

        int divideFour = year % 4;
        int divideOneHundred = year % 100;
        int divideFourHundred = year % 400;

        if (divideFour == 0) {
            if (divideOneHundred != 0) {
                return true;
            } else if (divideFourHundred == 0) {
                return true;
            }
        }

        return false;
    }
}
