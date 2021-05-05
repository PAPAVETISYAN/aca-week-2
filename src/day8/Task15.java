package day8;

import java.util.Scanner;

public class Task15 {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.print("n=");
        int n = input.nextInt();
        int [ ] array = new int[n];
        for(int i = 0; i < n; ++i)
        {
            array[i] = input.nextInt();
        }
        for(int i = 0; i < n; ++i){
            boolean k = true;
            for(int j = 0; j < n; ++j){
                if(i == j){
                    continue;
                }
                if(array[i] == array[j]){
                    k = false;
                }
            }
            if(k){
                System.out.println(array[i]);
            }
        }
    }
}
