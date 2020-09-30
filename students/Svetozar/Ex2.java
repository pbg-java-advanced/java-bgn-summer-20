package l9arrays.Homework;

import java.util.Arrays;
import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the number of elements");
        int n = scanner.nextInt();
        int [] a = new int[n];

        for (int s = 0; s < a.length;s++){
            System.out.println("Please enter element " + (s+1));
            a[s] = scanner.nextInt();
        }
        // System.out.println(Arrays.toString(a));

        swap(a, 2, 3);
    }
    public static void swap(int[] a, int i, int j){

        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
        System.out.println(Arrays.toString(a));
    }
}
