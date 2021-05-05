package day7;

import java.util.Scanner;

public class Task10 {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("numberIntX=");
        int numberIntX = scanner.nextInt();
        int numberIntSum = 0;
        int k = 0;
        for( ; numberIntX > 0; ){
            numberIntSum += (numberIntX % 10) * (int)Math.pow(2,k);
            ++k;
            numberIntX /= 10;
        }
        System.out.println(numberIntSum);
    }
}
