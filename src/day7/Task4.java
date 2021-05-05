package day7;

import java.util.Scanner;

public class Task4 {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        int numberIntD = 0;
        do {
            System.out.print("numberIntD=");
            numberIntD = scanner.nextInt();
        }while (numberIntD < 0 || numberIntD > 9);
        System.out.print("numberIntX=");
        int numberIntX = scanner.nextInt();
        int k = 0;
        for( ; numberIntX > 0;){
            if(numberIntX % 10 == numberIntD){
                k++;
            }
            numberIntX /= 10;
        }
        System.out.println(numberIntD + "is repeating " + k + " times");
    }
}
