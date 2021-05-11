package day9;


import java.util.Scanner;

public class Task6 {
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
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < m; ++j) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        int[] arraySum = new int[n];
        int maxMatrix = 0;
        for (int i = 0; i < n; ++i) {
            int sum = 0;
            for (int j = 0; j < m; ++j) {
                sum += matrix[i][j];
                if (matrix[i][j] > maxMatrix) {
                    maxMatrix = matrix[i][j];
                }
            }
            arraySum[i] = sum;
        }
        int[] indexarray = new int[n];
        int count = 0;
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < m; ++j) {
                if (matrix[i][j] == maxMatrix) {
                    indexarray[count] = i;
                    ++count;
                }
            }
        }
        int z = -1;
        if (count > 1) {
            int sumMax = arraySum[indexarray[0]];
            for (int i = 1; i < count; ++i){
                if (arraySum[indexarray[i]] > sumMax){
                    z = indexarray[i];
                }
            }
            if(z == -1) {
                for (int i = 0; i < count; ++i) {
                    if (arraySum[indexarray[i]] == sumMax) {
                        z = indexarray[i];
                        break;
                    }
                }
            }
            System.out.println(z + " because of " + maxMatrix + ", the best result");
        } else {
            System.out.println(indexarray[count - 1] + " because of " + maxMatrix + ", the best result");
        }
    }
}
