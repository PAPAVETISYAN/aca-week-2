package day8;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int [ ] aray = new int[n];
        for(int i = 0; i < n; ++i)
        {
            aray[i] = input.nextInt();
        }
        int numberMax = aray[0];
        int numberMaxIndex = 0;
        for(int i = 1; i < n ; i++){
            if(aray[i] > numberMax){
                numberMaxIndex = i;
                int temp = numberMax;
                numberMax = aray[i];
                aray[i] = temp;
            }
        }
        System.out.println();
        System.out.println(numberMax);
        System.out.println(numberMaxIndex);
    }
}
