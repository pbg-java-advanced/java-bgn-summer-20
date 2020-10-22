package exVideoLibrary;


import java.io.*;
import java.util.Scanner;

public class Films {
    int width = 20;

    Films(){}

    void saveFilms() throws FileNotFoundException {
        File fileFilms = new File("D:\\films.txt");
        Scanner scanner = new Scanner(System.in);
        PrintStream printStream = new PrintStream(new FileOutputStream(fileFilms,true));
        System.out.print("Enter name: ");
        String name = scanner.nextLine();

        System.out.print("Enter director: ");
        String director = scanner.nextLine();

        System.out.print("Enter running time: ");
        String time = scanner.nextLine();

        System.out.print("Enter genre: ");
        String genre = scanner.nextLine();
        genre = genre.substring(0,1).toUpperCase() + genre.substring(1).toLowerCase();

        System.out.print("Enter year of release: ");
        String year = scanner.nextLine();

        String price = "";
        while(true) {
            System.out.print("Enter price(BGN): ");
            price = scanner.nextLine();
            if (!(Integer.parseInt(price) < 0 || price.replaceAll("\\s+", "").equals(""))) {
                break;
            }
        }

        String newFilm = name + "~" + director + "~" + time + "~" + genre + "~" + year + "~" + price;
        printStream.println(newFilm);
        printStream.close();
        System.out.println("Film saved successfully!");
        System.out.println();
    }


    void deleteFilm(){
        File fileFilms = new File("D:\\films.txt");
        Scanner scanner = new Scanner(System.in);
        try {
            File tempFile = new File("D:\\tempFile.txt");
            PrintStream printStream = new PrintStream(new FileOutputStream(tempFile,true));
            System.out.print("Which film to be deleted? --> (Title) ");
            String titleForDeletion = scanner.nextLine();

            Scanner scannerFile = new Scanner(fileFilms);
            boolean isDeleted = false; //if film title was found and deleted

           while(scannerFile.hasNextLine()){
               String line = scannerFile.nextLine();
               String[] fileLine = line.split("\\~");
               if((fileLine[0]).equalsIgnoreCase(titleForDeletion)){
                   isDeleted = true;
                   continue;
               }
               printStream.println(line);
           }
           modifyFileFilms(fileFilms,tempFile);
            if (isDeleted == true) {
                System.out.println("Film was deleted from the collection!");
            } else {
                System.out.println("No film found with entered title!");
            }
            System.out.println();
            printStream.close();
            scannerFile.close();
            tempFile.delete();

        }catch (IOException e){
            System.out.println("File was not found!");
        }
    }
    void modifyFileFilms(File fileFilms, File tempFile) throws IOException {
        Scanner scanner = new Scanner(tempFile);
        PrintStream printStream = new PrintStream(fileFilms);
        while(scanner.hasNextLine()){
            String scannedLine = scanner.nextLine();
            printStream.println(scannedLine);
        }
        scanner.close();
        printStream.close();
    }


    void showFilms() throws FileNotFoundException {
        File fileFilms = new File("D:\\films.txt");
        Scanner scanner = new Scanner(fileFilms);
        System.out.println("Available films:");
            centerString(width, "Name");
            centerString(width, "Director");
            centerString(width, "Running Time(min)");
            centerString(width, "Genre");
            centerString(width, "Year of release");
            centerString(width, "Price(leva)");
            System.out.println();

        for(int i = 0; i <= width*6; i++){
            System.out.print("-");
        }
        System.out.println();

        while(scanner.hasNextLine()){
            String line = scanner.nextLine();
            String[] fileLine = line.split("\\~");
            for (int i = 0; i < fileLine.length; i++){
                centerString(width, fileLine[i]);
            }
            System.out.println();
        }
        scanner.close();

    }
    public static void centerString (int width, String s) {
        System.out.print(String.format("%-" + width  + "s", String.format("%" + (s.length() + (width - s.length()) / 2) + "s", s)));
    }


    void sortFilms() throws FileNotFoundException {
        File fileFilms = new File("D:\\films.txt");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter genre: ");
        String wishedGenre = scanner.nextLine();

        Scanner scannerFile = new Scanner(fileFilms);

        while (scannerFile.hasNextLine()) {
            String line = scannerFile.nextLine();
            String[] fileLine = line.split("\\~");
            if(fileLine[3].equalsIgnoreCase(wishedGenre)){
                System.out.print(fileLine[0] + ", ");
            }
        }
        System.out.println("\b\b");

    }

}
