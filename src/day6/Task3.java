package day6;

import java.util.Scanner;

public class Task3 {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("numberInt=");
        int numberInt = scanner.nextInt();
        for(int i=1;i<Math.sqrt(numberInt);++i){
            System.out.println(Math.pow(i,2));
        }
    }
}
