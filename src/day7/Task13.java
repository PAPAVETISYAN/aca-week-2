package day7;

import java.util.Scanner;

public class Task13 {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("numberIntN=");
        int numberIntN = scanner.nextInt();
        for(int i = 0; i < numberIntN; ++i){
            for(int j = 0; j < numberIntN; ++j){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
