package l9arrays.Homework;

import java.util.Arrays;
import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the number of elements");
        int n = scanner.nextInt();
        int [] a = new int[n];

        for (int s = 0; s < a.length;s++){
            System.out.println("Please enter element " + (s+1));
            a[s] = scanner.nextInt();
        }

        reverseCopy(a);
    }

    public static int[] reverseCopy(int[] a){
        int temp = 0;
        for (int i = 0; i < a.length/2;i++){
            temp = a[i];
            a[i] = a[a.length -i - 1];
            a[a.length -i - 1] = temp;
        }
        System.out.println(Arrays.toString(a));
        return a;
    }
}
