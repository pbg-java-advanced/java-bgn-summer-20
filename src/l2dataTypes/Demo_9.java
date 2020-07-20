package l2dataTypes;

import java.util.Scanner;

/**
 * Illustrates reading an integer from the console
 */
public class Demo_9 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("What is your age? ");

        //int age = scanner.nextInt();
        int age = Integer.parseInt(scanner.nextLine());

        System.out.println("You are " + age + " year old.");
    }
}
