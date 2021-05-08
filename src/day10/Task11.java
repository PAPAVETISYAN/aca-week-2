package day10;

import java.util.Scanner;

public class Task11 {
    //Given numbers n and m. Create an array A [n] [m] and fill it as shown in the example.
    //Input` 4   10
    //Output`
    //  0  1  3  6 10 14 18 22 26 30
    //  2  4  7 11 15 19 23 27 31 34
    //  5  8 12 16 20 24 28 32 35 37
    //  9 13 17 21 25 29 33 36 38 39
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.print("n=");
        int n = input.nextInt();
        System.out.print("m=");
        int m = input.nextInt();
        int[][] matrix = new int[n][m];
        int k = 0;
        int s = 0;
        while (k < n * m) {
            for (int i = 0; i < n; ++i) {
                for (int j = 0; j < m; ++j) {
                    if(i + j == s) {
                        matrix[i][j] = k;
                        ++k;
                    }
                }
            }
            ++s;
        }
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < m; ++j) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
