package com.company;

public class pascalwhile {
    public static void main(String[] args){
        int c = 1;
        int i = 0;
        while(i < 6){
            int j = 1;
            while(j <= 6-i){
                System.out.print(" ");
                j++;
            }
            int k = 0;
            while (k <= i){
                if (k == 0){
                    c = 1;
                }else {
                    c = c * (i-k+1) / k;
                }
                System.out.print(c + " ");
                    k++;
            }
            System.out.println();
            i++;
        }
    }
}
