package com.company;
import java.lang.annotation.Target;
import java.util.Scanner;

public class Calculator {
    int num1;
    int num2;

    public int Add(int a, int b) {
        return a + b;
    }

    public int Substract(int a, int b) {
       int sum = a - b;
        return sum;
    }

    public double Div(double a, double b) {
        return a / b;
    }

    public int Multi(int a, int b) {
        return a * b;
    }

    public int Table(int a) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(a + " x " + i + " = " + i * a);
        }
        return 0;
    }

    public int Fact(int a) {
        int fact = 1;
        for (int i = a; i > 0; i--) {
            fact = fact * i;
        }
        return fact;
    }

    public int Square(int a) {
        return a * a;
    }

    public int Cube(int a) {
        return a * a * a;
    }

    public void Menu() {
        Scanner input = new Scanner(System.in);
        System.out.println(" Enter 1 : addition \t\t\t Enter 2 : Substraction \n Enter 3 : multiplication \t\t Enter 4 : Division \n Enter 5 : Square \t\t\t\t Enter 6 : Cube \n Enter 7 : Factorial \t\t\t Enter 8 : Table");
        int num = input.nextInt();
        switch (num) {
            case 1:
                System.out.print("Enter the number 1 : ");
                num1 = input.nextInt();
                System.out.print("Enter the number 2 : ");
                num2 = input.nextInt();
                System.out.println("The Sum of the numbers : " + Add(num1, num2));
                break;
            case 2:
                System.out.print("Enter the number 1 : ");
                num1 = input.nextInt();
                System.out.print("Enter the number 2 : ");
                num2 = input.nextInt();
                System.out.println("The Substraction of the numbers : " + Substract(num1, num2));
                break;
            case 3:
                System.out.print("Enter the number 1 : ");
                num1 = input.nextInt();
                System.out.print("Enter the number 2 : ");
                num2 = input.nextInt();
                System.out.println("The Multiplication of the numbers : " + Multi(num1, num2));
                break;
            case 4:
                System.out.print("Enter the number 1 : ");
                num1 = input.nextInt();
                System.out.print("Enter the number 2 : ");
                num2 = input.nextInt();
                System.out.println("The Division of the numbers : " + Div(num1, num2));
                break;
            case 5:
                System.out.print("Enter the number 1 : ");
                num1 = input.nextInt();
                System.out.print("Enter the number 2 : ");
                num2 = input.nextInt();
                System.out.println("The Square of the number : " + Square(num1));
                break;
            case 6:
                System.out.print("Enter the number 1 : ");
                num1 = input.nextInt();
                System.out.print("Enter the number 2 : ");
                num2 = input.nextInt();
                System.out.println("The Cube of the number : " + Cube(num1));
                break;
            case 7:
                System.out.print("Enter the number : ");
                num1 = input.nextInt();
                System.out.println("The Factorial of a number : " + Fact(num1));
                break;
            case 8:
                System.out.print("Enter the number : ");
                num1 = input.nextInt();
                System.out.println("The Table of a number : " + Table(num1));
                break;
            default:
                System.out.println("Please re-write the choice 1-8. ");
        }
    }

    public static void main(String[] args){
        Calculator operation = new Calculator();
        operation.Menu();
    }
}
