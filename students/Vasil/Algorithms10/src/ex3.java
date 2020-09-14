import java.util.Scanner;

public class ex3 {

    public static void main(String[] args) {
        System.out.print("Enter how many numbers to contain Fibonacci order: ");
        Scanner scanner = new Scanner(System.in);
        int limitNumber = scanner.nextInt();
        int first = 0, second = 1, result = 0;
        System.out.print(first + " ");
        System.out.print(second +  " ");
        result = first + second;
        fibonacciOrder(limitNumber, result, first, second);

    }

    public static void fibonacciOrder(int limit, int result, int first, int second){
        if(limit != 0) {
            System.out.print(result + " ");
            first = second;
            second = result;
            result = first + second;
            fibonacciOrder(limit-1, result, first, second);
        }



    }

}
