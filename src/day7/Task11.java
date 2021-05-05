package day7;

import java.util.Scanner;

public class Task11 {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("numberIntN=");
        int numberIntN = scanner.nextInt();
        int negativeInt = 0, positiveInt = 0, zeroInt = 0;
        for(int i = 0; i < numberIntN; ++i){
            System.out.print("numberIntX=");
            int numberIntX = scanner.nextInt();
            if(numberIntX > 0){
                ++positiveInt;
            }else if(numberIntX < 0){
                ++negativeInt;
            }else{
                ++zeroInt;
            }
        }
        System.out.println("positiveInt=" + positiveInt);
        System.out.println("negativeInt=" + negativeInt);
        System.out.println("zeroInt=" + zeroInt);
    }
}
