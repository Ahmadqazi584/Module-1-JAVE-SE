package com.company;
class Pen{
    String Brand;
    String Color;
    short price;
}
public class PenClass {
    public static void main(String[] args){
        Pen inkpen = new Pen();
        inkpen.Brand = "Deer";
        inkpen.Color = "Black";
        inkpen.price = 45;
        System.out.println("The pen of " + inkpen.Brand+" of " + inkpen.Color + " in " +inkpen.price+" rupees");

        Pen ballpen = new Pen();
        ballpen.Brand = "Dollar";
        ballpen.Color = "Green";
        ballpen.price = 10;
        System.out.println("The pen of " + ballpen.Brand+" of " + ballpen.Color + " in " +ballpen.price+" rupees");

        Pen gellpen = new Pen();
        gellpen.Brand = "Foundation";
        gellpen.Color = "Blue";
        gellpen.price = 50;
        System.out.println("The pen of " + ballpen.Brand+" of " + ballpen.Color + " in " +ballpen.price+" rupees");
    }
}
