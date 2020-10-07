package exPhoneBook;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException{
        try{
            File contacts = new File("D:\\Phone Book.txt");
            contacts.createNewFile();
            Main main = new Main();

            while(true){
                main.showMenu();
            }

        }catch (FileNotFoundException e){
            System.out.println(e.toString());
        }
    }


    void showMenu() throws IOException{
        Scanner scanner = new Scanner(System.in);
        System.out.println();
        System.out.println("1.Save new contact");
        System.out.println("2.Show all contacts");
        System.out.println("3.Find contact");
        System.out.println("4.Delete contact");
        System.out.println("5.Quit phone book");
        System.out.println("Choose option: ");
        try{
            int option = Integer.parseInt(scanner.nextLine());
            selectOption(option);
        }catch(NumberFormatException e){
            System.out.println("Invalid input!");
        }
    }

    void selectOption(int option) throws IOException {
        PhoneBook phoneBook = new PhoneBook();
        switch (option) {
                case 1:
                    phoneBook.saveNewContact();
                    break;
                case 2:
                    phoneBook.showAllContacts();
                    break;
                case 3:
                    phoneBook.findContact();
                    break;
                case 4:
                    phoneBook.deleteContact();
                    break;
                case 5:
                    System.exit(0);
                default:
                    System.out.println("Invalid option!");
            }

    }

}
