package ralitsa.l5whileLoops;

import java.util.Scanner;

public class Ex13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int num = Integer.parseInt(scanner.nextLine());
        int digit = 0;
        while (num > 0) {
            digit = num % 10;
            num = num / 10;
            if (digit % 2 == 0) {
                System.out.println("Not all digits are odd");
                break;
            }
            if (num == 0) {
                System.out.println("All digits are odd");
            }
        }
    }
}
