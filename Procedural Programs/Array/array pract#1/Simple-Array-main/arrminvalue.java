package com.company;

public class arrminvalue {
    public static void main(String[] args){
        int [] arr = {2, 6, 7, 1, 8};
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < max){
                max = arr[i];
            }
        }
        System.out.println("The max is = " + max);
    }
}