package day7;

import java.util.Scanner;

public class Task9 {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        int numberIntSum = 0;
        for (int i = 0; i < 10; ++i) {
            System.out.print("numberInt=");
            int numberIntX = scanner.nextInt();
            numberIntSum += numberIntX;
        }
        System.out.println(numberIntSum);
    }
}
