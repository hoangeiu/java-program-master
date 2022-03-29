package com.company;

public class SharedDigit {
    public static void main(String[] args) {
        System.out.println(hasSharedDigit(15, 25));
    }

    public static boolean hasSharedDigit(int a, int b) {
        if (a < 10 || a > 99 || b < 10 || b > 99) {
            return false;
        }
        while (a > 0) {
            int c = a % 10;
            int initialSecondNumber = b;
            while (initialSecondNumber > 0) {
                int d = initialSecondNumber % 10;
                if (c == d) {
                    return true;
                }
                initialSecondNumber /= 10;
            }
            a /= 10;
        }

        return false;
    }
}
