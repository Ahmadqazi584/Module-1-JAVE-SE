//kelvin to celius 0°k - 273.15 = C, 0°C + 273.15 = k & (0°C × 9/5) + 32 = F
package com.company;
public class Q32 {
    public static void main(String[] args){
        double kelvin = 300;
        double celcius = kelvin - 273.15;
        System.out.println("The celcius of " + kelvin + " is " + celcius);
    }
}
