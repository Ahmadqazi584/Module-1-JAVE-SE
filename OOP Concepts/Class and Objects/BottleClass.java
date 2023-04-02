package com.company;
class Bottle{
    String drinktype;
    String temperature;
    String brand;
}
public class BottleClass {
    public static void main(String[] args){
        Bottle regular = new Bottle();
        regular.drinktype = "Soft Drink";
        regular.brand = "Pepsi";
        regular.temperature = "Normal";
        System.out.println("So you took " + regular.drinktype + " of " + regular.brand +" at " + regular.temperature + " temperature");

        Bottle middle = new Bottle();
        middle.drinktype = "Soft Drink";
        middle.brand = "Cocola";
        middle.temperature = "Coldest";
        System.out.println("So you took " + middle.drinktype + " of " + middle.brand +" at " + middle.temperature+ " temperature");

        Bottle jumbo = new Bottle();
        jumbo.drinktype = "Fresh Water";
        jumbo.brand = "Aquafine";
        jumbo.temperature = "Coldest";
        System.out.println("So you took " + jumbo.drinktype + " of " + jumbo.brand +" at " + jumbo.temperature+ " temperature");

    }
}
