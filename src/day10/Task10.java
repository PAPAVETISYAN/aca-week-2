package day10;

import java.util.Scanner;

public class Task10 {
    //Two numbers n and m are given. Create a two-dimensional array A [n] [m], fill it with the multiplication table A [i] [j] = i * j and display it. In this case, you cannot use nested loops, the entire filling of the array must be done in one cycle.
    //Example` Input` 3   3
    //                      Output` 0 0 0
    //                                   0 1 2
    //                                   0 2 4
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.print("n=");
        int n = input.nextInt();
        System.out.print("m=");
        int m = input.nextInt();
        int[][] matrix = new int[n][m];
        int i =0;
        int j = 0;
           while (i * j <= (n - 1) * (m - 1)){
               if(j < m){
                   matrix[i][j] = i * j;
                   ++j;
               }else {
                   j = 0;
                   ++i;
               }
           }
        for (i = 0; i < n; ++i){
            for (j = 0; j < m; ++j){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
