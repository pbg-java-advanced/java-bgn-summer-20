package l9arrays.Homework;

import java.util.Arrays;
import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the number of elements");
        int n = scanner.nextInt();
        int[] a = new int[n];

        for(int i = 0; i < a.length;i++){
            System.out.println("Please enter element" + (i + 1));
            a[i] = scanner.nextInt();
        }
      //  System.out.println(Arrays.toString(a));

        newArray(a);
    }

    public static int[] newArray(int[] a){
        int[] b = new int[(a.length * 2)];

        for (int i = 0;i < a.length;i++){
            b[(i*2)] = a[i];
            b[((i*2) + 1)] = a[i];
        }
        System.out.println(Arrays.toString(b));
        return b;
    }
}
