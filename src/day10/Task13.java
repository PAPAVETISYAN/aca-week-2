package day10;

import java.util.Scanner;

public class Task13 {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.print("n=");
        int n = input.nextInt();
        int [][]matrix = new int[n][n];
        int k = 0;
        for (int i = 0; i < n; ++i){
            for(int j = 0; j < n; ++j){
                matrix[i][j] = k;
                ++k;
            }
        }
        for (int i = 0; i < n; ++i){
            for(int j = 0; j < n; ++j){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("enter 1 or 2");
        int s = input.nextInt();
        switch (s) {
            case 1:
            for (int i = 0; i < n; ++i) {
                for (int j = n - 1; j >= 0; --j) {
                    System.out.print(matrix[j][i] + " ");
                }
                System.out.println();
            }
            break;
            case 2:
                for (int i = n - 1; i >= 0; --i) {
                    for (int j = n - 1; j >= 0; --j) {
                        System.out.print(matrix[i][j] + " ");
                    }
                    System.out.println();
                }
                break;
            default:
                System.out.println("illegal choice");
        }
    }
}
