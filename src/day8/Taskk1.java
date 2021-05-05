package day8;

public class Taskk1 {
    public static void main(String[]args){
        int [ ] array = new int[1000];

        for(int i = 0;i <= 1000; ++i)
        {
            array[i] = (i + 1) * 7;
            System.out.println(array[i]);

        }
    }
}
