package day7;

import java.util.Scanner;

public class Task16 {
        public static void main(String[]args){
            Scanner scanner = new Scanner(System.in);
            System.out.print("numberIntN=");
            int numberIntN = scanner.nextInt();
            for (int i = 0; i < numberIntN; ++i) {
                for (int j = 0; j <= i; ++j) {
                    System.out.print("*");
                }
                System.out.println();
            }
            System.out.println();
            for (int i = 0; i < numberIntN; i++) {
                for (int j = 0; j < numberIntN; j++) {
                    if(i <= j) {
                        System.out.print("*");
                    }else {
                        System.out.print(" ");
                    }
                    }
                System.out.println();
                }
            System.out.println();
         for (int i = numberIntN; i > 0; --i) {
                for (int j = i; j > 0; --j) {
                    System.out.print("*");
                }
                System.out.println();
            }
            System.out.println();
            for (int i = 0; i < numberIntN; i++) {
                for (int j = 0; j < numberIntN; j++) {
                    if (i + j >= numberIntN - 1){
                    System.out.print("*");
                }else {
                        System.out.print(" ");
                    }
                    }
                System.out.println();
            }
        }
    }
