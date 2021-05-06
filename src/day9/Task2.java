package day9;

import java.util.Scanner;

public class Task2 {
        public static void main(String[]args){
            Scanner input = new Scanner(System.in);
            System.out.print("n=");
            int n = input.nextInt();
            System.out.print("m=");
            int m = input.nextInt();
            int [ ] [ ] matrix = new int[n][m ];
            for(int i = 0; i < n; ++i)
            {
                for(int j = 0; j < m; ++j)
                {
                    if(i + j >= ((m + n) / 2) - 1 ) {
                        matrix[i][j] = 1;
                    }else{
                        matrix[i][j] = 0;
                    }
                }
            }
            for(int i = 0; i < n; ++i) {
                for (int j = 0; j < m; ++j) {
                    System.out.print(matrix[i][j] + " ");
                }
                System.out.println();
            }
        }
    }