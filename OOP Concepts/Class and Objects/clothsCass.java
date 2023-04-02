package com.company;
class Cloths{
    String category;
    String color;
    String brand;
}
public class clothsCass {
    public static void main(String[] args){
        Cloths pent = new Cloths();
        pent.category = "men's pent";
        pent.brand = "denizen";
        pent.color = "black";
        System.out.println("So you purchased " + pent.category + " of " + pent.brand + " in " + pent.color  );

        Cloths shirt = new Cloths();
        shirt.category = "Women's Shirt";
        shirt.brand = "Al-Karam";
        shirt.color = "multicolor";
        System.out.println("So you purchased " + shirt.category + " of " + shirt.brand + " in " + shirt.color  );

        Cloths tie = new Cloths();
        tie.category = "Men's Tie";
        tie.category = "Gul Ahmed";
        tie.color = "Blue";
        System.out.println("So you purchased " + tie.category + " of " + tie.brand + " in " + tie.color  );
    }
}
