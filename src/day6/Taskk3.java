package day6;

import java.util.Scanner;

public class Taskk3 {
    public static void main(String[] args) {
        System.out.println("enter an integer");
        char numberChar = 0;
        boolean k = true;
        while (k) {
            System.out.print("numberInt1=");
            Scanner scanner = new Scanner(System.in);
            numberChar = scanner.nextLine().charAt(0);
            if(numberChar == 49 || numberChar == 50 || numberChar == 51){
                k = false;
            }

        }
        k = true;
                while (k) {
                    double radius = 4;
                    switch (numberChar) {
                        case 49:
                            double perimeter = radius * 2 * Math.PI;
                            System.out.println("perimeter=" + perimeter);
                            break ;
                        case 50:
                            double area = radius * radius * Math.PI;
                            System.out.println("area=" + area);
                            break;
                        case 51:
                            k = false;
                            break;
                    }
                    break;
            }
        }
    }