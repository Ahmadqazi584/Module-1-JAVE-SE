package com.company;
import java.util.Scanner;
class Tree{
    public int Square(int n) {
        return n * n;
    }
    public boolean evenOdd(int n) {
        boolean flag = false;
        if (n % 2 == 0) {
            flag = true;
        }
        return flag;
    }
    public boolean strongNumber(int n) {
        int sum = 0;
        for (int i = n; i > 0; i = i / 10) {
            int num = i % 10;
            int fact = 1;
            for (int j = num; j > 0; j--) {
                fact = fact * j;
            }
            sum = sum + fact;
        }
        if (sum == n){
            return true;
        }else {
            return false;
        }
    }
    public void Fibonanci(int n){
        int a = 0;
        int b = 1;
        int sum = 0;
        for(int i = 1; i <= n; i++){
            if (i == 1){
                System.out.print(a + " ");
            }
            if (i == 2){
                System.out.print(b + " ");
            }
            if (i > 2){
                sum = a + b;
                System.out.print(sum + " ");
                a = b;
                b = sum;
            }
        }
    }
    public void Tribonic(int n){
        int a = 0;
        int b = 0;
        int c = 1;
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (i == 1){
                System.out.print(a + " ");
            }
            if (i == 2){
                System.out.print(b + " ");
            }
            if (i == 3){
                System.out.print(c + " ");
            }
            if (i > 3){
                sum = a + b + c;
                System.out.print(sum + " ");
                a = b;
                b = c;
                c = sum;
            }
        }
    }
    public boolean Palindrome(int n){
        int sum = 0;
        int rem = 0;
        for (int i = n; i > 0; i = i / 10) {
            rem = i % 10;
            sum = (sum * 10) + rem;
        }
        if (n == sum){
            return true;
        }else {
            return false;
        }
    }
    public void Table(int n){
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " x " + i + " = " + n*i);
        }
    }
    public void Factorial(int n){
        int fact = 1; int sum = 0;
        for (int i = n; i > 0 ; i--) {
            fact = fact * i;
            sum = sum + fact;
        }
        System.out.println(fact);
    }
}
public class treeprogram {
    public static void main(String[] args){
        Tree tree = new Tree();
        Scanner input = new Scanner(System.in);
        System.out.print("Enter any number : ");
        int num = input.nextInt();
        int square = tree.Square(num);
        System.out.println("Square of " + num + " = " + square);
        boolean evenodd = tree.evenOdd(square);
        if (evenodd == true){
            boolean strong = tree.strongNumber(square);
            if (strong == true){
                System.out.println("Yes! the number is strong");
                tree.Fibonanci(square);
            }else {
                System.out.println("No! the number is not strong");
                tree.Tribonic(square);
            }
        }else {
            boolean palindrome = tree.Palindrome(square);
            if (palindrome == true){
                System.out.println("Yes! the number is palindrome");
                tree.Table(square);
            }else {
                System.out.println("No! the number is not palindrome");
                tree.Factorial(square);
            }
        }

    }
}
