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
        int count = 0;
        while (z >= 2) {
            int i = l, j;
            for (j = s; j < n - l; ++j) {
                matrix[i][j] = 1;
            }
            ++count;
            if(count == n){
                break;
            }
            ++l;
            ++s;
            for (i = l; i < n - l; ++i) {
                matrix[i][n - l] = 1;
            }++count;
            if(count == n){
                break;
            }
            for (j = n - l; j > l - s; --j) {
                matrix[n - l][j] = 1;
            }++count;
            if(count == n){
                break;
            }
            for (i = n - l - k; i > l ; --i) {
                matrix[i][j + k] = 1;
            }++count;
            if(count == n){
                break;
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
