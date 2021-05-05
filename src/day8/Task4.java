package day8;

import java.util.Scanner;

public class Task4 {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int [ ] aray = new int[n];
        for(int i = 0; i < n; ++i)
        {
            aray[i] = input.nextInt();
        }
        for(int i = 1; i < n ; i++){
            if(aray[i] > aray[i - 1]){
                System.out.println(aray[i]);
            }
        }
    }
}
