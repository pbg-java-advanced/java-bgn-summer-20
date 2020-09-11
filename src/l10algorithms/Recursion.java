import java.math.BigInteger;
import java.util.Arrays;

public class Recursion {
    public static void main(String[] args) {
        printStarsDirectRecursion(5);
        printStarsIndirectRecursion(5);
//        int[] numbers = {2,5,6,1,9};
//        sort(numbers);
    }

//    public static void sort(int[] arr){
//        Arrays.sort(arr);
//        for(int i=0; i< arr.length; i++){
//            System.out.print(arr[i] + " ");
//        }
//    }

    public static void printStarsDirectRecursion(int n) {
        if(n==0){
            System.out.println();
        } else {
            System.out.print("*");
            printDots(n-1);
        }
    }

    public static void printStarsIndirectRecursion(int n) {
        if(n==0){
            System.out.println();
        } else {
            System.out.print("*");
            printDots(n-1);
        }
    }

    public static void printDots(int n){
        if(n==0){
            System.out.println();
        } else {
            System.out.print(".");
            printStarsIndirectRecursion(n);
        }

    }

}
