package com.company;

public class Ch714 {

    public static int product(int... num2) {

        int p = 1;

        for (int num1 : num2) {
            p *= num1;
        }
        return p;
    }

    public static void main(String[] args) {

        int a = 5;
        int b = 6;
        int c = 7;
        int d = 8;
        int e = 9;

        System.out.printf("\nThe product of a and b is: %d%n", product(a, b));

        System.out.printf("\nThe product of a, b and c is: %d%n", product(a, b, c));

        System.out.printf("\nThe product of a, b, c and d is: %d%n", product(a, b, c, d));

        System.out.printf("\nThe product of a, b, c, d and e is: %d%n", product(a, b, c, d, e));

    }
}