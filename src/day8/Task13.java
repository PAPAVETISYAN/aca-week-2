package day8;

import java.util.Scanner;

public class Task13 {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.print("n=");
        int n = input.nextInt();
        int [ ] array = new int[n];
        for(int i = 0; i < n; ++i)
        {
            array[i] = input.nextInt();
        }
        int indexMax = 0, indexMin = 0;
        for(int i = 1;i < n; i++){
            if(array[i] > array[indexMax]){
                indexMax = i;
            }else if(array[i] < array[indexMin]){
                indexMin = i;
            }
        }
        int temp = array[indexMax];
        array[indexMax] = array[indexMin];
        array[indexMin] = temp;
        for(int i = 0; i < n; ++i){
            System.out.println(array[i]);
        }
    }
}
