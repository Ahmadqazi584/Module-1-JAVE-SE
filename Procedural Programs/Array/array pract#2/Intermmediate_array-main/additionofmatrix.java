package com.company;
import java.util.Scanner;
public class additionofmatrix {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int r = 2, c = 2;
        int matrixA[][] = new int[r][c];
        int matrixB[][] = new int[r][c];
        int sum[][] = new int[r][c];
        System.out.println("=== matrix A ===");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                matrixA[i][j] = input.nextByte();
            }
        }
        System.out.println("=== matrix B ===");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                matrixB[i][j] = input.nextByte();
            }
        }
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                sum[i][j] = matrixA[i][j] + matrixB[i][j];
                System.out.print(sum[i][j] + " ");
            }
            System.out.println();
        }
    }
}
