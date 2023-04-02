package com.company;
class Board{
    int width;
    int height;
    String color;
}
public class BoardClass {
    public static void main(String[] args){
        Board school = new Board();
        school.width = 5;
        school.height = 15;
        school.color = "Black";
        System.out.println("The class board of school in " + school.color + " having aera of " + school.width * school.height);

        Board college = new Board();
        college.width = 3;
        college.height = 6;
        college.color = "White";
        System.out.println("The class board of college in " + college.color + " having aera of " + college.width * college.height);

        Board university = new Board();
        university.width = 6;
        university.height = 10;
        university.color = "White";
        System.out.println("The class board of university in " + university.color + " having aera of " + university.width * university.height);

    }
}
