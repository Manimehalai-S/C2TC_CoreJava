package com.ifet.daythree.constructor;

class constructor {
    String name;
    double balance;

    // Constructor initializes data
    constructor(String n, double b) {
        name = n;
        balance = b;
    }

    void display() {
        System.out.println("Account Holder: " + name);
        System.out.println("Balance: " + balance);
    }

    public static void main(String[] args) {
        constructor acc1 = new constructor("Megha", 5000);
        acc1.display();
    }
}
