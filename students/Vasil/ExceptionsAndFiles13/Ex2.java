import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

public class Ex2 {

    String day;
    double temp;
    Ex2(String day, double temp){
        this.day = day;
        this.temp = temp;
    }

    Ex2(){}

    public static void main(String[] args) {
        Ex2 ex2 = new Ex2();
        File file = null;
        try {
            file = new File("D:\\Temperature.txt");
            file.createNewFile();
            ex2.createFile(file);
            Ex2[] info = new Ex2[7];

            int averTemp = ex2.saveEachDayAndTemp(file,info) / 7;
            ex2.printNecessary(info,averTemp);

        }catch(IOException e){
            System.out.println(e.getMessage());
        }
    }

    public int saveEachDayAndTemp(File file, Ex2[] info) throws FileNotFoundException {
        int sumTemp = 0;
        Scanner scanner = new Scanner(file);
        int index = 0;
        String day = "";
        double temp = 0;

        while (scanner.hasNext()) {
            day = scanner.next();
            temp = Double.parseDouble(scanner.next());
            sumTemp += temp;
            info[index++] = new Ex2(day,temp);
        }
        return sumTemp;
    }

    public void printNecessary(Ex2[] info, int averTemp){
        int index = 0;
        int i = 0;
        while(i < info.length){
            if(info[index].temp > averTemp){
                System.out.println("Temperature at " + info[index].day + " is " + info[index].temp + " degrees Celsius");
            }
            i++;
            index++;
        }
        System.out.println("Average temperature is: " + averTemp + " degrees Celsius");
    }

    public void createFile(File file) throws FileNotFoundException {
        PrintStream printStream = new PrintStream(file);
        printStream.println("Monday 17");
        printStream.println("Tuesday 18");
        printStream.println("Wednesday 19");
        printStream.println("Thursday 20");
        printStream.println("Friday 21");
        printStream.println("Saturday 22");
        printStream.println("Sunday 23");
    }

}
