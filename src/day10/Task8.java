package day10;

import java.util.Scanner;

public class Task8 {
    //The first term and the denominator of the geometric progression are given (real numbers b1 and q, q! = 0). An integer n is also given. Print the n-th term of a geometric progression. Don't use the pow function, use a for loop. Print the answer with precision exactly two characters after the period.
    //Example` Input ` 2   2           32.0
    //                              5
    //3.2   1.5          10.80
    // 4
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("b1=");
        double b1 = scanner.nextDouble();
        System.out.print("q=");
        double q = scanner.nextDouble();
        System.out.print("n=");
        int n = scanner.nextInt();
        double bn = b1;
        for(int i = 1; i < n; ++i){
            bn *= q;
        }
        System.out.println(bn);
    }
}
