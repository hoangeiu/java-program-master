package com.company;

public class FlourPackProblem {
    public static void main(String[] args) {
        System.out.println(canPack(0, 5 , 4));
    }

    public static boolean canPack(int bigCount, int smallCount, int goal) {
        if (bigCount < 0 || smallCount < 0 || goal < 0) return false;
        if (bigCount * 5 + smallCount * 1 < goal) return false;

        if (goal % 5 == 0) {
            return true;
        } else {
            int remainingGoal = goal % 5;
            if (smallCount >= remainingGoal) {
                return true;
            }
        }

        return false;
    }
}
