//celcius to farenheit 0°k - 273.15 = C, 0°C + 273.15 = k & (0°C × 9/5) + 32 = F
package com.company;
public class Q30 {
    public static void main(String[] args){
        int celcius = 3;
        float f = (celcius * (9/5f)) + 32;
        System.out.println("The farenheit of " + celcius + " is = " + f);
    }
}
