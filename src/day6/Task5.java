package day6;

import java.util.Scanner;

public class Task5 {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("numberInt=");
        int numberInt = scanner.nextInt();
        for(int i=0;Math.pow(2,i)<=numberInt;++i){
            System.out.println(Math.pow(2, i));
        }
    }
}
