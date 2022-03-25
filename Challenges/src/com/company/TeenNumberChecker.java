package com.company;

public class TeenNumberChecker {
    public static boolean hasTeen(int firstAge, int secondAge, int thirdAge) {
        if(isTeen(firstAge)) return true;
        if(isTeen(secondAge)) return true;
        if(isTeen(thirdAge)) return true;

        return false;
    }

    public static boolean isTeen(int age) {
        return age >= 13 && age <= 19;
    }
}
