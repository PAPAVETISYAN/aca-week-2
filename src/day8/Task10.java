package day8;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int [ ] array = new int[n];
        for(int i = 0; i < n; ++i)
        {
            array[i] = input.nextInt();
        }
        for(int i = n - 1; i >= 0; i--)
        {
            System.out.println(array[i]);
        }
    }
}
