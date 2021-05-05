package day7;

import java.util.Scanner;

public class Task15 {
    public static void main(String[]args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("numberIntN=");
        int numberIntN = scanner.nextInt();
        for (int i = 1; i <= numberIntN; ++i) {
            for (int j = 1; j <= numberIntN; ++j) {
                System.out.print(i * j + " ");
            }
            System.out.println();
        }
    }
}
