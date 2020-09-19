package Seller;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Seller[] seller = new Seller[1];

        for(int i = 0; i < 1; i++){
            System.out.print("Enter the name of seller: ");
            String name = scanner.nextLine();
            System.out.print("Enter seller's EGN number: ");
            String egn = scanner.nextLine();
            System.out.print("Which work shift goes seller today? (1 - day/ 2 - night)");
            byte workShift = scanner.nextByte();
            System.out.print("Enter your personal rating for seller's work done today (0-5): ");
            double rating = scanner.nextDouble();
            seller[i] = new Seller(name,egn,workShift,rating);
        }

    }
}
