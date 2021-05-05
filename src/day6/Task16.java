package day6;

import java.util.Random;
import java.util.Scanner;

public class Task16 {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("numberInt=");
        Random random = new Random();
        int numberRand = random.nextInt();
        int numberInt;
        do {
             numberInt = scanner.nextInt();
             if(numberInt > numberRand){
                 System.out.println("Too high, try again");
                 System.out.print("numberInt=");
             }else if(numberInt<numberRand){
                     System.out.println("Too low, try again");
                     System.out.print("numberInt=");
             }else{
                 System.out.println("Yes, you guessed the number");
             }
        }while(numberInt != numberRand);

    }
}
