package com.company;

public class MegaBytesConverter {
    public static void main(String[] args) {
        printMegaBytesAndKiloBytes(-1024);
    }

    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        if (kiloBytes < 0) {
            System.out.println("Invalid Value");
        } else {
            int mbToKilobytes = 1024;
            int mb = kiloBytes / mbToKilobytes;
            int remainingKilobytes = kiloBytes % mbToKilobytes;
            System.out.println(kiloBytes + " KB = " + mb + " MB and " + remainingKilobytes + " KB");
        }
    }
}
