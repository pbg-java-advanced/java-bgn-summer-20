package exVideoLibrary;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

public class Main {

    Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        try {
            Main main = new Main();
            File fileFilms = new File("D:\\films.txt");
            fileFilms.createNewFile();
            main.addFirstFilms(fileFilms);
            while(true) {
                main.startAgain();
            }
        }catch (IOException e){
            System.out.println("File not found!");
        }

    }

    void startAgain(){
        showMenu();
        userChoice();
    }

    void addFirstFilms(File fileFilms) throws FileNotFoundException {
        PrintStream printStream = new PrintStream(fileFilms);
        printStream.println("Анабел~Джон Леонети~95~Ужаси~2014~15");
        printStream.println("Жив дух~Стефани Батут~102~Романтика~2019~12");
        printStream.println("Зубрачките~Оливия Уилд~98~Комедия~2019~11");
        printStream.println("Арктика~Джоу Пена~93~Драма~2018~13");
        printStream.println("Към звездите~Джеймс Грей~118~Фантастика~2019~17");
    }

    void showMenu() {
        System.out.println();
        System.out.println("Main Menu");
        System.out.println("1.Save new film");
        System.out.println("2.Delete film from the collection");
        System.out.println("3.Show all films");
        System.out.println("4.Sort films by genre");
        System.out.println("5.Turn off the device");
    }

    void userChoice(){
        Films film = new Films();
        try {
            System.out.print("Please choose: ");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    film.saveFilms();
                    break;
                case 2:
                    film.deleteFilm();
                    break;
                case 3:
                    film.showFilms();
                    break;
                case 4:
                    film.sortFilms();
                    break;
                case 5:
                    System.out.println("Device is turning off...");
                    System.exit(0);
                default:
                    System.out.println("Invalid option!");
                    System.out.println();
            }
        }catch (Exception e){
            System.out.println("Invalid option!");
            System.out.println();
        }
    }

}
