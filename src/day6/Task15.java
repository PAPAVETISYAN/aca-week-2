package day6;

import java.util.Scanner;

public class Task15 {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        int max1 = 0,max2 = 0,x ;
        do{
            System.out.print("numberInt=");
            x = scanner.nextInt();
            if(x > max1 ){
                max2 =max1;
                max1 = x;
            }
            if (x < max1 && x > max2){
                max2 = x;
            }
        }while(x != 0);
        System.out.println(max2);
    }
}
