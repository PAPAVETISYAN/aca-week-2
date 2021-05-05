package day8;

import java.util.Scanner;

public class Task2 {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int [ ] array = new int[n];
        for(int i = 0; i < n; ++i)
        {
            array[i] = i + 1;
        }
        for(int i = 0; i < n ; i++){
            if(array[i] % 2 ==0){
                System.out.println(array[i]);
            }
        }
    }
}
