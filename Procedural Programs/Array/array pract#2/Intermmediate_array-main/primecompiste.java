package com.company;

public class primecompiste {
    public static void main(String[] args){
//        int arr [] = {3, 4, 6, 7, 9, 1};
        int num =10;
        boolean flag = false;
        for (int i =1; i < nu; i++) {
            if (num%i == 0){
                flag = true;
                break;
            }
        }
        if (flag){
            System.out.println("The number is prime");
        }else {
            System.out.println("The number is composite");
        }
    }
}
