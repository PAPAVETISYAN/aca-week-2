package day8;

import java.util.Scanner;

public class Task1 {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int [ ] array = new int[n];
        for(int i = 0; i < n; ++i)
        {
            array[i] = i + 1;
        }
        for(int i = 0; i < n ; i += 2){
            System.out.println(array[i]);
        }
    }
}
