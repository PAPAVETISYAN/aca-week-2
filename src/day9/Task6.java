package day9;


import java.util.Scanner;

public class Task6 {
    //kisat
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
        int max = 0;
        int indexMax = 0;
        for (int i = 0; i < n; ++i) {
            array[i] = 0;
            for (int j = 0; j < m; ++j) {
                array[i] += matrix[i][j];
                if(matrix[i][j] > max){
                    max = matrix[i][j];
                    indexMax = i;
                }
            }
        } int count = 0;
        for (int i = indexMax; i < n; ++i){
            for(int j = 0; j < m; ++j){
                if(matrix[i][j] == max){
                    ///kisat
                }
            }
        }
    }
}
