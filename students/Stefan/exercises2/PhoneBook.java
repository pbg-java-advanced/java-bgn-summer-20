package exercises2;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class PhoneBook {
    private String name;
    private long number;

    public PhoneBook(String name, long number) {
        this.name = name;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public long getNumber() {
        return number;
    }

    public static long validateNumber (long number, String name) throws ExceptionNew {
        String numberString = Long.toString(number);
        if (numberString.length() == 12 || numberString.length() == 9) {
            try {
                File file = new File("C:\\Users\\Stefa\\Phonebook.txt");
                file.createNewFile();
                PrintStream printStream = new PrintStream(new FileOutputStream(file, true));
                printStream.println(name + "*" + number );
            } catch (IOException e) {
                System.out.println("Issue writing number " + e.getMessage());
            }
        }else
            throw new ExceptionNew();
        return number;
    }
}
