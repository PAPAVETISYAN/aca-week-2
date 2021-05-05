package day6;

import java.util.Scanner;

public class Task9 {public static void main(String[]args){
    System.out.println("enter an integer");
    Scanner scanner = new Scanner(System.in);
    int numberInt;
    int x=0;
        System.out.print("numberInt=");
        numberInt = scanner.nextInt();
        int i=0;
        int j=1;
        while (numberInt>=j){
            ++i;
            j *=2;
        }
            System.out.println(i);
}
}