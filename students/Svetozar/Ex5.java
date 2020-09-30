package l9arrays.Homework;

import java.util.Arrays;
import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        System.out.println("Please enter the elements");
        Scanner scanner = new Scanner(System.in);
        int [] array = new int[20];
        int [] array2 = new int[20];

        for(int i = 0;i < array.length;i++){
            System.out.println("Element " + (i+1));
            array[i] = scanner.nextInt();
            array2[i] = array[i] * 5;
        }
        System.out.println(Arrays.toString(array2));
    }
}
