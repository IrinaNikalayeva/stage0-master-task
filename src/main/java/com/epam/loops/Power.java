package com.epam.loops;

public class Power {

    public void printPower(int numberToPrint, int power) {
        int finalNum = 1;
        for (int i = 1; i <= power; i++) {
            finalNum *= numberToPrint;
        }
        System.out.println(finalNum);


    }

    public static void main(String[] args) {
        new Power().printPower(10, 3);
    }

}
