package day6;

public class Task10 {
    public static void main(String[]args){
        int k=0;
        for(char i=32;i<=122;i++){
            System.out.print(i + " ");
            ++k;
            if(k%10==0){
                System.out.println("");
            }
        }
    }
}
