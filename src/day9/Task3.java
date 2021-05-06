package day9;

import java.util.Scanner;

public class Task3 {
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
               matrix[i][j] = input.nextInt();
            }
        }
        int count = 0;
        for(int i = 0; i < n; ++i) {
            for (int j = 0; j < m; ++j) {
                if(i < j && matrix[i][j] == matrix[j][i]){
                    ++count;
                }
            }
        }
        for(int i = 0; i < n; ++i) {
            for (int j = 0; j < m; ++j) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        if( count == (m * n / 2) - (m + n) / 4){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}
