package day7;

import java.util.Scanner;

public class Task3 {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("numberIntA=");
        int numberIntA = scanner.nextInt();
        System.out.print("numberIntB=");
        int numberIntB = scanner.nextInt();
        if( numberIntA <= numberIntB){
            for(int i = numberIntA; i <= numberIntB; ++i){
                if(Math.sqrt(i) % 2 == 0 || Math.sqrt(i) % 2 == 1){
                    System.out.println(i);
                }
            }
        }
    }
}
