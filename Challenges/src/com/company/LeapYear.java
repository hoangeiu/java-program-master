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

    public static int getDaysInMonth(int month, int year) {
        if (month < 1 || month > 12 || year < 1 || year > 9999) {
            return -1;
        }

        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                return 31;
            case 2:
                if (isLeapYear(year)) {
                    return 29;
                } else {
                    return 28;
                }
        }

        return 30;
    }
}
