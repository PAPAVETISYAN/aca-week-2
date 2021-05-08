package day10;

import java.util.Scanner;

public class Task1 {
    //.A natural number N is given (entered from the keyboard). Calculate 2 to the power of N(2-i n աստիճան)
    //Display the calculated value (1 <= N <= 15)
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("n=");
        int n = scanner.nextInt();
        int number = 1;
        if(n >= 1 && n <= 15){
            for(int i = 1; i <= n; ++i){
                number *= 2;
            }
        }
        System.out.println(number);
    }
}
