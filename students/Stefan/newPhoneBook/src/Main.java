import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

public class Main {


    public static int callCounter;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean whileLoop = true;
        while (whileLoop) {
            System.out.println("Please choose between the following options:\n1. Add user to phonebook;\n" +
                    "2. Show phone number (name input required);\n3. Show all names and numbers, sorted by name;\n" +
                    "4. Delete an entry in the phonebook;\n5. Delete phonebook database file;\n6. Quit;");
            int userInput = scanner.nextInt();
            scanner.nextLine();
            switch (userInput) {
                case 1:
                    PhoneBook phoneBook = new PhoneBook(addName(createPhonebookArray()), addNumber());
                    writeToFile(phoneBook);
                    System.out.println("============================================");
                    break;
                case 2:
                    System.out.print("Please enter the name of the user you are looking for: ");
                    String name = scanner.nextLine().toLowerCase();
                    findNumberUsingName(name);
                    System.out.println("=============================================");
                    break;
                case 3:
                    sortNumbersByName(createPhonebookArray());
                    break;
                case 4:
                    System.out.print("Please enter the name of the user you want to delete: ");
                    String nameToDelete = scanner.nextLine().toLowerCase();
                    deleteEntryInPhoneBook(nameToDelete);
                    break;
                case 5:
                    System.out.println("You decided to delete the phonebook DB file. Are you sure?\n1. YES;\n2. NO;");
                    int deletionUserInput = scanner.nextInt();
                    scanner.nextLine();
                    if (deletionUserInput == 1) {
                        deletePhoneBookFile();
                        System.out.println("Phonebook DB file is deleted!");
                    } else {
                        System.out.println("Your decision is not to delete the file. Have a nice day!");
                    }
                    break;
                case 6:
                    whileLoop = false;
                default:
                    System.err.println("No such an option, please try again.");

            }
        }
        scanner.close();
    }

    public static String addName(PhoneBook[] phoneBooks) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Name: ");
        String name = scanner.nextLine().toLowerCase();
        return name;
    }

    public static String addNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Number (+3598XXXXXXXX): ");
        String number = scanner.nextLine();
        String revisedNumber = PhoneBook.correctNumberFormat(number);
        return revisedNumber;
    }

    public static void writeToFile(PhoneBook phoneBook) {
        try {
            File file = new File("C:\\Users\\Stefa\\PhonebookNew.txt");
            file.createNewFile();
            PrintStream printStream = new PrintStream(new FileOutputStream(file, true));
            printStream.println(phoneBook.toString());
            printStream.close();
        } catch (IOException e) {
            e.getMessage();
        }
    }

    public static void findNumberUsingName(String nameToLookFor) {
        try {
            File file = new File("C:\\Users\\Stefa\\PhonebookNew.txt");
            Scanner scanner = new Scanner(file);
            String[] phoneBookItems;
            while (scanner.hasNextLine()) {
                String lineItem = scanner.nextLine();
                phoneBookItems = lineItem.split("\\*");
                if (phoneBookItems[0].equals(nameToLookFor)) {
                    System.out.println("The number you are looking for is: " + phoneBookItems[1]);
                }
            }
            scanner.close();
        } catch (IOException e) {
            e.getMessage();
        }
    }

    public static PhoneBook[] createPhonebookArray() {
        int arrayCounter = 0;
        PhoneBook[] phoneBooks = new PhoneBook[20];
        try {
            File file = new File("C:\\Users\\Stefa\\PhonebookNew.txt");
            Scanner scanner = new Scanner(file);
            String[] lineItems;
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] lineInput = line.split("\\*");
                String name = lineInput[0];
                String number = lineInput[1];
                PhoneBook phoneBook = new PhoneBook(name, number);
                phoneBooks[arrayCounter] = phoneBook;
                arrayCounter++;
            }
            scanner.close();
        } catch (IOException e) {
            e.getMessage();
        }
        return phoneBooks;
    }

    public static void sortNumbersByName(PhoneBook[] phoneBooks) {
        for (int i = 0; i < phoneBooks.length; i++) {
            System.out.println(phoneBooks[i]);
        }
    }

    public static void deleteEntryInPhoneBook(String userNameToDelete) {
        try {
            File file = new File("C:\\Users\\Stefa\\PhonebookNew.txt");
            File file1 = new File("C:\\Users\\Stefa\\PhonebookNewTemp.txt");
            file1.createNewFile();
            PrintStream printStream = new PrintStream(file1);
            Scanner scanner = new Scanner(file);
            String[] lineItems = new String[20];
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                lineItems = line.split("\\*");
                if (!lineItems[0].equals(userNameToDelete)) {
                    printStream.println(line);
                }
            }
            printStream.close();
            scanner.close();
            file.delete();
            file1.renameTo(file);
            System.out.println("The deletion is executed properly");


        } catch (IOException e) {
            e.getMessage();
        }

    }

    public static void deletePhoneBookFile() {
        File file = new File("C:\\Users\\Stefa\\PhonebookNew.txt");
        file.delete();
        System.out.println("File PhonebookNew is deleted!");
    }
}
