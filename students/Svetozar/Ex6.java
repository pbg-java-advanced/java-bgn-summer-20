package l9arrays.Homework;

import java.util.Arrays;
import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the number of elements");
        int n = scanner.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];

        for(int i = 0; i <a.length;i++){
            System.out.println("Array a Element" + (i+1));
            a[i] = scanner.nextInt();
        }
        System.out.println(Arrays.toString(a));

        for(int j = 0;j < b.length;j++){
            System.out.println("Array b Element" + (j+1));
            b[j] = scanner.nextInt();
        }
        System.out.println(Arrays.toString(b));

        check(a, b);

    }
    public static int[] check(int[] a, int[] b){
        int counter = 0;
        for(int i = 0; i < a.length;i++){
            if (a[i] == b[i]){
                counter++;
            }
        }
        if (counter == a.length){
            System.out.println("The arrays are equal");
        }
        else {
            System.out.println("The arrays are different");
        }
        return a;
    }
}
