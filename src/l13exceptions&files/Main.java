import java.io.*;
import java.util.Date;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        File file = null;
        File fileOutput = null;
        try {
            file = new File("C:\\Users\\Botev\\Documents\\input.txt");
            fileOutput = new File("C:\\Users\\Botev\\Documents\\output.txt");
            if(file.createNewFile()){
                System.out.println("Choose different filename!");
            }
            fileOutput.createNewFile();
        }catch (IOException e){
            System.out.println("Error creating file: " + e.getMessage());
        }
		
        printStreamINOUT();
        //streams(file, fileOutput);
    }

    public static boolean printStreamINOUT(){

        PrintStream printStream = null;
        Scanner scanner = null;
        try {
            File file = new File("C:\\Users\\Botev\\Documents\\printStream.txt");
           // file.createNewFile();

            printStream = new PrintStream(new FileOutputStream(file, true));
            printStream.print(new Date());
            printStream.print("-");
            printStream.println("   New text 1");

            scanner = new Scanner(file);
            while (scanner.hasNextLine()){
                String lineText = scanner.nextLine();
                System.out.println(lineText);
            }
        }catch (IOException e){
            System.out.println("Problem with the file: " + e.getMessage());
        }finally {
            printStream.close();
            scanner.close();
        }
        return true;
    }

    public static void streams(File fileInput, File fileOutput){
        FileInputStream in = null;
        FileOutputStream out = null;
        try {
            in = new FileInputStream(fileInput);
            out = new FileOutputStream(fileOutput);
            int c;
            while ((c = in.read()) != -1) {
                out.write(c);
            }
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
        finally {
            if (in != null) {
                try {
                    in.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (out != null) {
                try {
                    out.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

}
