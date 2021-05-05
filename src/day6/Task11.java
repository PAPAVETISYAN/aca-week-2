package day6;

import java.util.Scanner;

public class Task11 {
    public static void main(String[]args){
        Scanner scanner =new Scanner(System.in);
        System.out.print("numberInt=");
        int numberInt = scanner.nextInt();
        for(int i=0;i<=numberInt;++i){
            if(i%3 == 0){
                continue;
            }
            System.out.print(i+" ");
        }
    }
}
