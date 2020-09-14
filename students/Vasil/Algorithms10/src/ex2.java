import java.math.BigInteger;
import java.util.Scanner;

public class ex2 {

    public static void main(String[] args) {
        System.out.println(Long.MAX_VALUE);
        System.out.print("Enter number: ");
        Scanner scanner = new Scanner(System.in);
        int saveNumber = scanner.nextInt();
        long result = 1;
        factorial(saveNumber,result);
        factorial(saveNumber);
    }


    public static void factorial(int getNumber, long result){
        if(getNumber != 1){
            result *= getNumber;
            factorial(getNumber-1,result);
        }else{
            System.out.println("First way - recursion");
            System.out.println("Factorial of entered number is: " + result);
            System.out.println();
        }

    }

    public static void factorial(int getNumber){
        BigInteger result = BigInteger.valueOf(1);
        for(int count = 1; count <= getNumber; count++){
            result = result.multiply(BigInteger.valueOf(count));
        }
        System.out.println("Second way - For-loop");
        System.out.println("Factorial of entered number is: " + result);
        System.out.println();

    }

}
