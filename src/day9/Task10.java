package day9;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("n=");
        int n = input.nextInt();
        int[][] matrix = new int[n][n];
        int k = 1, l = 0, s = 0;
        while (k <= n * n) {
            int i = l, j = s;
            for (j = l; j < n - l; ++j) {
                matrix[i][j] = k;
                ++k;
            }
            ++l;
            for (i = l; i < n - l; ++i) {
                matrix[i][n - l] = k;
                ++k;
            }
            for (j = n - l; j > l - 1; --j) {
                matrix[n - l][j] = k;
                ++k;
            }
            for (i = n - l; i >= l; --i) {
                matrix[i][j] = k;
                ++k;
            }
        }
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < n; ++j) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
