package exCandy;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

        Scanner scanner = new Scanner(System.in);

        String name;
        double sugar;
        double flour;
        double colorant;
        double filling;
        double price;
        char mu = 'g'; // metric unit
        String crncy = "BGN"; // currency

    public static void main(String[] args) {
        Main getVars = new Main();

        int numberOfCandies = 0;

        //wait for valid input
        boolean validInput = true;
        while(validInput){
            try {
                System.out.print("How much candies will you save: ");
                numberOfCandies = getVars.scanner.nextInt();
                getVars.scanner.nextLine();
                validInput = false;
            } catch (InputMismatchException exception) {
                System.out.println("Invalid input!");
                getVars.scanner.nextLine();
                validInput = true;

            }
        }

        Candy[] candies = new Candy[numberOfCandies];
        getVars.saveCandies(candies,numberOfCandies);

        System.out.println();
        System.out.println("What you saved: ");
        System.out.println();
        for(int p = 0; p < numberOfCandies; p++){
            System.out.print("Name: " + candies[p].getName() + "\t Sugar: " + candies[p].getSugar()+getVars.mu + "\t Flour: " + candies[p].getFlour()+getVars.mu);
            System.out.println("\t Colorant: " + candies[p].getColorant()+getVars.mu + "\t Filling: " + candies[p].getFilling()+getVars.mu + "\t Price: " + candies[p].getPrice()+" " + getVars.crncy);
        }

        getVars.sortCandiesArray(candies);
        getVars.printNeededInfo(candies);

    }


    Candy[] saveCandies(Candy[] candies, int numberOfCandies){
        for(int count = 0; count < numberOfCandies; count++) {
            System.out.print("Enter name for your candy " + ++count + " : " );
            count--;
            name = scanner.nextLine();

            System.out.print("Enter amount of sugar for it: ");
            sugar = scanner.nextDouble();

            System.out.print("Enter amount of flour for it: ");
            flour = scanner.nextDouble();

            System.out.print("Enter amount of colorant for it: ");
            colorant = scanner.nextDouble();

            System.out.print("Enter amount of filling for it: ");
            filling = scanner.nextDouble();

            System.out.print("Enter price for it: ");
            price = scanner.nextDouble();
            scanner.nextLine();

            Candy candy = new Candy(name,sugar,flour,colorant,filling,price);
            candies[count] = candy;
        }
        return candies;
    }

    void sortCandiesArray(Candy[] candies){
        //sort objects by price
        for (int ii = 1; ii < candies.length; ii++) {
            for (int i = 0; i < candies.length; i++) {
                if (i + 1 == candies.length) {
                    break;
                }
                if (candies[i].getPrice() > candies[i + 1].getPrice()) {
                    Candy tempCandy = new Candy(candies[i].getName(), candies[i].getSugar(), candies[i].getFlour(), candies[i].getColorant(), candies[i].getFilling(), candies[i].getPrice());
                    candies[i] = candies[i + 1];
                    candies[i + 1] = tempCandy;
                }
            }
        }
    }

    void printNeededInfo(Candy[] candies) {
        while (true) {
            System.out.println();
            System.out.println("(M - middle price candy, E - expensive candy, C - cheap candy)");
            System.out.print("Which candy to be printed? --> ");
            char answear = scanner.next().charAt(0);

            switch (answear) {
                case 'C':
                case 'c':
                    System.out.println("The cheapest candy is: (Name): " + candies[0].getName() + " \t\t (Price): " + candies[0].getPrice());
                    System.exit(0);

                case 'E':
                case 'e':
                    System.out.println("The most expensive candy is: " + candies[candies.length - 1].getName() + "\t\t (Price): " + candies[candies.length - 1].getPrice());
                    System.exit(0);

                case 'M':
                case 'm':
                    if (candies.length == 1 || candies.length == 2) {
                        System.out.println("There is no middle price candy!");
                    }
                    if (candies.length % 2 == 0) {
                        System.out.println("There are two candies with middle price: ");
                        System.out.println("Name of candy: " + candies[candies.length / 2].getName() + " \t\tPrice: " + candies[candies.length / 2].getPrice() + " " + crncy);
                        System.out.println("Name of candy: " + candies[candies.length / 2 - 1].getName() + "\t\t Price: " + candies[candies.length / 2 - 1].getPrice() + " " + crncy);
                    } else {
                        System.out.println("The candy with middle price is: (Name): " + candies[candies.length / 2].getName() + "\t\t (Price): " + candies[candies.length / 2].getPrice() + " " + crncy);
                    }
                    System.exit(0);

                default:
                    System.out.println("Invalid input!");
            }
        }
    }


}
