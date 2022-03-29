package com.company;

public class EvenDigitSum {
    public static void main(String[] args) {

    }

    public static int getEvenDigitSum(int number) {
        if (number < 0) return -1;
        int total = 0;
        while (number > 0) {
            int lastDigit = number % 10;
            if (lastDigit % 2 == 0) {
                total += lastDigit;
            }
            number /= 10;
        }
        return total;
    }
}
