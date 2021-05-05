package day6;

import java.util.Scanner;

public class Task13 {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("numberInt1=");
        int x = scanner.nextInt();
        System.out.print("numberInt2=");
        int y = scanner.nextInt();
        int z=0;
        while(y > (x + ((x * 10) / 100))) {
            x = (x + ((x * 10) / 100));
            ++z;
        }
        System.out.println(z);
    }
}
