package com.ifet.dayone;

public class CharDemo {
    public static void main(String[] args) {
        
        char letter1 = 'A';
        char letter2 = 'B';
        char symbol = '#';
        char digit = '5';
      
       
        System.out.println("Letter 1: " + letter1);
        System.out.println("Letter 2: " + letter2);
        System.out.println("Symbol: " + symbol);
        System.out.println("Digit: " + digit);


        int asciiValue = letter1;
        System.out.println("ASCII value of '" + letter1 + "' is: " + asciiValue);

        
        char nextLetter = (char) (letter1 + 1);
        System.out.println("Next letter after " + letter1 + " is: " + nextLetter);
    }
}

