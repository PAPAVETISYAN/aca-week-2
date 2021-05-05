package day7;

import java.util.Scanner;

public class Task5 {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("numberIntX=");
        int numberIntX = scanner.nextInt();
        boolean bool = false;
        for( ; numberIntX > 0;){
            if(numberIntX % 10 >0){
                System.out.print(numberIntX % 10);
                bool = true;
            }else if(bool){
                System.out.print(numberIntX % 10);
            }
            numberIntX /= 10;
        }
    }
}
