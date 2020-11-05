package PayableProgram;

import java.util.InputMismatchException;
import java.util.Scanner;

public abstract class Goods implements Payable{
    private Scanner scanner = new Scanner(System.in);

    double price;
    String manufacturer;
    String name;
    String expirationDate;
    int amount;

    public String getManufacturer() {
        return manufacturer;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getExpirationDate() {
        return expirationDate;
    }

    public int getAmount() {
        return amount;
    }

    public int amountOf(){
        while (true) {
            try {
                System.out.println("How many products will you add?");
                int amount = Integer.parseInt(scanner.nextLine());
                if(amount <= 0){
                    System.out.println("Invalid amount!");
                    continue;
                }
                return amount;
            }catch (InputMismatchException e){
                System.out.println("Invalid input!");
            }
        }
    }

}
