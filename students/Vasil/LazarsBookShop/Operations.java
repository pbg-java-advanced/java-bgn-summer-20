package LazarsBookShop;

import java.util.Scanner;

public class Operations {

    Scanner scanner = new Scanner(System.in);

    public boolean checkOwnerPassword(){
        String lastSavedPassword = "lazar123";
        System.out.print("Enter your password --> ");
        String inputPassword = scanner.nextLine();

        if(inputPassword.equals(lastSavedPassword)){
            return true;
        }else{
            return false;
        }
    }

    public boolean askOwner(){

        while(true) {
            System.out.print("Will you add new books to the collection? --> ");
            String getAnswer = scanner.nextLine().replaceAll("\\s", "").toLowerCase();
            if(getAnswer.equals("yes")){
                return true;
            }else if(getAnswer.equals("no")){
                return false;
            }else {
                System.out.println("I didn't understand your answer! :\\");
            }

        }
    }

    public Book addNewBooks(){
        System.out.print("Enter title: ");
        String title = scanner.nextLine();
        System.out.print("Enter autor: ");
        String autor = scanner.nextLine();
        System.out.print("Enter release date: ");
        String date = scanner.nextLine();
        System.out.print("Enter price: ");
        String price = scanner.nextLine();

        Book newBook = new Book(title,autor,date,price);
        return newBook;
    }

    public void printBookCollection(Book[] books, Book book) {
        while (true){
            System.out.print("Do you want to see the book collection? --> ");
            String answerToPrint = Main.scanner.nextLine().replaceAll("\\s", "").toLowerCase();
            if (answerToPrint.equals("yes")) {
                for (int i = 0; books[i].getTitle() != null; i++) {
                    System.out.print("Book " + ++i + " : ");
                    i--;
                    book.bookInfo(books, i);
                }
                break;
            } else if(answerToPrint.equals("no")) {
                break;
            }else{
                System.out.println("I didn't understand your answer!");
            }
        }
    }

    public boolean searchClientsBook(Book[] books, String getInput, boolean wasInIf){
        for (int i = 0; books[i].getTitle() != null; i++) { //perform till "the end of books array"
            if (getInput.equals(books[i].getTitle())) { //try to catch searched title
                wasInIf = true;
                System.out.println("Your searched book was found in the collection. (Price: " + books[i].getPrice() + "BGN) Do you want to buy it?");
                while (true) { //infinite loop till valid answer
                    System.out.print("Answer: ");
                    getInput = scanner.nextLine().replaceAll("\\s", "").toLowerCase();
                    if (getInput.equals("yes")) {
                        System.out.println("The book is on its way to you! Please wait!");
                        books[i].setTitle(null);
                        break;
                    } else if (getInput.equals("no")) {
                        break;
                    } else {
                        System.out.println("I didn't understand your answer! :\\");
                    }
                }
                break;
            }
        }
        return wasInIf;
    }

    public void orderBooksArray(Book[] books, Book book){
        //order books array
        Main main = new Main();
        for(int j = 0; j < books.length; j++) {
            for (int i = 0; i < books.length && i != books.length - 1; i++) {
                if (books[i].getTitle() == null) {
                    book.setTitle(books[i].getTitle());
                    book.setAutor(books[i].getAutor());
                    book.setYear(books[i].getYear());
                    book.setPrice(books[i].getPrice());
                    books[i] = books[i + 1];
                    books[i + 1] = book;
                }
            }
        }
        // get last free element of books array
        for(int i = 0; i < books.length; i++){
            if(books[i] == null){
                main.freeElementInArray = i;
                break;
            }
        }

    }

}
