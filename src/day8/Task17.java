package day8;

import java.util.Scanner;

public class Task17 {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.print("n=");
        int n = input.nextInt();
        int [ ] array = new int[n];
        for(int i = 0; i < n; ++i)
        {
            array[i] = input.nextInt();
        }
        boolean a = true;
        int k = 0;
        for(int i = 1; i < n; ++i){
            if(array[i - 1] >= array[i]){
                ++k;
            }
        }
        if(k == n - 1){
            System.out.println("This array is sorted");
            a = false;
        }
        if(a) {
            k = 0;
            for (int i = 1; i < n; ++i) {
                if (array[i - 1] <= array[i]) {
                    ++k;
                }
            }
            if (k == n - 1) {
                System.out.println("This array is sorted");
                a = false;
            }
            if (a) {
                System.out.println("This array is not sorted");
            }
        }
    }
}
