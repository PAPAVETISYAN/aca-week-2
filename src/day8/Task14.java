package day8;

import java.util.Scanner;

public class Task14 {
    public static void main(String[]args){
            Scanner input = new Scanner(System.in);
            System.out.print("n=");
            int n = input.nextInt();
            System.out.print("index=");
            int index = input.nextInt();
            int [ ] array = new int[n];
            for(int i = 0; i < n; ++i)
            {
                array[i] = input.nextInt();
            }
            int temp = array[index];
            array[index] = array[n - 1];
            array[n - 1] = temp;
        for(int i = 0; i < n - 1; ++i){
            System.out.println(array[i]);
        }
    }
}
