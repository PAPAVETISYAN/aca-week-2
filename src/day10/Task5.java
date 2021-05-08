package day10;

import java.util.Scanner;

public class Task5 {
    //You are given two four-digit numbers A and B. Print all four-digit numbers on the segment from A to B, the record of which is a palindrome.
    //Example` 1600                1661
    //                2100                 1771
    //                                          1881
    //                                          1991
    //                                          2002
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("number1=");
        int number1 = scanner.nextInt();
        System.out.print("number2=");
        int number2 = scanner.nextInt();
        if(number1 / 1000 > 0 && number2 / 1000 > 0){
            while(number1 <= number2){
                if(number1 / 1000 == number1 % 10 && (number1 / 10) % 10 == (number1 / 100) % 10){
                    System.out.println(number1);
                }
                ++number1;
            }
        }
    }
}
