package com.epam.langSyntax;

public class NumberReverter {

    public void revert(int number) {
        number = (number % 10) * 100 + (number % 100) / 10 * 10 + number / 100;
        System.out.println(number);
    }

}
