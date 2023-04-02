package com.company;

public class whilediamondpattern {
    public static void main(String[] args){
        int i = 1;
        while (i <= 5){
            int j = 5;
            while ( j >= i){
                System.out.print(" ");
                j--;
            }
            int k = 1;
            while (k <= i){
                System.out.print("* ");
                k++;
            }
            System.out.println();
            i++;
        }
        int x = 4;
        while (x >= 1){
            int j = 5;
            while ( j >= x){
                System.out.print(" ");
                j--;
            }
            int k = 1;
            while (k <= x){
                System.out.print("* ");
                k++;
            }
            System.out.println();
            x--;
        }
    }
}
