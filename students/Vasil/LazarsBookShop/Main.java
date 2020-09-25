package LazarsBookShop;

import java.util.Scanner;

public class Main {

    public static Scanner scanner = new Scanner(System.in);
    public int freeElementInArray = 5;

    public static void main(String[] args) {
        Main main = new Main();
        Operations operations = new Operations();
        Book book = new Book();
        boolean answer = true;
        int option;

        Book[] books = new Book[200];
        main.initializeBooksArray(books);

        while(true) { //perform till exit the program
            operations.orderBooksArray(books,book);
            main.showMainMenu();
            while (answer) {//
                while(true) {
                    System.out.print("Please choose: ");
                    try {
                        option = Integer.parseInt(scanner.nextLine());
                        break;
                    } catch (Exception e) {
                        System.out.println("Invalid input");
                    }
                }
                switch (option) {
                    case 1: // owner
                       main.forOwner(books,operations,book);
                        break;
                    case 2: //user
                        main.forClient(books,operations);
                        break;
                    case 3: //exit program
                        System.exit(0);
                    default:
                        System.out.println("I didn't understand your answer! :\\");
                }
                answer = false;
            }
            answer = true;
        }
    }

    public void forOwner(Book[] books, Operations operations, Book book){
        while (true) {
            int countTo = 0;
            if (operations.checkOwnerPassword()) { // check owner's password
                operations.printBookCollection(books,book);
                if(!operations.askOwner()){ //check if owner wish to add new books to the collection
                    break;
                }
                while (true) {
                    try {
                        System.out.print("How many books will you add to the collection? --> ");
                        countTo = Integer.parseInt(scanner.nextLine());
                        break;
                    } catch (Exception e) {
                        System.out.println("Invalid input!");
                    }
                }
                if(countTo == 0){
                    break;
                }
                for(int i = 1; i <= countTo; i++) { //loop till number of new book to be added
                    System.out.println("Book " + i);
                    books[freeElementInArray] = operations.addNewBooks();
                    freeElementInArray++;
                    System.out.println();
                }
                System.out.println("New books saved successfully!");
                break;
            } else {
                System.out.println("Incorrect password!");
            }
        }
    }

    public void forClient(Book[] books,Operations operations) {
        boolean wasInIf = false;
        System.out.println("Hi there!");
        while (true) {
            System.out.println("What book are you searching for?");
            String getInput = scanner.nextLine();
            if (!operations.searchClientsBook(books,getInput,wasInIf)) {
                System.out.println("Sorry, but searched book was not found in the collection!");
            }
            System.out.println("Will you search for another book?");
            getInput = scanner.nextLine().replaceAll("\\s", "").toLowerCase();
            if (getInput.equals("no")) {
                break;
            } else if (!getInput.equals("yes")) {
                System.out.println("I didn't understand your answer! :\\");
            }
        }
        System.out.println("We are waiting for you to come back! :D");
    }

    public void showMainMenu(){
        System.out.println();
        System.out.println("What kind of user are you?");
        System.out.println();
        System.out.println("1. Owner;");
        System.out.println("2. Client;");
        System.out.println("3. Quit;");
    }

    public void initializeBooksArray(Book books[]){
        for(int i = 0; i < books.length; i++){
            books[i] = new Book();
        }
        books[0] = new Book("The 100", "Kass Morgan", "2013", "9.99");
        books[1] = new Book("The Maze Runner", "James Dashner", "2010", "2.70");
        books[2] = new Book("The Hunger Games Trilogy", "Suzanne Collins", "2014", "21.27");
        books[3] = new Book("Just us", "Claudia Rankine", "2018", "14.99");
        books[4] = new Book("The Last of Us", "Neil Druckmann", "2013", "59.99");
    }

}
