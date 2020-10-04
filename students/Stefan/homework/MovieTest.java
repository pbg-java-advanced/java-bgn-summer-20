package homework;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Date;
import java.util.Scanner;

public class MovieTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean enterMenu = true;
        while (enterMenu) {
            System.out.println("==================================\nPlease select an item of the menu: " + "\n1. Add movie;\n2. Show available movies;" +
                    "\n3. Quit program;\n4. Delete all movies in the file;");
            int optionChosen = scanner.nextInt();
            scanner.nextLine();
            if (optionChosen < 1 || optionChosen > 4) {
                System.err.println("The value entered is not existing. Please choose from 1 to 4!");
            }
            switch (optionChosen) {
                case 1:
                    addMovie();
                    break;
                case 2:
                    readMovies();
                    break;
                case 3:
                    System.out.println("You decided to leave the program! Thank you for using me!");
                    enterMenu = false;
                case 4:
                    System.out.println("Are you sure you want to delete all the movies in the file?\n1. YES, delete them;\n2. NO, keep them");
                    int decision = scanner.nextInt();
                    scanner.nextLine();
                    if (decision == 1) {
                        emptyFile();
                        System.out.println("You have deleted all the movies in the file");
                    } else if (decision == 2) {
                        System.out.println("Your decision is to keep the movies in the file");
                    } else {
                        System.err.println("The option you have chosen is not available. Please try again!");
                    }
                    break;
            }
        }
    }

    public static void addMovie() {
        try {
            File file = new File("C:\\Users\\Stefa\\Movies.txt");
            Scanner scanner = new Scanner(System.in);
            file.createNewFile();
            PrintStream printStream = new PrintStream(new FileOutputStream(file, true));
            System.out.print("Please enter the name of the movie: ");
            String movieName = scanner.nextLine();
            System.out.print("Please enter the name of the producer: ");
            String movieProducer = scanner.nextLine();
            System.out.print("Please enter the length of the movie: ");
            double movieLength = scanner.nextDouble();
            scanner.nextLine();
            System.out.print("Please enter the genre of the movie: ");
            String movieGenre = scanner.nextLine();
            System.out.print("Please enter the year when the movie is produced: ");
            int movieYear = scanner.nextInt();
            System.out.print("Please enter the price of the movie (in BGN): ");
            double moviePrice = scanner.nextDouble();
            scanner.nextLine();
            Movie movie = new Movie(movieName, movieProducer, movieLength, movieGenre, movieYear, moviePrice);
            printStream.println("=================  " + new Date() + "  =================");
            printStream.println(movie.getMovieName() + " " + movie.getMovieProducer() + " " + movie.getMovieLength() +
                    " " + movie.getMovieGenre() + " " + movie.getMovieYear() + " " + movie.getMoviePrice());

            printStream.close();


        } catch (IOException e) {
            System.out.println("There is an error with the input information" + e.getMessage());
        }


    }

    public static void readMovies() {
        try {
            File file = new File("C:\\Users\\Stefa\\Movies.txt");
            Scanner scanner = new Scanner(file);
            Movie[] movies = new Movie[100];
            while (scanner.hasNextLine()) {
                String movieName = scanner.nextLine();
                System.out.println(movieName);
            }

        } catch (IOException e) {
            System.out.println("The error is " + e.getMessage());
        }
    }

    public static void emptyFile() {
        try {
            File file = new File("C:\\Users\\Stefa\\Movies.txt");
            file.createNewFile();
            PrintStream printStream = new PrintStream(file);
        } catch (IOException e) {
            System.out.println("File cannot be cleared, due to: " + e.getMessage());
        }
    }
}
