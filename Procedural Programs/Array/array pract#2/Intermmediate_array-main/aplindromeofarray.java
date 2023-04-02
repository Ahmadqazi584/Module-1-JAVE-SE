package com.company;

public class aplindromeofarray {
    public static void main(String[] args){
        int prem = 0, rem = 0;
        int arr [] =  {90, 153, 121, 370, 145};
        for (int i = 0; i < arr.length; i++){
            int sum = 0;
            for (int j = arr[i]; j > 0 ; j= j/10) {
                rem = j%10;
                int fact = 1;
                for (int k = rem; k > 0 ; k--) {
                     fact = fact * k;
                }
                sum = sum + fact;
            }
            if (arr[i] == sum){
                System.out.println("The number is strong");
            }else {
                System.out.println("The number is not strong");
            }
        }
    }
}
