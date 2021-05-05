package day6;

import java.util.Scanner;

public class Task8 {
    public static void main(String[]args){
        System.out.println("enter an integer");
        Scanner scanner = new Scanner(System.in);
        int numberInt;
        boolean k = true;
        int x=0;
       do{

           System.out.print("numberInt=");
           numberInt = scanner.nextInt();
           int i=1;
           int j=1;
           ++x;
           while (numberInt>=j){
               ++i;
               j *=2;
           }
           if(numberInt == j/2){
               System.out.println(numberInt);
               System.out.println(x);
               k=false;
           }
       }while(k);
    }
}
