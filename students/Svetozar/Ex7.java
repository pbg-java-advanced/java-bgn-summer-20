package l9arrays.Homework;

import java.util.Arrays;
import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {

        average();

    }

    public static void average() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the number of elements");
        int n = scanner.nextInt();
        int[] a = new int[n];
        double sum = 0;

        for (int i = 0; i < a.length; i++) {
            System.out.println("Please enter element" + (i + 1));
            a[i] = scanner.nextInt();
             sum = sum + a[i];
        }
        // System.out.println(Arrays.toString(a));
        System.out.printf("The average result is %.2f", (sum / n));
    }
}
