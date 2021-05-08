package day10;

import java.util.Scanner;

public class Task7 {
    //Enter the number N and draw an NxN checkerboard where the top left is white. Designate white margins O, black margins X. Use a for loop.
    //Input ` 3
    //Output`
    //OXO
    //XOX
    //OXO
    //Input` 8
    //OXOXOXOX
    //XOXOXOXO
    //OXOXOXOX
    //XOXOXOXO
    //OXOXOXOX
    //XOXOXOXO
    //OXOXOXOX
    //XOXOXOXO
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("n=");
        int n = input.nextInt();
        char[][] matrix = new char[n][n];

        for( int i = 0; i < n; ++i){
                for (int j = 0; j < n; ++j) {
                    if ((i + j) % 2 == 0){
                        matrix[i][j] = 'O';
                    }else {
                        matrix[i][j] = 'X';
                    }
                }
        }
        for( int i = 0; i < n; ++i) {
            for (int j = 0; j < n; ++j) {
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
    }
}