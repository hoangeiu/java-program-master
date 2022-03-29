package com.company;

public class NumberPalindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome(11212));
    }

    public static boolean isPalindrome(int number) {
        int reverse = 0;
        int num = Math.abs(number);
        while (num > 0) {
            int lastDigit = num % 10;
            reverse = 10 * reverse + lastDigit;

            num /= 10;
        }

        return number == reverse * (number < 0 ? -1 : 1);
    }
}
