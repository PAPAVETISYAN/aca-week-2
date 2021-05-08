package day10;

public class Task3 {
    //How many times will the body of the loop be executed?թեստ
    // for (int i = 2; i <= 15; i ++)
    //     {...}
    // for (int i = 10; i <= 100; i = i+7)
    //{...}
    //for (float i = 1.5; i <= 10.3; i = i+0.4)
    //{...}
    public static void main(String[]args){
        int loop1 = 0, loop2 = 0, loop3 = 0;
        for (int i = 2; i <= 15; i ++){
            ++loop1;
        }
        for (int i = 10; i <= 100; i = i+7){
            ++loop2;
        }
        for (float i = 1.5F; i <= 10.3; i = (float) (i+0.4)){
            ++loop3;
        }
        System.out.println(loop1);
        System.out.println(loop2);
        System.out.println(loop3);
    }
}
