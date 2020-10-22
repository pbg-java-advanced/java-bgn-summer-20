package exPhoneBook;

import java.io.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class PhoneBook {

    public PhoneBook(){}

    int width = 30; //control the number of white spaces for better print view

    void saveNewContact() throws FileNotFoundException {
        File contacts = new File("D:\\Phone Book.txt");
        Scanner scanner = new Scanner(System.in);
        PrintStream printStream = new PrintStream(new FileOutputStream(contacts, true));

        System.out.println("Save new contact (Phone number format: 0###...)");
        System.out.print("Enter name: ");
        String name = scanner.nextLine();

        while (true) {
            System.out.print("Enter phone number: ");
            String number = scanner.nextLine();
            if (!(number.length() == 10)) {
                System.out.println("Entered phone number needs to contain ten digits to be valid!");
                System.out.print("Entered valid number: ");
            } else {
                printStream.println(name + "*" + number);
                System.out.println();
                System.out.println("Contact saved successfully!");
                break;
            }
        }
        printStream.close();
    }


    boolean showAllContacts() throws FileNotFoundException {
        File contacts = new File("D:\\Phone Book.txt");
        Scanner scanner = new Scanner(contacts);
        int counter = 1;

        if (scanner.hasNext()) {
            while (scanner.hasNextLine() && scanner.hasNext()) {
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
            System.out.println("Your phone book is empty!");
            return false;
        }
        scanner.close();
        return true;
    }
    void orderOutputInfo(String string){
        System.out.print(String.format("%-" + width + "s", String.format("%" + (string.length() + (width - string.length()) / 2) + "s", string)));
    }



    void findContact() throws FileNotFoundException {
        File contacts = new File("D:\\Phone Book.txt");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter contact name: ");
        String scannedName = scanner.nextLine();

        Scanner scannerFile = new Scanner(contacts);
        boolean found = false;

        while(scannerFile.hasNext()) {
            String line = scannerFile.nextLine();
            String[] contact = line.split("\\*");
            String name = contact[0];
            String number = contact[1];
            if (name.contains(scannedName)) {
                found = true;
                System.out.print(String.format("%-" + width + "s", String.format("%" + (name.length() + (width - name.length()) / 2) + "s", name)));
                System.out.println(String.format("%-" + width + "s", String.format("%" + (number.length() + (width - number.length()) / 2) + "s", number)));
            }
        }

        if (found == false) {
            System.out.println("Contact was not found!");
        }

    }

    void deleteContact() throws IOException {
        File contacts = new File("D:\\Phone Book.txt");
        boolean isEmpty = showAllContacts();
        if (isEmpty) {
            Scanner scanner = new Scanner(System.in);
            // get the number of contact that should be deleted
            int numberDel;
            while (true) {
                try {
                    System.out.print("Which contact to be deleted? (number): ");
                    numberDel = Integer.parseInt(scanner.nextLine());
                    break;
                } catch (InputMismatchException | NumberFormatException e) {
                    System.out.println("Invalid input!");
                }
            }
            if (numberDel < 0) {
                System.out.println("Contact doesn't exist!");
                Main.main(null);
            }

            //start deleting
            Scanner scannerFile = new Scanner(contacts);
            File deleted = new File("D:\\Deleted Contacts.txt");
            deleted.createNewFile();
            PrintStream printStreamToNew = new PrintStream(deleted);
            printStreamToNew.print("");

            printStreamToNew = new PrintStream(new FileOutputStream(deleted,true));

            int countLine = 1;
            boolean foundCont = false;
            // start finding the contact and skip it
            while (scannerFile.hasNextLine() && scannerFile.hasNext()) {
                String line = scannerFile.nextLine();
                String[] contact = line.split("\\*");
                String name = contact[0];
                String number = contact[1];

                if (countLine++ == numberDel) {
                    foundCont = true;
                    continue;
                }
                printStreamToNew.println(name + "*" + number);
            }
            //
            if (foundCont == false) {
                System.out.println("Contact doesn't exist!");
            } else {
                System.out.println("Contact deleted!");
            }

            //copy and save the new information in the old file
            PrintStream printStreamToOld = new PrintStream(contacts);
            printStreamToOld.print("");
            printStreamToOld = new PrintStream(new FileOutputStream(contacts,true));
            scannerFile = new Scanner(deleted);

            while (scannerFile.hasNextLine()) {
                String scanned = scannerFile.nextLine();
                if (scanned.equals("")) {
                    break;
                }
                printStreamToOld.println(scanned);
            }

            printStreamToOld.close();
            printStreamToNew.close();
            scannerFile.close();
            deleted.delete();
        }
    }


}

