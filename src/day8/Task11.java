package day8;

import java.util.Scanner;

public class Task11 {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.print("n=");
        int n = input.nextInt();
        int [ ] array = new int[n];
        for(int i = 0; i < n; ++i)
        {
            array[i] = input.nextInt();
        }
        if(n % 2 == 0) {
            for (int i = 0; i < n; i += 2) {
                int temp = array[i];
                array[i]=array[i + 1];
                array[i + 1]=temp;
            }
        }else{
            for (int i = 0; i < n - 1; i += 2) {
                int temp = array[i];
                array[i]=array[i + 1];
                array[i + 1]=temp;
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.println(array[i]);
        }
    }
}
