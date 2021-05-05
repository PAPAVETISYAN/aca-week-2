package day6;

import java.util.Scanner;

public class Task12 {
    public static void main(String[]args){
        int a = 1, b = 1, c = a + b, x = 3;
        Scanner scanner = new Scanner(System.in);
        System.out.print("numberInt=");
        int numberInt = scanner.nextInt();
        while(c < numberInt){
            a = b;
            b = c;
            c = a + b;
            ++x;
        }
        if(numberInt == c){
            System.out.println(x);
        }else{
            System.out.println(-1);
        }
    }
}
