package l3conditionals;

import java.util.Scanner;

/**
 * Enter week day number.
 * Output weekday.
 * Illustrates multiple if and the need of switch.
 */
public class Demo_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dayNum = Integer.parseInt(scanner.nextLine());

        if( dayNum == 1 ) {
            System.out.println("Monday");
        }
        else if( dayNum == 2 ) {
            System.out.println("Tuesday");
        }
        else if( dayNum == 3 ) {
            System.out.println("Wednesday");
        }
        else if( dayNum == 4 ) {
            System.out.println("Thursday");
        }
        else if( dayNum == 5 ) {
            System.out.println("Friday");
        }
    }
}
