package com.company;

public class arrmaxvalue {
    public static void main(String[] args){
        int value = 0;
        int [] arr = {2, 6, 7, 1, 8};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > value){
                value = arr[i];
            }
        }
        System.out.println("The min is = " + value);
    }
}
