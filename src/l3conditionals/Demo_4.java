package l3conditionals;

import java.util.Scanner;

/**
 * Compare two numbers and distinguish among three
 * conditions: a=b, a>b, a<b
 */
public class Demo_4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(
                "Please enter two numbers (on separate lines).");
        int first = input.nextInt();
        int second = input.nextInt();
        if (first == second) {
            System.out.println("These two numbers are equal.");
        } else {
            if (first > second) {
                System.out.println("The first number is greater.");
            } else {
                System.out.println("The second number is greater.");
            }
        }
    }
}
