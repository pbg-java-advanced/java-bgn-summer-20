package l9arrays.Homework;

import java.util.Arrays;
import java.util.Scanner;

public class Ex9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the number of elements of array1");
        int n = scanner.nextInt();
        int[] a1 = new int[n];
        System.out.println("Please enter the number of elements of array2");
        int m = scanner.nextInt();
        int[] a2 = new int[m];
        System.out.println("Please enter the number of elements of array3");
        int k = scanner.nextInt();
        int[] a3 = new int[k];

        for (int i = 0; i < a1.length; i++) {
            System.out.println("Please enter element" + (i + 1) + " of array1");
            a1[i] = scanner.nextInt();
        }
        System.out.println(Arrays.toString(a1));

        for (int i = 0; i < a2.length; i++) {
            System.out.println("Please enter element" + (i + 1) + " of array2");
            a2[i] = scanner.nextInt();
        }
        System.out.println(Arrays.toString(a2));

        for (int i = 0; i < a3.length; i++) {
            System.out.println("Please enter element" + (i + 1) + " of array3");
            a3[i] = scanner.nextInt();
        }
        System.out.println(Arrays.toString(a3));

        merge3(a1, a2, a3);

    }

    public static int[] merge3(int[] a1, int[] a2, int[] a3) {
        int count = 0;
        int[] a4 = new int[a1.length + a2.length + a3.length];

        for (int i = 0; i < a1.length; i++) {
            a4[i] = a1[i];
            count++;
        }
        for (int i = 0; i < a2.length; i++) {
            a4[count++] = a2[i];

        }
        int add = a1.length + a2.length;
        for (int i = 0; i < a3.length; i++) {
            a4[add] = a3[i];
            add++;
        }

        System.out.println(Arrays.toString(a4));
        return a4;
    }
}
