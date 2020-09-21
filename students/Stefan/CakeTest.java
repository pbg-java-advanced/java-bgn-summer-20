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
            System.out.println("Price: ");
            double price = scanner.nextDouble();
            scanner.nextLine();
            Cake sweet = new Cake(cakeName, sugarQuantity, flourQuantity, colorQuantity, fillerQuantity, price);
            cakes[i] = sweet;

        }

        for (int i = 0; i < cakes.length; i++) {
            System.out.println(cakes[i].getName() + " " + cakes[i].getNesessarySugarQuantity() + " " + cakes[i].getNecessaryFlourQuantity()
                    + " " + cakes[i].getNecessaryColorCake() + " " + cakes[i].getNecessaryFiller() + " " + cakes[i].getPrice());

        }
        double highestPrice = Double.MIN_VALUE;
        String nameOfTheCake = null;
        double tempPrice;
        for (int i = 0; i < cakes.length; i++) {
            tempPrice = cakes[i].getPrice();
            if (tempPrice > highestPrice) {
                highestPrice = tempPrice;
            }
        }
        System.out.println("The highest price is: " + highestPrice);
        for(int i = 0; i < cakes.length; i++){
            if (highestPrice == cakes[i].getPrice()){
                nameOfTheCake = cakes[i].getName();
            }
        }
        System.out.println("The name is: " + nameOfTheCake);
        double lowestPrice = Double.MAX_VALUE;
        double tempLowPrice;
        for (int i = 0; i < cakes.length; i++) {
            tempLowPrice = cakes[i].getPrice();
            if (tempLowPrice < lowestPrice) {
                lowestPrice = tempLowPrice;
            }
        }
        System.out.println("The lowest price is: " + lowestPrice);
        for(int i = 0; i < cakes.length; i++){
            if (lowestPrice == cakes[i].getPrice()){
                nameOfTheCake = cakes[i].getName();
            }
        }
        System.out.println("The name is: " + nameOfTheCake);
        double middlePrice=0;
        for(int i = 0; i < cakes.length; i++){
            if (cakes[i].getPrice() > lowestPrice && cakes[i].getPrice() < highestPrice) {
                middlePrice = cakes[i].getPrice();
            }

        }
        System.out.println("The middle price is: " + middlePrice);
        for(int i = 0; i < cakes.length; i++){
            if (middlePrice == cakes[i].getPrice()){
                nameOfTheCake = cakes[i].getName();
            }
        }
        System.out.println("The name is: " + nameOfTheCake);
    }

}
