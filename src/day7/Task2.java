package day7;

import java.util.Scanner;

public class Task2 {
    public static void main(String[]args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("numberIntA=");
        int numberIntA = scanner.nextInt();
        System.out.print("numberIntB=");
        int numberIntB = scanner.nextInt();
        System.out.print("numberIntC=");
        int numberIntC = scanner.nextInt();
        System.out.print("numberIntD=");
        int numberIntD = scanner.nextInt();
        for (int i = numberIntA; i <= numberIntB; ++i) {
            if (i % numberIntD == numberIntC) {
                System.out.println(i);
            }
        }

    }
}