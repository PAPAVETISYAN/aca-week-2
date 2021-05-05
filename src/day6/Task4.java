package day6;

import java.util.Scanner;

public class Task4 {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("numberInt=");
        int numberInt = scanner.nextInt();
        for(int i = 2; i <= numberInt; ++i){
            if(numberInt % i == 0){
                System.out.println(i);
                break;
            }
        }
    }
}
