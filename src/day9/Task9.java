package day9;

import java.util.Scanner;

public class Task9 {
    //spiral
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("n=");
        int n = input.nextInt();
        int[][] matrix = new int[n][n];
        int l = 0, z = n , s = 0,k = 0;
        while (z >= 2) {
            int i = l, j;
            for (j = s; j < n - l; ++j) {
                matrix[i][j] = 1;
            }
            ++l;
            ++s;
            for (i = l; i < n - l; ++i) {
                matrix[i][n - l] = 1;
            }
            for (j = n - l; j > l - s; --j) {
                matrix[n - l][j] = 1;
            }
            for (i = n - l - k; i > l ; --i) {
                matrix[i][j + k] = 1;
            }
            ++k;
            ++l;
            z -= 4;
        }
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < n; ++j) {
                System.out.print(matrix[i][j] + "  ");
            }
            System.out.println();
        }
    }
}
