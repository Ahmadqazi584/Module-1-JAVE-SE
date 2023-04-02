package com.company;

public class dotriwithnum {
    public static void main(String[] args){
        int i = 1;
        do{
            int j = 6-i;
            do{
                System.out.print(" ");
                j--;
            }while (j > 0);
            int k = i;
            do{
                System.out.print(k);
                k--;
            }while (k >= 1);
            System.out.println();
            i++;
        }while (i <= 5);
    }
}
