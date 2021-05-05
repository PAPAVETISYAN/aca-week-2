package day8;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int [ ] aray = new int[n];
        for(int i = 0; i < n; ++i)
        {
            aray[i] = input.nextInt();
        }
        int numberMin = 0;
        for(int i = 0; i < n ; i++){
            if(aray[i] > 0){
                numberMin = aray[i];
                for(int j = 0; j < n; ++j){
                    if(aray[j] > 0 && aray[j] < numberMin)
                    {
                        numberMin = aray[j];
                    }
                }
            }
        }
        System.out.println();
        System.out.println(numberMin);
    }
}
