package exercises2;

import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

public class PhoneBookTest {
    public static void main(String[] args) throws ExceptionNew {
        Scanner scanner = new Scanner(System.in);
        boolean loop = true;
        while (loop) {
            System.out.println("Please choose between the following options:\n1. Add user to phonebook;\n" +
                    "2. Show phone number (name input required)\n3. Show all names and numbers;\n" +
                    "4. Empty phone book file;\n5. Quit");
            int userChoice = scanner.nextInt();
            scanner.nextLine();
            switch (userChoice) {
                case 1:
                    addUser();
                    System.out.println("============================================");
                    break;
                case 2:
                    System.out.print("Please enter the name of the user you are looking for: ");
                    String name = scanner.nextLine().toLowerCase();
                    showPhoneNumber(name);
                    System.out.println("=============================================");
                    break;
                case 3:
                    printNumbers();
                    break;
                case 4:
                    emptyPhoneBook();
                    break;
                case 5:
                    System.out.println("You are exiting from the menu. Have a nice day!");
                    loop = false;
                    break;
                default:
                    System.err.println("No such an option, please try again.");
            }
        }

    }

    public static void addUser() throws ExceptionNew {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the name of the user: ");
        String name = scanner.nextLine().toLowerCase();
        System.out.print("Please enter number: ");
        String number = scanner.nextLine();
        long numberFromString = Long.parseLong(number.replaceFirst("\\+", "0"));
        PhoneBook phoneBook = new PhoneBook(name, PhoneBook.validateNumber(numberFromString, name));
    }

    public static void showPhoneNumber(String name) {
        try {
            File file = new File("C:\\Users\\Stefa\\Phonebook.txt");
            Scanner scanner = new Scanner(file);
            PhoneBook[] phoneBooks = new PhoneBook[50];
            int counter = 0;
            while (scanner.hasNextLine()) {
                String userLine = scanner.nextLine();
                String[] phoneBookData = userLine.split("\\*");
                String userName = phoneBookData[0];
                String userPhone = phoneBookData[1];
                PhoneBook addUser = new PhoneBook(userName, Integer.parseInt(userPhone));
                phoneBooks[counter] = addUser;
                counter++;
            }
            String userName = null;
            Long userNumber = null;
            for (int i = 0; i < phoneBooks.length; i++) {
                if (phoneBooks[i].getName().equals(name)) {
                    userName = phoneBooks[i].getName();
                    userNumber = phoneBooks[i].getNumber();
                    System.out.println("=============================================");
                    System.out.println("The phone number of " + userName + " is " + phoneBooks[i].getNumber());
                    break;
                }
            }

        } catch (IOException e) {
            System.out.println("File cannot be show due to: " + e.getMessage());
        }

    }

    public static void printNumbers() {
        try {
            File file = new File("C:\\Users\\Stefa\\Phonebook.txt");
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String userLine = scanner.nextLine();
                System.out.println(userLine);
            }
        } catch (IOException e) {
            System.out.println("Cannot read the file because of: " + e.getMessage());
        }

    }

    public static void emptyPhoneBook() {
        try {
            File file = new File("C:\\Users\\Stefa\\Phonebook.txt");
            file.createNewFile();
            PrintStream printStream = new PrintStream(file);
        } catch (IOException e) {
            System.out.println("Cannot empty the phone book due to: " + e.getMessage());
        }

    }


}
