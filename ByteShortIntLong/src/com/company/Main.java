package com.company;

public class Main {

    public static void main(String[] args) {
	    int myValue = 10000;

        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;
        System.out.println("Integer Minimum Value = " + myMinIntValue);
        System.out.println("Integer Maximum Value = " + myMaxIntValue);
        System.out.println("Busted MAX Value = " + (myMaxIntValue + 1));
        System.out.println("Busted MIN Value = " + (myMinIntValue - 1));

        int myMaxIntTest = 2_147_483_647;

        byte myByteValue = 100;
        short myShortValue = 1000;
        int myIntValue = 10000;
        long myLastLongValue = 50000L + 10L * (myByteValue + myShortValue + myIntValue);
        System.out.println(myLastLongValue);

        short shortTotal = (short) (1000 + 10 * (myByteValue + myShortValue + myIntValue));

        float myFloatValue = 5f / 3f;
        double myDoubleValue = 5.00 / 3.00;
        System.out.println(myFloatValue);
        System.out.println(myDoubleValue);

        double numberOfPounds = 200d;
        double convertedKilograms = numberOfPounds * 0.45359237d;
        System.out.println(convertedKilograms);

        char myChar = 'D';
        char myUnicodeChar = '\u0044';
        System.out.println(myUnicodeChar);
    }
}
