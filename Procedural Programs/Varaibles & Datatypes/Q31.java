//farenheit to celius 0°k - 273.15 = C, 0°C + 273.15 = k & (0°C × 9/5) + 32 = F
package com.company;
public class Q31 {
    public static void main(String[] args){
        double f = 37.4;
        double c = (5*f - 5*32)/9d ;
        System.out.println("The celcius of " + f + " is = " + c );
    }
}
