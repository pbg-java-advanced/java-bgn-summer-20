package Ex6;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Contacts Book");
        Main main = new Main();

        while (true) {
            try {
                System.out.println();
                System.out.println("Main menu");
                System.out.println("1.Add new contact");
                System.out.println("2.Delete contact");
                System.out.println("3.Find contact name by phone number");
                System.out.println("4.Find phone number by contact name");
                System.out.println("5.Show all contacts");
                System.out.println("6.Close application");
                byte option = Byte.parseByte(scanner.nextLine());
                main.optionSelected(option);

            } catch (Exception e) {
                System.out.println("Invalid option!");
            }

        }

    }


    void optionSelected(byte option) throws Exception {
        Operations operations = new Operations();

        switch (option){
            case 1:
                operations.addContact();
                break;
            case 2:
                operations.deleteContact();
                break;
            case 3:
                operations.findNameByNumber();
                break;
            case 4:operations.findNumberByName();
                break;
            case 5:
                operations.showAllContacts();
                break;
            case 6:
                System.out.println("Application is closing...");
                System.exit(0);
            default:
                throw new Exception();
        }

    }


}
