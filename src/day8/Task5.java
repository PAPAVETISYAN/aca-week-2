package day8;

import java.util.Scanner;

public class Task5 {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int [ ] array = new int[n];
        for(int i = 0; i < n; ++i)
        {
            array[i] = input.nextInt();
        }
        for(int i = 1; i < n ; i++){
            if(array[i - 1] > 0 && array[i] > 0){
                System.out.println(array[i - 1] + " " + array[i]);
                break;
            }else if(array[i - 1] < 0 && array[i] < 0){
                System.out.println(array[i - 1] + " " + array[i]);
                break;
            }
        }
    }
}
