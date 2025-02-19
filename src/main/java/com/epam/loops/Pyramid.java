package com.epam.loops;

public class Pyramid {

    public void printPyramid(int cathetusLength) {
        for (int i = 1; i <= cathetusLength; i++) {

            for (int j = i; j < cathetusLength; j++) {
                System.out.print(' ');
            }

            for (int j = 1; j <= i * 2 - 1; j++) {
                System.out.print(Math.abs(i - j) + 1);
            }

            System.out.println();

        }
    }

    public static void main(String[] args) {
        new Pyramid().printPyramid(7);
    }

}
