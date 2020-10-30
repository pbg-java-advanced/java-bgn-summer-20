package Ex5;

import java.io.File;
import java.util.Scanner;

public class Main_1 {

    public static void main1(String[] args) throws Exception{
        CreateFileIfLack createFileIfLack = new CreateFileIfLack();
        createFileIfLack.createFile();

        File marks = new File("D:\\Students Marks.txt");
        Scanner scannerFile = new Scanner(marks);
        Scanner scanner = new Scanner(System.in);

        while(scannerFile.hasNext()){
            String fileLine = scannerFile.nextLine();
            String[] studentInfo = fileLine.split("\\s+");

            float success = 0;
            int numMarks = 0;

            for(int i = 1; i < studentInfo.length; i++){

                String substring = "";
                int index = 0;

                char character = studentInfo[i].charAt(index++);
                while(!(character == '(' )){
                    if(!(character == ',')) {
                        substring += character;
                        numMarks++;
                    }
                    character = studentInfo[i].charAt(index++);
                }

                while(substring.length() != 0) {
                    success += Character.getNumericValue(substring.charAt(substring.length() - 1));
                    substring = substring.substring(0, substring.length() - 1);
                }

            }
            success /= numMarks;

            System.out.println(studentInfo[0] + "'s average success: " + success);
        }


    }

}
