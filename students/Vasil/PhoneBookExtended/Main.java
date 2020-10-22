package PhoneBookExtended;

import java.io.File;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Main main = new Main();
        Operations operations = new Operations();
        Scanner scanner = new Scanner(System.in);

        File phoneBook = new File("D:\\Phone Book.txt");
        phoneBook.createNewFile();

        for (; ; ) {
            System.out.println();
            System.out.println("Phone Book");
            System.out.println("----------");
            System.out.println("1.Add new contact");
            System.out.println("2.Delete contact");
            System.out.println("3.Show all contacts");
            System.out.println("4.Find contact");
            System.out.println("5.Quit phone book");
            System.out.println("Choose option: ");

            try {
                byte option = Byte.parseByte(scanner.nextLine());
                switch (option) {
                    case 1:
                        operations.addNewContact();
                        break;
                    case 2:
                        operations.deleteContact();
                        break;
                    case 3:
                        operations.showAllContacts();
                        break;
                    case 4:
                        operations.findContact();
                        break;
                    case 5:
                        System.out.println("Closing app...");
                        System.exit(0);
                    default:
                        System.out.println("Invalid option!");
                }

            } catch (NumberFormatException | InputMismatchException e) {
                System.out.println("Invalid input!");
            }
        }

    }

}
