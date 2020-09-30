package l9arrays.Homework;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {

        randomArray(5, 1, 10);

    }

    public static int[] randomArray(int size, int min, int max){
        Scanner scanner = new Scanner(System.in);
      //  size = scanner.nextInt();
       // min = scanner.nextInt();
     //   max = scanner.nextInt();
        int [] randomA = new int[size];
        Random random = new Random();

        for (int i = 0; i < size; i++){
            randomA[i] = random.nextInt(max);
        }
        System.out.println(Arrays.toString(randomA));
        return randomA;
    }
}
