package day6;

import java.util.Scanner;

public class Task14 {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("numberIntX=");
        int x = scanner.nextInt();
        System.out.print("numberIntP=");
        int p = scanner.nextInt();
        System.out.print("numberIntY=");
        int y = scanner.nextInt();
        int z=0;
        while(y > (x + ((x * p) / 100))) {
            x = (x + ((x * p) / 100));
                ++z;
            }
            System.out.println(++z);
    }
}
