package com.company;
class Shoes{
    int price;
    String color;
    String brand;
}
public class ShoesClass {
    public static void main(String[] args){
        Shoes party = new Shoes();
        party.price = 4500;
        party.brand = "Epcot";
        party.color = "Dark Brown";
        System.out.println("So you purchased " + party.color + " shoes of " + party.brand + " in " + party.price);

        Shoes school = new Shoes();
        school.price = 1000;
        school.brand = "Service";
        school.color = "Black";
        System.out.println("So you purchased " + school.color + " shoes of " + school.brand + " in " + school.price);

        Shoes wedding = new Shoes();
        wedding.price = 45000;
        wedding.brand = "Endre";
        wedding.color = "Navy Blue";
        System.out.println("So you purchased " + wedding.color + " shoes of " + wedding.brand + " in " + wedding.price);

    }
}
