package day10;

import java.util.Scanner;

public class Task4 {
    //Write a java program to determine whether the number is prime or not.
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("n=");
        int n = scanner.nextInt();
        boolean k = false;
        for(int i = 2; i <= Math.sqrt(n); ++i){
            if(n % i == 0){
                k = true;
                break;
            }
        }
        if(k){
            System.out.println(n + " is not prime number");
        }else{
            System.out.println(n + " is prime number");
        }
    }
}
