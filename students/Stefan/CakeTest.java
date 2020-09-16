package Cakes;

import java.util.Scanner;

public class CakeTest {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("How many cakes do you want to add: ");
        int numberOfCakes = scanner.nextInt();
        scanner.nextLine();

        Cake[] cakes = new Cake[numberOfCakes];

        for (int i = 0; i < cakes.length; i++) {
            System.out.println("Please name the cake: ");
            String cakeName = scanner.nextLine();
            System.out.println("Sugar quantity: ");
            int sugarQuantity = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Flour quantity: ");
            int flourQuantity = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Sugarcolor quantity: ");
            int colorQuantity = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Fillercolor quantity: ");
            int fillerQuantity = scanner.nextInt();
            scanner.nextLine();
            Cake sweet = new Cake(cakeName,sugarQuantity,flourQuantity, colorQuantity,fillerQuantity);
            cakes[i] = sweet;

        }
        for (int i = 0; i < cakes.length; i++) {
            System.out.println(cakes[i].getName() + " " + cakes[i].getNesessarySugarQuantity() + " " + cakes[i].getNecessaryFlourQuantity()
                    + " " + cakes[i].getNecessaryColorCake() + " " + cakes[i].getNecessaryFiller());
        }
    }
}
