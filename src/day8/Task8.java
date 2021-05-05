package day8;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int [ ] array = new int[n];
        for(int i = 0; i < n; ++i)
        {
            array[i] = input.nextInt();
        }
        int number = 1;
        for(int i = 1; i < n ; i++){
            if(array[i - 1] != array[i])
                ++number;
        }
        System.out.println();
        System.out.println(number);
    }
}
