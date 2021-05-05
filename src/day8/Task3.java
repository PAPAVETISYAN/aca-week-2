package day8;

import java.util.Scanner;

public class Task3 {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int [ ] aray = new int[n];
        for(int i = 0; i < n; ++i)
        {
            aray[i] = input.nextInt();
        }
        for(int i = 0; i < n ; i++){
            if(aray[i] > 0){
                System.out.println(aray[i]);
            }
        }
    }
}
