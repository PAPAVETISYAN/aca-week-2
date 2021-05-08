package day10;

import java.util.Scanner;

public class Task12 {
    //Given numbers n and m. Create an array A [n] [m] and fill it with a snake (see example).
    //Example` Input 4  10
    //                Output `
    // 0  1  2  3  4  5  6  7  8  9
    // 19 18 17 16 15 14 13 12 11 10
    // 20 21 22 23 24 25 26 27 28 29
    // 39 38 37 36 35 34 33 32 31 30
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.print("n=");
        int n = input.nextInt();
        System.out.print("m=");
        int m = input.nextInt();
        int[][] matrix = new int[n][m];
        int k = 0;
            for (int i = 0; i < n; ++i) {
                for (int j = 0; j < m; ++j) {
                    matrix[i][j] = k;
                    ++k;
                }
                ++i;
                for (int j = m - 1; j >= 0; --j){
                    matrix[i][j] = k;
                    ++k;
                }
            }
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < m; ++j) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
