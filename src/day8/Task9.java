package day8;

import java.util.Scanner;

public class Task9 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int [ ] array = new int[n];
        for(int i = 0; i < n; ++i)
        {
            array[i] = input.nextInt();
        }
        for(int i = 0; i < n / 2 ; i++)
        {
            int temp = array[i];
            array[i] = array[n - 1 - i];
            array[n - 1 - i] = temp;
        }
        for(int i = 0; i < n; i++)
        {
            System.out.println(array[i]);
        }
    }
}
