package day9;

import java.util.Scanner;

public class Task4 {
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
        int []array = new int[n];
        for(int i = 0; i < n; ++i){
            int sum = 0;
            for(int j = 0; j < m; ++j){
                sum += matrix[i][j];
            }
            array[i] = sum;
        }
        int max = array[0];
        int indexMax = 0;
        for(int i = 1; i < n; ++i)
        {
            if (array[i] > max){
                max = array[i];
                indexMax = i;
            }
        }
        for (int i = 0; i < n; ++i){
            for(int j = 0; j < m; ++j){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("max is " + max);
        System.out.println("line is " + indexMax);
    }
}
