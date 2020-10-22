package PhoneBookExtended;

import java.io.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Operations {


    void addNewContact() {
        try {
            Scanner scanner = new Scanner(System.in);
            File filePhoneBook = new File("D:\\Phone Book.txt");
            PrintStream printStream = new PrintStream(new FileOutputStream(filePhoneBook, true));

            System.out.println("Saving contact...");
            System.out.print("Enter name: ");
            String name = scanner.nextLine();
            System.out.print("Enter phone number: ");
            String number = scanner.nextLine();

            PhoneBook newContact = new PhoneBook(name, number); //check if entered phone number is valid and save contacts
            if(newContact.isSaved) {
                printStream.println(newContact.toString());
                System.out.println("Contact saved successfully!");
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }

    void deleteContact() throws IOException {
        File contacts = new File("D:\\Phone Book.txt");
        boolean letMethodGo = showAllContacts();

        while (letMethodGo) {
            Scanner scanner = new Scanner(System.in);
            // get the number of contact in order that should be deleted
            int numberDel;
            while (true) { //wait for number
                try {
                    System.out.print("Which contact to be deleted? (number): ");
                    numberDel = Integer.parseInt(scanner.nextLine());
                    break;
                } catch (InputMismatchException | NumberFormatException e) {
                    System.out.println("Invalid input!");
                }
            }
            if (numberDel <= 0) { //check if entered contact number is negative
                System.out.println("Contact doesn't exist!");
                letMethodGo = checkAnswer();
                continue;
            }

            //start deleting
            Scanner scannerFile = new Scanner(contacts);
            File deleted = new File("D:\\Deleted Contacts.txt");
            deleted.createNewFile();

            PrintStream printStreamToNew = new PrintStream(deleted);
            printStreamToNew.print(""); // clear old data
            printStreamToNew = new PrintStream(new FileOutputStream(deleted,true)); //start save new data

            int countLine = 1;
            boolean foundCont = false;
            // start finding the contact and skip it
            while (scannerFile.hasNextLine() && scannerFile.hasNext()) {
                String line = scannerFile.nextLine();
                String[] contact = line.split("\\*");
                String name = contact[0];
                String number = contact[1];
                String operator = contact[2];

                if (countLine++ == numberDel) { //contact is skipped
                    foundCont = true;
                    continue;
                }
                printStreamToNew.println(name + "*" + number + "*" + operator);
            }
            //
            if (foundCont == false) { //if entered contact number is bigger than last saved
                System.out.println("Contact doesn't exist!");
                letMethodGo = checkAnswer();
                continue;
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
                if (scanned.equals("")) { //last empty line in file
                    break;
                }
                printStreamToOld.println(scanned);
            }

            printStreamToOld.close();
            printStreamToNew.close();
            scannerFile.close();
            break;
        }
    }


    boolean showAllContacts() throws FileNotFoundException {
        File filePhoneBook = new File("D:\\Phone Book.txt");
        Scanner scannerFile = new Scanner(filePhoneBook);

        String scannedLine = "";
        byte count = 1;

        System.out.println("Showing all contacts...");
        while(scannerFile.hasNextLine()) {
            scannedLine = scannerFile.nextLine();
            String[] contact = scannedLine.split("\\*");
            System.out.print(count++ + ".");
            orderOutputInfo(contact[0]); //name
            orderOutputInfo(contact[1]); //phone number
            System.out.println("(" + contact[2] + ")"); //operator
        }
        if(scannedLine.isEmpty()){
            System.out.println("No contacts found!");
            return false;
        }

        scannerFile.close();
        return true;
    }


    void findContact() throws FileNotFoundException {
        System.out.println("Searching contact...");
        File filePhoneBook = new File("D:\\Phone Book.txt");
        Scanner scannerFile = new Scanner(filePhoneBook);
        Scanner scanner = new Scanner(System.in);
        boolean found = false;

        System.out.print("Enter contact name: ");
        String name = scanner.nextLine().replaceAll("\\s+","");

        while(scannerFile.hasNextLine()){
            String fileLine = scannerFile.nextLine();
            String[] contact = fileLine.split("\\*");
            if(contact[0].contains(name)){
                orderOutputInfo(contact[0]); //name
                orderOutputInfo(contact[1]); //phone number
                System.out.println("(" + contact[2] + ")"); //operator
                found = true;
            }
        }

        if(!found){
            System.out.println("Contact was not found!");
        }
        scannerFile.close();

    }

    boolean checkAnswer(){
        Scanner scanner = new Scanner(System.in);
        String answer = scanner.nextLine();
        switch (answer.toLowerCase().replaceAll("\\s+","")){
            case "yes":
                return true;
            case "no":
                return false;
            default:
                System.out.println("Invalid answer!");
                System.out.print("Will you try again? --> ");
                checkAnswer();
        }
        return true;
    }


    void orderOutputInfo(String string){
        int width = 30;
        System.out.print(String.format("%-" + width + "s", String.format("%" + (string.length() + (width - string.length()) / 2) + "s", string)));
    }

}
