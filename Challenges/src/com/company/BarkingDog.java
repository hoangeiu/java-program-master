package com.company;

public class BarkingDog {
    public static void main(String[] args) {
        System.out.println(shouldWakeUp(true, 22));
    }

    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
        if (barking && ((hourOfDay >=0 && hourOfDay < 8) || (hourOfDay > 22 && hourOfDay <= 23))) {
            return true;
        }
        return false;
    }
}
