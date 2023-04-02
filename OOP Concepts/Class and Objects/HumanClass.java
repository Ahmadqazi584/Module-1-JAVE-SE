package com.company;
class Human{
    String name;
    byte age;
    String gender;
}
public class HumanClass {
    public static void main(String[] args){
        Human boy = new Human();
        boy.name = "Ahmed";
        boy.age = 19;
        boy.gender = "Male";
        System.out.println("The boy " + boy.name + " with age " + boy.age + " & gender " + boy.gender );

        Human girl = new Human();
        girl.name = "Sara";
        girl.age = 25;
        girl.gender = "Female";
        System.out.println("The girl " + girl.name + " with age " + girl.age + " & gender " + girl.gender );

        Human men = new Human();
        men.name = "Abid";
        men.age = 54;
        men.gender = "Male";
        System.out.println("The men " + men.name + " with age " + men.age + " & gender " + men.gender );
    }
}
