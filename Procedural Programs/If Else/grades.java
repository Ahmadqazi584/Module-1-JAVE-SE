package com.company;
//Student result marksheet
public class Main {
    public static void main(String[] args) {
        int marks = 60;
        if (marks >= 80) {
            System.out.println("you secured A-1 grade");
        } else if (marks < 80 && marks >= 70) {
            System.out.println("you secured A grade");
        } else if (marks < 70 && marks >= 60) {
            System.out.println("You secured B grade");
        } else if (marks < 60 && marks >= 50) {
            System.out.println("you secured C grade");
        } else if (marks < 50 && marks >= 40) {
            System.out.println("you secured D grade");
        } else if (marks < 40 ){
            System.out.println("sorry, you failed!");
        }
    }
}
