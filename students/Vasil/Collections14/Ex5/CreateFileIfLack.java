package Ex5;

import java.io.File;
import java.io.IOException;
import java.io.PrintStream;

public class CreateFileIfLack {

    void createFile() throws IOException {
        File marks = new File("D:\\Students Marks.txt");
        marks.createNewFile();

        PrintStream printStream = new PrintStream(marks);
        printStream.println("Martin 4(Maths)[26.10.2020] 2,5(Chemistry)[10.10.2020] 3,4(Physics)[05.08.2020]" +
                            " 6(Electrical*measurements)[07.08.2020] 6,6,5(Engineering)[03.09.2020]");
        printStream.println("Dimitar 2,3(Maths)[02.09.2020] 6,5(Chemistry)[09.09.2020] 4,2(Physics)[08.10.2020]" +
                            " 4(Electrical*measurements)[07.09.2020] 6(Engineering)[19.09.2020]");
        printStream.println("Ivan 2,6(Maths)[27.10.2020] 3(Chemistry)[21.09.2020] 5,4(Physics)[24.10.2020]" +
                            " 2(Electrical*measurements)[20.10.2020] 2(Engineering)[30.09.2020]");
        printStream.println("Georgi 6(Maths)[27.08.2020] 5(Chemistry)[03.08.2020] 6,3(Physics)[09.10.2020]" +
                            " 6(Electrical*measurements)[05.09.2020] 5(Engineering)[08.08.2020]");
        printStream.println("Veselin 3,5(Maths)[15.10.2020] 3,5(Chemistry)[29.09.2020] 4(Physics)[30.09.2020]" +
                            " 3(Electrical*measurements)[04.10.2020] 4,6(Engineering)[16.10.2020]");

        printStream.close();
    }


}
