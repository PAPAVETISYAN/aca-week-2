package day7;

import java.util.Scanner;

public class Task1 {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("numberIntA=");
        int numberIntA = scanner.nextInt();
        System.out.print("numberIntB=");
        int numberIntB = scanner.nextInt();
        if(numberIntA % 2 == 0){
            for(int i = numberIntA;i <= numberIntB; i += 2){
                System.out.println(i);
            }
        }else{
            for(int i = numberIntA + 1;i <= numberIntB; i += 2){
                System.out.println(i);
            }
        }

    }
}
