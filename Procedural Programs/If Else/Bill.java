package com.company;
// billing with taxation
public class Bill {
    public static void main(String [] args) {
        int bill, unit = 250;
        int percentage;
        percentage = (10 * unit) / 100;
        if (unit > 0 && unit <= 100) {
            bill = 8 * unit;
        } else if (unit > 100 && unit <= 200) {
            bill = 16 * unit;
        } else {
            bill = (25 * unit) + percentage;
        }
        System.out.println("your bill amount is : " + bill);
    }
}
