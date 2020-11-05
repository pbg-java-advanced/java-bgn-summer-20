package PayableProgram;

import java.util.ArrayList;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.Scanner;


public class Test {

    private static ArrayList<Goods> products = new ArrayList<>();
    private static final Scanner scanner = new Scanner(System.in);

    //used for valid format
    private String year = new Date().toInstant().toString().substring(0,4);

          // example               2                 0           [                 2                  5          ][                0            9    ] -        10          -      31
    String validFormat = "" + year.charAt(0) + year.charAt(1) + "[" + year.charAt(2) + "-" + year.charAt(2)+3 + "][ " + year.charAt(3) + " -" + 9 + "]\\-((1[0-2])|([1-9]))\\-(([1-3][0-1])|([1-2][0-9])|[1-9])";

    //save average price of all saved products for comparison
    private static double averagePrice = 0.0;

    public static void main(String[] args) {
        Test test = new Test();

        while (true) {
            try {
                System.out.println("Choose option:");
                System.out.println("1.Add new product");
                System.out.println("2.Sort products");
                System.out.println("3.Remove product");
                System.out.println("4.Close application");
                byte option = Byte.parseByte(scanner.nextLine());

                switch (option) {
                    case 1:
                        test.addNew();
                        break;
                    case 2:
                        test.sort();
                        break;
                    case 3:
                        test.remove();
                        break;
                    case 4:
                        System.exit(0);
                }

                if(!(products.isEmpty()) ){
                    double sum = 0;
                    for(int i = 0; i < products.size(); i++){
                        sum += products.get(i).getPrice();
                    }
                    averagePrice = sum/products.size();
                }

            } catch (InputMismatchException e) {
                System.out.println("Invalid input!");
            }
        }

    }

    void addNew() {
        int product;

        while (true) {
            System.out.println("Type of product:");
            System.out.println("1 Alcohol");
            System.out.println("2 Carbonated drink");
            System.out.println("3.Dairy product");
            try {
                product = Integer.parseInt(scanner.nextLine());
                if (product < 1 || 3 < product) {
                    throw new InputMismatchException();
                }
                break;
            } catch (Exception e) {
                System.out.println("Invalid input!");
            }
        }

        System.out.println("Name:");
        String name = scanner.nextLine();
        System.out.println("Manufacturer:");
        String manufacturer = scanner.nextLine();
        System.out.println("Price:");
        double price;
        while(true) {
            try {
                price = Double.parseDouble(scanner.nextLine());
                break;
            } catch (Exception e) {
                System.out.println("Invalid input!");
            }
        }
        String expirationDate;

        while (true) { //wait for valid date
            System.out.println("Expiration date: example --> (2020-1-25)");
            expirationDate = scanner.nextLine().replaceAll("\\s+","");
            int yearOfDate = Integer.parseInt(expirationDate.substring(0,4));

            if(yearOfDate <= new Date().getYear()+1900){
                System.out.println("Perhaps product date is expired or expires soon! No way to add it!");
                continue;
            }

            if(!(expirationDate.matches(validFormat)) ){
                System.out.println("Invalid date!");
                continue;
            }
            break;
        }

        int amount = new Drinks().amountOf();

        switch (product) {

            case 1:
                double promiles;
                while(true) {
                    System.out.println("Promiles in alcohol:");
                    try {
                        promiles = Double.parseDouble(scanner.nextLine());
                        break;
                    } catch (Exception e) {
                        System.out.println("Invalid input!");
                    }
                }
                Alcohol alcohol = new Alcohol(name, promiles, manufacturer, price, expirationDate, amount);
                products.add(alcohol);
                break;

            case 2:
                boolean isCarbonated;

                while (true) {
                    System.out.println("Is drink carbonated?");
                    String answer = scanner.nextLine().replaceAll("\\s+","");

                    switch (answer.toLowerCase()) {
                        case "yes":
                            isCarbonated = true;
                            break;
                        case "no":
                            isCarbonated = false;
                            break;
                        default:
                            System.out.println("Invalid answer!");
                            continue;
                    }
                    break;
                }
                CarbonatedDrinks carbonatedDrinks = new CarbonatedDrinks(name,manufacturer,price,isCarbonated,expirationDate,amount);
                products.add(carbonatedDrinks);
                break;

            case 3:
                DairyProducts dairyProducts = new DairyProducts(name,manufacturer,price,expirationDate,amount);
                products.add(dairyProducts);
                break;

        }

    }

    void sort(){

        System.out.println("What type of products to be shown?");
        System.out.println("1.Expired");
        System.out.println("2.Carbonated drinks");
        System.out.println("3.Alcohols");
        System.out.println("4.Dairy products");
        System.out.println("5.Expensive");
        System.out.println("6.Cheap");
        int option;

        while(true) {
            try {
                option = Integer.parseInt(scanner.nextLine());
                break;
            }catch(Exception e){
                System.out.println("Invalid input!");
            }
        }
        int countProducts = 0;
        switch(option){
            case 1:
                for (Goods product : products) {
                    if (!(product.getExpirationDate()).matches(validFormat)) {
                        countProducts++;
                        System.out.println(product.toString());
                    }
                }
                break;

            case 2:
                for(Goods product : products){
                    if(product instanceof CarbonatedDrinks){
                        countProducts++;
                        System.out.println(product.toString());
                    }
                }
                break;

            case 3:
                for(Goods product : products){
                    if(product instanceof Alcohol){
                        countProducts++;
                        System.out.println(product.toString());
                    }
                }
                break;

            case 4:
                for(Goods product : products){
                    if(product instanceof DairyProducts){
                        countProducts++;
                        System.out.println(product.toString());
                    }
                }
                break;

            case 5:
                for(Goods product : products){
                    if(product.getPrice() > averagePrice){
                        countProducts++;
                        System.out.println(product.toString());
                    }
                }
                break;

            case 6:
                for(Goods product : products){
                    if(product.getPrice() <= averagePrice){
                        countProducts++;
                        System.out.println(product.toString());
                    }
                }
                break;
            default:
                sort();

        }

        if(countProducts == 0){
            System.out.println("No products found!");
        }

    }

    void remove(){
        while(true) {
            System.out.println("Enter name of product for remove");
            String name = scanner.nextLine();

            if(!(products.isEmpty()) ) {
                products.removeIf(good -> good.getName().equalsIgnoreCase(name));
                System.out.println("Found and removed!");
            }else{
                System.out.println("Nothing found to remove!");
            }

            break;
        }

    }


}
