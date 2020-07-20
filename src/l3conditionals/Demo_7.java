package l3conditionals;

import java.util.Scanner;

/**
 * Illustrates the use of a switch statement.
 */
public class Demo_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dayNum = Integer.parseInt(scanner.nextLine());

        switch (dayNum){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            default:
                System.out.println("Not a work day");
        }
    }
}