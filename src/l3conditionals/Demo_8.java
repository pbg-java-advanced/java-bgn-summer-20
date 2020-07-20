package l3conditionals;

import java.util.Scanner;

/**
 * Illustrates the use of clauses without a break.
 */
public class Demo_8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dayNum = Integer.parseInt(scanner.nextLine());

        switch (dayNum){
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Weekday");
                break;
            case 6:
            case 7:
                System.out.println("Weekend");
                break;
            default:
                System.out.println("Not a valid day");
        }
    }
}
