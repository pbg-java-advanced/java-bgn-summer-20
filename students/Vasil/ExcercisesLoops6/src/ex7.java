import java.util.Scanner;

public class ex7 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter number --> ");
            int num = scanner.nextInt();       //10
            boolean isPrime = false;
            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    isPrime = true;
                    break;
                }
            }

            if (!isPrime) {
                System.out.println(num + " is a prime number.");
            } else {
                System.out.println(num + " is not a prime number.");
            }
        }
    }
