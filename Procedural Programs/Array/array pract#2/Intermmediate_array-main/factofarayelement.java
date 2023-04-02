package com.company;

public class factofarayelement {
    public static void main(String[] args){

        int arr [] = {3, 4, 6, 7, 9, 1};
        for (int i = 0; i < arr.length; i++) {
            int fact = 1;
            for (int j = arr[i]; j > 0 ; j--) {
                fact = fact * j;
            }
            System.out.println("Factortial of " + arr[i] + " : " + fact);
        }
    }
}
