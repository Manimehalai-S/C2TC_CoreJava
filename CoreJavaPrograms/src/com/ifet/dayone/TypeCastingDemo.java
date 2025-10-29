package com.ifet.dayone;

public class TypeCastingDemo {
    public static void main(String[] args) {
        byte b = 10;
        int i = b;          
        double d = i;       
        int x = (int) d;   
        byte y = (byte) x;  

        System.out.println("byte to int: " + i);
        System.out.println("int to double: " + d);
        System.out.println("double to int: " + x);
        System.out.println("int to byte: " + y);
    }
}
