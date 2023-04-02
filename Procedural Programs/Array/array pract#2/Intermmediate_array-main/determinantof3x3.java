package com.company;
import java.util.Scanner;
public class determinantof3x3 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int matrixA [][] = new int [3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrixA[i][j] = input.nextByte();
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
//                if ( i == 0 || j == 0) {
            //        matrixA[i][j]*(matrixA[i+1][j+1]*matrixA[i+2][j+2] - matrixA[i+1][j+2]*matrixA[i+2][j+1]);
//                }
            }
        }
    }
}
