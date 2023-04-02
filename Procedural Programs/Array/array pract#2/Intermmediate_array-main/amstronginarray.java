package com.company;

public class amstronginarray {
    public static void main(String[] args){
        int rem = 0, prem = 0;

        int arr [] = {90, 153, 799, 370, 1100};
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = arr[i]; j > 0; j = j/10) {
                rem = j%10;
                prem = (rem*rem*rem);
                sum = sum + prem;
            }
            if (sum == arr[i]){
                System.out.println("The number is amstrong");

            }else {
                System.out.println("The number is not amstrong");
            }
        }
    }
}
