package com.company;

public class pascaldo {
    public static void main(String[] args){
        int c = 1;
        int i = 0;
        do{
            int j = 1;
            do{
                System.out.print(" ");
                j++;
            }while(j <= 6-i);
            int k = 0;
            do{
                if (k == 0){
                    c = 1;
                }else {
                    c = c * (i-k+1) / k;
                }
                System.out.print(c + " ");
                k++;
            }while (k <= i);
            System.out.println();
            i++;
        }while(i < 6);
    }
}
