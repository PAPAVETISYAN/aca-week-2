package day6;

import java.util.Scanner;

public class Task7 {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("numberInt=");
        int numberInt = scanner.nextInt();
        for(int i=numberInt;i>0;--i) {
            if(i%2==0) {
                System.out.print(i + " ");
            }
        }
    }
}
