package cars;

import java.util.Scanner;

public class CarTest {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("How many cars do you want to add in the list: ");
        int numberOfCars = scanner.nextInt();
        scanner.nextLine();
        Car[] carsArray = new Car[numberOfCars];
        for (int i = 0; i < carsArray.length; i++) {
            System.out.print("Please enter the brand of the vehicle: ");
            String brand = scanner.nextLine();
            brand.toLowerCase();
            System.out.print("Please enter the model of the vehicle: ");
            String model = scanner.nextLine();
            System.out.print("Please enter the color of the vehicle: ");
            String color = scanner.nextLine();
            System.out.print("Please enter the power of the vehicle in hp (horse power): ");
            int horsePower = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Please enter the engine type of the vehicle: ");
            String engineType = scanner.nextLine();
            engineType.toLowerCase();
            System.out.print("Please enter the gearbox type of the vehicle: ");
            String gearboxType = scanner.nextLine();
            gearboxType.toLowerCase();
            System.out.print("Please enter the production date of the vehicle (year): ");
            int productionDate = scanner.nextInt();
            scanner.nextLine();
            Car newCar = new Car(brand, model, color, horsePower, engineType, gearboxType, productionDate);
            carsArray[i] = newCar;
        }
        System.out.println("Please enter a letter from alphabet in order to sort the vehicles: ");
        String letterOfAlphabetUserInput = scanner.nextLine();
        letterOfAlphabetUserInput.toLowerCase();
        char letterOfAlphabet = letterOfAlphabetUserInput.charAt(0);

        Car[] carsSorted = Car.sortCarByBrandFirstLetter(carsArray, letterOfAlphabet);
        for (int i = 0; i < carsSorted.length; i++){
            System.out.println("The brand is: "+ carsSorted[i].getBrand() +
                    "\nModel is: "+ carsSorted[i].getModel() + "\nThe engine is: "+carsSorted[i].getEngineType());
        }



    }
}
