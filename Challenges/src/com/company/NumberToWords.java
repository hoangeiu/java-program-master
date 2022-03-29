package com.company;

public class NumberToWords {
    public static void main(String[] args) {
        numberToWords(0);
    }

    public static void numberToWords(int number) {
        if (number < 0) System.out.println("Invalid Value");
        int reverseNumber = reverse(number);
        int count = getDigitCount(number);
        int acc = 0;
        while (reverseNumber > 0) {
            int lastDigit = reverseNumber % 10;
            switch (lastDigit) {
                case 0:
                    System.out.println("Zero");
                    acc++;
                    break;
                case 1:
                    System.out.println("One");
                    acc++;
                    break;
                case 2:
                    System.out.println("Two");
                    acc++;
                    break;
                case 3:
                    System.out.println("Three");
                    acc++;
                    break;
                case 4:
                    System.out.println("Four");
                    acc++;
                    break;
                case 5:
                    System.out.println("Five");
                    acc++;
                    break;
                case 6:
                    System.out.println("Six");
                    acc++;
                    break;
                case 7:
                    System.out.println("Seven");
                    acc++;
                    break;
                case 8:
                    System.out.println("Eight");
                    acc++;
                    break;
                case 9:
                    System.out.println("Nine");
                    acc++;
                    break;
                default:
                    break;
            }
            reverseNumber /= 10;
        }
        for (int i = 0; i < count - acc; i++) {
            System.out.println("Zero");
        }
    }

    public static int reverse(int number) {
        int reverse = 0;
        int num = Math.abs(number);
        while (num > 0) {
            int lastDigit = num % 10;
            reverse = 10 * reverse + lastDigit;
            num /= 10;
        }
        return reverse * (number < 0 ? -1 : 1);
    }

    public static int getDigitCount(int number) {
        if (number < 0) return -1;
        if (number == 0) return 1;
        int count = 0;
        while (number > 0) {
            count++;
            number /= 10;
        }
        return count;
    }
}
