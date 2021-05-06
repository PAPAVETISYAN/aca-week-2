package day9;

import java.util.Scanner;

public class Task8 {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.print("n=");
        int n = input.nextInt();
        int[][] matrix1 = new int[n][n];
        int[][] matrix2 = new int[n][n];
        int[][] matrixSum = new int[n][n];
        for(int i = 0; i < n; ++i){
            for(int j = 0; j < n; ++j){
                matrix1[i][j] = input.nextInt();
            }
        }
        for(int i = 0; i < n; ++i){
            for(int j = 0; j < n; ++j){
                matrix2[i][j] = input.nextInt();
            }
        }
        for(int i = 0; i < n; ++i){
            for(int j = 0; j < n; ++j){
                matrixSum[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        for(int i = 0; i < n; ++i){
            for(int j = 0; j < n; ++j){
                System.out.print(matrixSum[i][j] + " ");
            }
            System.out.println();
        }
    }
}
