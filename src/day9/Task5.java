package day9;

import java.util.Scanner;

public class Task5 {
    public static void main(String[]args) {
        Scanner input = new Scanner(System.in);
        System.out.print("n=");
        int n = input.nextInt();
        System.out.print("m=");
        int m = input.nextInt();
        int[][] matrix = new int[n][m];
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < m; ++j) {
                matrix[i][j] = input.nextInt();
            }
        }
        int maxN = 0;
        int maxM = 0;
        int max = matrix[0][0];
        for(int i = 0; i < n; ++i){
            for(int j = 1; j < m; ++j){
                if(matrix[i][j] > max){
                    max = matrix[i][j];
                    maxN = i;
                    maxM = j;
                }
            }
        }
        for (int i = 0; i < n; ++i){
            for(int j = 0; j < m; ++j){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println(max);
        System.out.print(maxN + " ");
        System.out.print(maxM);
    }
}
