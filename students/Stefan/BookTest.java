import java.util.Scanner;

public class BookTest {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int count = 0;
        Books[] mainArrayOfBooks = new Books[count];
        int menuItemBasic = 0;
        Books[] arrayOfBooks;
        while (menuItemBasic != 3){
            switch (menuItems()) {
                case 1:
                    System.out.println("You have chosen option #1 - Owner!");
                    if (checkPassword(enterPassword())) {
                        arrayOfBooks = new Books[numberOfBooks()];
                        for (int i = 0; i < arrayOfBooks.length; i++) {
                            arrayOfBooks[i] = addBook();
                            count++;
                            mainArrayOfBooks = arrayOfBooks;
                        }
                        menuItemBasic = 1;
                        break;

                    }

                case 2:
                    System.out.println("You have chosen option #2 - Client: \nPlease enter the name of the book: ");
                    String bookName = scanner.nextLine();
                    for (int i = 0; i < mainArrayOfBooks.length; i++){
                        if (mainArrayOfBooks[i].getBookName().equals(bookName)) {
                            System.out.println("The price of the book is: " + mainArrayOfBooks[i].getPrice());
                        }
                    }
                    menuItemBasic = 2;
                    break;

                case 3:
                    System.out.println("You have chosen option #3 - You have quit!");
                    menuItemBasic = 3;
                    break;

                default:
                    System.out.println("No valid option is selected");
            }
        }


    }

    public static String enterPassword (){
        System.out.print("Please enter password for user Owner: ");
        String password = scanner.nextLine();
        return password;
    }

    public static boolean checkPassword (String password) {
        if (password.equals("LAZAR")){
            System.out.println("Access granted!");
            return true;
        } else {
            System.err.println("You have entered an invalid password!");
            System.out.println("================================");
            return false;

        }
    }
    public static int menuItems () {
        System.out.println("Please select an item: \n1.Owner; \n2.Client; \n3.Quit;");
        int menuItem = Integer.parseInt(scanner.nextLine());
        if (menuItem > 0 && menuItem <=3) {
            return menuItem;
        }else
            return Integer.parseInt("You have entered an invalid number");
    }

    public static int numberOfBooks() {
        System.out.println("Please enter how many books are you going to propose today: ");
        int numberOfBooks = Integer.parseInt(scanner.nextLine());
        return numberOfBooks;
    }

    public static Books addBook () {
        System.out.println("Please enter the book details: ");
        System.out.print("Book name: ");
        String bookName = scanner.nextLine();
        System.out.print("Author: ");
        String author = scanner.nextLine();
        System.out.print("Release date (year): ");
        int yearOfRelease = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Price (EUR): ");
        double bookPrice = scanner.nextDouble();
        scanner.nextLine();
        Books newBook = new Books(bookName, author, yearOfRelease, bookPrice);
        return newBook;

    }
}
