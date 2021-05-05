package day7;

import java.util.Scanner;

public class Task8 {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("numberIntX=");
        int numberIntX = scanner.nextInt();
        int k = 0;
        for(int i = 1; i <= numberIntX; ++i){
            if(numberIntX % i == 0){
                ++k;
            }
        }
        System.out.println(k);
    }
}
