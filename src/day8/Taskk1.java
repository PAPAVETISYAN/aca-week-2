package day8;

public class Taskk1 {
    public static void main(String[]args) {
        int[] number7 = new int[1000];
        number7[0] = 1;
        for (int i = 1; i <= 7000; ++i) {
            number7[i] = number7[i - 1] * 7;
        }
    }
}
