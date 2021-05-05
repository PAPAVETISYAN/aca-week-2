package day8;

import java.util.Scanner;

public class Task16 {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.print("n=");
        int n = input.nextInt();
        int [ ] array = new int[n];
        for(int i = 0; i < n; ++i)
        {
            array[i] = input.nextInt();
        }
        int x = 0;
        for(int i = 0; i + x < n - 1; ){
            if (array[i] == 0 && i < n - 1){
                ++x;
                array[i] = array[i + x];
                array[i + x] = 0;
                continue;
            }
            x=0;
            ++i;
        }
        for (int i = 0; i < n; ++i){
            System.out.println(array[i]);
        }
    }
}
