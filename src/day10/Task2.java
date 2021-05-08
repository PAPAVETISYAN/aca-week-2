package day10;

import java.util.Scanner;

public class Task2 {
    //Given number n. N minutes have passed since the beginning of the day. Determine how many hours and minutes the digital clock will show at this moment. The program should print two numbers: the number of hours (from 0 to 23) and the number of minutes (from 0 to 59). Note that the number n can be more than the number of minutes in a day
    public static void main(String[]args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("n=");
        int n = scanner.nextInt();
        int hours = 0;
        int minutes = n;
        int day = 0;
        if (n >= 0) {
            day = n / 1440;
            n -= day * 1440;
            hours = n / 60;
            minutes = n % 60;
        }
        if (day > 0) {
            System.out.println("day" + day);
        }
        if (hours > 0) {
            System.out.println("hours=" + hours);
        }
        if (minutes > 0) {
            System.out.println("minutes" + minutes);
        }
    }
}
