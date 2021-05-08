package day10;

import java.util.Scanner;

public class Task9 {
    //A natural number> = 2 is specified. Expand it into prime factors.
    //Example` Input` 120            2*2*2*3*5
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("number=");
        int number = scanner.nextInt();
        for (int i = 2; i < number; ){
            if(number % i == 0){
                System.out.print(i + "*");
                number /= i;
            }else{
                ++i;
            }
        }
        System.out.print(number);
        //???????????
    }
}
