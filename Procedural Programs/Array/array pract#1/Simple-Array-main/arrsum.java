package com.company;
import java.util.Scanner;
public class arrsum {
    public static void main(String[] args){
        int num [] = new int[5];
        int sum = 0;
        for (int i = 0; i < num.length; i++) {
            Scanner input = new Scanner(System.in);
            num[i] = input.nextByte();
        }
        for (int i = 0; i < num.length; i++) {
            sum = sum + num[i];
        }
        System.out.println("The sum is = " + sum);
    }
}
