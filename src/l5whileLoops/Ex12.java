package ralitsa.l5whileLoops;

import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int num = Integer.parseInt(scanner.nextLine());
        int digit = 0;

        while (num > 0) {
            digit = num % 10;
            num = num / 10;
            if (digit % 2 != 0) {
                System.out.println("There is an odd digit in the number");
                break;
            }
        }
        if (digit % 2 == 0) {
            System.out.println("There is no odd digit in the number");
        }
    }
}














