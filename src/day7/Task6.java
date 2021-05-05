package day7;

import java.util.Scanner;

public class Task6 {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("numberIntX=");
        int numberIntX = scanner.nextInt();
        int k = 0;
        for(int i = 2; i <= numberIntX / 2; ++i){
            if(numberIntX % i == 0){
                ++k;
            }
        }
        System.out.println(k);
    }
}
