import java.util.Scanner;

public class ex1 {
    public static void mainm(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number --> ");
        long number = scanner.nextLong();
        System.out.print("Enter power --> ");
        long power = scanner.nextLong();
        long result = 1;

        for(int start = 1; start <= power; start++){
            result *= number;
        }
        System.out.print("The result of " + number + "^" + power + " is --> " + result);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number --> ");
        long number = scanner.nextLong();
        System.out.print("Enter power --> ");
        long power = scanner.nextLong();
        System.out.println("The result of " + number + "^" + power + " is --> " + (int) Math.pow(number,power));
    }
}
