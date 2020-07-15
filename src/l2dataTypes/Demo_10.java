package l2dataTypes;

import java.util.Scanner;

/**
 * Read the number of gallons from the console
 * and convert to liters.
 */
public class Demo_10 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of gallons: ");

        //double numGallons = scanner.nextDouble();
        double numGallons = Double.parseDouble(scanner.nextLine());

        double liters = 3.785 * numGallons;

        System.out.println(numGallons + " gallons = " + liters + " liters.");
    }

}
