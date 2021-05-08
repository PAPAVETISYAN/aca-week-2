package day10;

import java.util.Scanner;

public class Task6 {
    //A three-letter word is given. The word consists only of Latin letters, small and large. Print the same word, where the first letter is capitalized, the rest are small.
    //Example` dog              Dog
    //                CAT             Cat
    //                Lip               Lip
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("a=");
        String a = scanner.nextLine();
        char a1=a.charAt(0);
        int b = (int)a1;
        if(a.charAt(0) >= 97 && a.charAt(0)<=122) {
            b -= 32;
            char a3 = (char)b;
            System.out.print(a3);
        }else {
            System.out.print(a.charAt(0));
        }
        for(int i = 1; i < a.length(); ++i){
            char a2=a.charAt(i);
            int c = (int)a2;
            if(a.charAt(i) >= 65 && a.charAt(i) <= 90){
                c += 32;
                char a4 = (char)c;
                System.out.print(a4);
            }else{
                System.out.print(a.charAt(i));
            }
        }
    }
}
