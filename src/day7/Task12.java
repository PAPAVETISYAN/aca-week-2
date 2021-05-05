package day7;

import java.util.Scanner;

public class Task12 {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("numberIntN=");
        int numberIntN = scanner.nextInt();
        int k = 0;
        anun:
        for(int i = 1; i < numberIntN; ++i){
            for(int j = 0; j < i; ++j){
                System.out.println(i + " ");
                ++k;
                if(k == numberIntN){
                    break anun;
                }
            }
        }
    }
}
