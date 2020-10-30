package Ex5;

import java.io.File;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.*;

public class Main {

    DecimalFormat df2 = new DecimalFormat("#.##");

    public static void main(String[] args) throws IOException {
        Main main = new Main();

        CreateFileIfLack createFileIfLack = new CreateFileIfLack();
        createFileIfLack.createFile();

        File students = new File("D:\\Students Marks.txt");
        Scanner scannerFile = new Scanner(students);
        HashMap<String, ArrayList<Integer>> studentsInfo = new HashMap<>();

        while(scannerFile.hasNext()){
            String fileLine = scannerFile.nextLine();
            String[] separateWords = fileLine.split(" ");

            ArrayList<Integer> marks = new ArrayList<>();
            for(int i = 1; i < separateWords.length; i++){
                for(int j = 0; j < separateWords[i].length(); j++) {
                    char c = separateWords[i].charAt(j);
                    if(Character.isDigit(c)){
                        marks.add(Character.getNumericValue(c));
                    }else if(c == '('){
                        break;
                    }
                }
            }

            studentsInfo.put(separateWords[0],marks);
        }

        main.calculateAverageSuccess(studentsInfo);
    }


    void calculateAverageSuccess(HashMap<String, ArrayList<Integer> > studentsInfo){

        Iterator it = studentsInfo.entrySet().iterator();

        while(it.hasNext()){
            Map.Entry entry = (Map.Entry) it.next();

            ArrayList<Integer> marks = (ArrayList<Integer>) entry.getValue();
            double success = 0;
            int number = 0;

            for(int i : marks){
                success += i;
                number++;
            }

            System.out.println(entry.getKey() + "'s average success is: " + df2.format(success/number));

        }

    }

}
