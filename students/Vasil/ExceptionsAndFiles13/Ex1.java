import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

public class Ex1 {

    public static void main(String[] args) {
        try {
            File file = new File("D:\\justAFile.txt");
            file.createNewFile();
            PrintStream printStream = new PrintStream(file);
            printStream.println("Information saved!!\nNow you are here!");
            Scanner scanner = new Scanner(file);
            while(scanner.hasNextLine()){
                System.out.println(scanner.nextLine());
            }

        }catch(IOException e){
            System.out.println("File was not created!");
        }

    }

}
