package com.company;

public class whiletriwithnum {
    public static void main(String[] args){
        int i = 1;
        while (i <= 5){
            int j = 5-i;
            while (j > 0){
                System.out.print(" ");
                j--;
            }
            int k = i;
            while (k >= 1){
                System.out.print(k);
                k--;
            }
            System.out.println();
            i++;
        }
    }
}
