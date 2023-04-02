package com.company;

public class evenoddcount {
    public static void main(String[] args) {
        int evencount = 0, oddcount = 0;
        int[] arr = {3, 4, 6, 7, 9, 1};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]%2 == 0){
                evencount++;
            }else {
                oddcount++;
            }
        }
        System.out.println("Total even in array : " + evencount);
        System.out.println("Total odd in array : " + oddcount);
    }
}
