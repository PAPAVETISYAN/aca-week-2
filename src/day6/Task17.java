package day6;

public class Task17 {
    public static void main(String[]args){
        int numberInt = 123;
        int sum = 0;
        while(numberInt > 0){
            sum += numberInt % 10;
            numberInt /= 10;
        }
        System.out.println(sum);
    }
}
