package com.company;

public class countamstrong {
    public static void main(String[] args){
        int rem = 0, prem = 0;
        int count = 0;
        int arr [] = {90, 153, 799, 370, 1100};
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = arr[i]; j > 0; j = j/10) {
                rem = j%10;
                prem = (rem*rem*rem);
                sum = sum + prem;
            }
            if (sum == arr[i]){
                count++;
            }
        }
        System.out.println("the total amstrong are : " +  count);
    }
}
