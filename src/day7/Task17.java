package day7;

import java.util.Scanner;

public class Task17 {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("passwordStr=");
        String passwordStr = scanner.nextLine();
        boolean numberBetween = false, uppercaseBetween = false, lowercaseBetween = false, characterBetween = false;
        for(int i = 0; i <= passwordStr.length(); i++) {
            char passwordChar = passwordStr.charAt(i);
            if(passwordChar >= 48 && passwordChar <= 57){
                numberBetween = true;
            }else if(passwordChar >= 65 && passwordChar <= 90){
                uppercaseBetween = true;
            }else if(passwordChar >= 97 && passwordChar <= 122){
                lowercaseBetween = true;
            }else if(passwordChar == 35 || passwordChar == 36 || passwordChar == 64){
                characterBetween = true;
            }
        }
        if(numberBetween && uppercaseBetween && lowercaseBetween && characterBetween){
            System.out.println("This password is good");
        }else{
            System.out.println("taza pasvord gri");
        }
    }
}
