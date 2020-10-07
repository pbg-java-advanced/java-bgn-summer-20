package exPhoneBook;

import java.io.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class PhoneBook {

    public PhoneBook() {
    }


    boolean showAllContacts () throws IOException {
        File contacts = new File("D:\\Phone Book.txt");
        contacts.createNewFile();
        Scanner scanner = new Scanner(contacts);
        int counter = 1;
        boolean empty = true;

        if (scanner.hasNext()) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] contact = line.split("\\*");
                String name = contact[0];
                String number = contact[1];
                System.out.print(counter++ + ".");
                orderOutputInfo(name);
                orderOutputInfo(number);
                System.out.println();
            }

        }else{
            empty = false;
            System.out.println("Your phone book is empty!");
        }
        scanner.close();
        return empty;
    }
    void orderOutputInfo(String string){
        int width = 20;
        System.out.print(String.format("%-" + width + "s", String.format("%" + (string.length() + (width - string.length()) / 2) + "s", string)));
    }


    void saveNewContact() throws IOException {
        File contacts = new File("D:\\Phone Book.txt");
        contacts.createNewFile();
        Scanner scanner = new Scanner(System.in);
        PrintStream printStream = new PrintStream(new FileOutputStream(contacts, true));
        System.out.println("Save new contact");
        System.out.print("Enter name: ");
        String name = scanner.nextLine();
        System.out.print("Enter phone number: ");
        String number = scanner.nextLine();

        while (true) {
            if (!(number.length() == 10)) {
                System.out.println("Entered phone number needs to contain ten digits to be valid!");
                System.out.print("Entered valid number: ");
                number = scanner.nextLine();
            } else {
                printStream.println(name + "*" + number);
                System.out.println();
                System.out.println("Contact saved successfully!");
                break;
            }
        }
        scanner.close();
        printStream.close();
    }

    void findContact() throws IOException {
        File contacts = new File("D:\\Phone Book.txt");
        contacts.createNewFile();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter contact name: ");
        String scanned = scanner.nextLine();
        scanner = new Scanner(contacts);
        boolean found = false;

        while(scanner.hasNext()) {
            String line = scanner.nextLine();
            String[] contact = line.split("\\*");
            String name = contact[0];
            String number = contact[1];
            int width = 20;
            if (scanned.equalsIgnoreCase(name)) {
                found = true;
                System.out.print(String.format("%-" + width + "s", String.format("%" + (name.length() + (width - name.length()) / 2) + "s", name)));
                System.out.println(String.format("%-" + width + "s", String.format("%" + (name.length() + (width - number.length()) / 2) + "s", number)));
            }
        }

        if (found == false) {
            System.out.println("Contact was not found!");
        }
        scanner.close();
    }

    void deleteContact() throws IOException {
        File contacts = new File("D:\\Phone Book.txt");
        contacts.createNewFile();
        boolean isEmpty = showAllContacts();
        if (isEmpty) {
            Scanner scanner = new Scanner(System.in);
            File deleted = new File("D:\\Deleted Contacts.txt");
            PrintStream printStream = new PrintStream(deleted);

            // get the number of contact that should be deleted
            int numberDel;
            while (true) {
                try {
                    System.out.print("Which contact to be deleted? (number): ");
                    numberDel = Integer.parseInt(scanner.nextLine());
                    break;
                } catch (InputMismatchException e) {
                    System.out.println("Invalid input!");
                }
            }
            if (numberDel < 0) {
                Main main = new Main();
                System.out.println("Contact doesn't exist!");
                scanner.close();
                printStream.close();
                main.showMenu();
            }

            scanner.close();
            //
            Scanner scannerFile = new Scanner(contacts);

            int countLine = 1;
            boolean foundCont = false;
            // start finding the contact and skip it
            while (scannerFile.hasNextLine()) {
                String line = scannerFile.nextLine();
                String[] contact = line.split("\\*");
                String name = contact[0];
                String number = contact[1];

                if (countLine++ == numberDel) {
                    foundCont = true;
                    continue;
                }
                printStream.println(name + "*" + number);
            }
            //
            if (foundCont == false) {
                System.out.println("Contact doesn't exist!");
            } else {
                System.out.println("Contact deleted!");
            }

            //copy and save the new information
            printStream = new PrintStream(contacts);
            scannerFile = new Scanner(deleted);

            while (scannerFile.hasNextLine()) {
                String scanned = scannerFile.nextLine();
                if (scanned.equals("")) {
                    break;
                }
                printStream.println(scanned);
            }

            printStream.close();
            scannerFile.close();
            File deletedTest = new File("D:\\Deleted Contacts.txt");
            deletedTest.delete();
        }
    }


}

