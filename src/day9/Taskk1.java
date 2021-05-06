package day9;

import java.util.Random;
import java.util.Scanner;

public class Taskk1 {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        System.out.print("n=");
        int n = input.nextInt();
        System.out.print("m=");
        int m = input.nextInt();
        int [ ] [ ] matrix = new int[n][m ];
        for(int i = 0; i < n; ++i)
        {
            for(int j = 0; j < m; ++j)
            {
                matrix[i][j] = random.nextInt(19) + 86;
            }
        }
        for(int i = 0; i < n; ++i)
        {
            for(int j = 0; j < m; ++j)
            {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
