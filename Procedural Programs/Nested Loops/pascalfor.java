package com.company;
import java.util.Scanner;
public class pascalfor {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int c = 1;
        for (int i = 0; i < num; i++) {
            for (int j = 1; j < num-i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                if (j == 0){
                    c = 1;
                }else {
                    c = c * (i-j+1) / j;
                }
                System.out.print(c + " ");
            }
            System.out.println();
        }
    }
}
