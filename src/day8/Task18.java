package day8;

import java.util.Scanner;

public class Task18 {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.print("n=");
        int n = input.nextInt();
        int [ ] array = new int[n];
        for(int i = 0; i < n; ++i)
        {
            array[i] = input.nextInt();
        }
       /* anun:
        for (int i = 0; i < n - 1; ++i){
            int k = 1;
            for(int j = i + 1; j < n; ++j){
                if(array[i] == array[j]){
                    ++k;
                }
            }
            if(k == n / 2){
                System.out.println(array[i] + " is timed " + k + " time ");
            }else if(k > n / 2){
                System.out.println(array[i] + " is timed " + k + " time ");
                break anun;
            }
        }
        */
        // or
        System.out.println(array[n / 2]);
    }
}
