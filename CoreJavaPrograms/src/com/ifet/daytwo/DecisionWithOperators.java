package com.ifet.daytwo;

public class DecisionWithOperators {
    public static void main(String[] args) {
        int a = 10, b = 20, c = 15;

        if (a < b && b > c) {
            System.out.println("Both conditions are true");
        }

        if (a != c) {
            System.out.println("a and c are not equal");
        }
    }
}
