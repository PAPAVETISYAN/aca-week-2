package day8;

import java.util.Scanner;

public class Task12 {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.print("n=");
        int n = input.nextInt();
        int [ ] array = new int[n];
        for(int i = 0; i < n; ++i)
        {
            array[i] = input.nextInt();
        }
        int temp = array[n - 1];
        for(int i = n - 1; i > 0; i--){
            array[i] = array[i - 1];
        }
        array[0] = temp;
        for (int i = 0; i < n; i++){
            System.out.println(array[i]);
        }
    }
}
