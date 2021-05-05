package day7;

import java.util.Scanner;

public class Task7 {
    public static void main(String[]args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("numberIntX=");
        int numberIntX = scanner.nextInt();
        for(int i = 1; i <= numberIntX; ++i){
            if(numberIntX % i == 0){
                System.out.print(i+" ");
            }
        }
    }
}
