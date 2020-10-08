import java.io.*;
import java.util.Scanner;

public class Main {

    private static File file = new File("PhoneBook.txt");

    public static void main(String[] args) {
        System.out.println("Welcome!");
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Please choose one of options below:");
            System.out.println("1. Add new phone number");
            System.out.println("2. Get phone number by name");
            System.out.println("3. Print all phone numbers");
            System.out.println("4. Quit");
            int userInput = Integer.parseInt(scanner.nextLine());
            switch (userInput) {
                case 1:
                    addUser();
                    System.out.println("User successfully added!");
                    break;
                case 2:
                    System.out.println("Enter name: ");
                    String name = scanner.nextLine();
                    String phoneNumber = getPhoneNumberByName(name);
                    if(phoneNumber != null){
                        System.out.println("PhoneNumber for name: " + name + " is: " + phoneNumber);
                    }else{
                        System.out.println("No phoneNumber found for that name!");
                    }
                    break;
                case 3:
                    printAllPhoneBook();
                    break;
                case 4:
                    System.out.println("Goodbay!");
                    System.exit(0);
                default:
                    System.out.println("Please enter 1,2,3 or 4!");
            }
        }
    }

    public static void addUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter name: ");
        String name = scanner.nextLine().toLowerCase();
        String number = null;
        boolean isValidNumber = false;
        while (!isValidNumber) {
            System.out.println("Enter phone number in format '0888123456' or '+359888123456'");
            number = scanner.nextLine();
            try {
                PhoneBook.validateNumber(number);
                isValidNumber = true;
            } catch (NumberLenghtException e) {
                System.out.println(e.getMessage());
            }
        }
        PhoneBook phoneBook = new PhoneBook(name, number);
        addPhoneBookInFile(phoneBook);
    }

    public static void addPhoneBookInFile(PhoneBook phoneBook){
        try {
            file.createNewFile();
            PrintStream printStream= new PrintStream(new FileOutputStream(file, true));
            printStream.println(phoneBook);
        } catch (IOException e) {
            System.out.println("Error when write in file: " + e.getMessage());
        }
    }

    public static String getPhoneNumberByName(String name){
        try {
            Scanner fileScanner = new Scanner(file);
            while (fileScanner.hasNextLine()){
                String line = fileScanner.nextLine();
                String[] data = line.split("\\*");
                if(data[0].equals(name.toLowerCase())){
                    return data[1];
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error while read file: " + e.getMessage());
        }
        return null;
    }

    public static void printAllPhoneBook(){
        try {
            Scanner fileScanner = new Scanner(file);
            while (fileScanner.hasNextLine()){
                String line = fileScanner.nextLine();
                String[] data = line.split("\\*");
                System.out.println("Name: " + data[0] + ", number: " + data[1]);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error while read file: " + e.getMessage());
        }
    }
}
