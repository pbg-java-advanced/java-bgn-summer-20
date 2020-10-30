
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Date;
import java.util.Scanner;

public class Ex3 {

    public static void main(String[] args) throws IOException {
        Ex3 ex3 = new Ex3();

        File weather = new File("D:\\Weather.txt");
        weather.createNewFile();
        ex3.enterWeatherInfo();

        Scanner scannerFile = new Scanner(weather);
        int result;

        while(scannerFile.hasNextLine()) {
            String fileLine = scannerFile.nextLine();

            if(!(fileLine.equals("")) ){
                String[] twoDays = fileLine.split(" ");
                twoDays[0] = twoDays[0].replaceAll("\\*"," ");
                twoDays[1] = twoDays[1].replaceAll("\\*"," ");

                int firstTemp = Integer.parseInt(twoDays[0].substring(twoDays[0].length()-3,twoDays[0].length()-1));
                int secondTemp = Integer.parseInt(twoDays[1].substring(twoDays[1].length()-3,twoDays[1].length()-1));

                System.out.println("From " + twoDays[0].substring(0,twoDays[0].length()-4) + " to " +
                        twoDays[0].substring(0,twoDays[1].length()-4) + " change " + (firstTemp-secondTemp));
            }
        }

    }

    void enterWeatherInfo() throws FileNotFoundException {
        File weather = new File("D:\\Weather.txt");
        PrintStream printStream = new PrintStream(weather);

        printStream.println("Mon*2/12/2019(19) Tue*3/12/2019(18)");
        printStream.println("Tue*3/12/2019(18) Wed*4/12/2019(20)");
        printStream.println();
        printStream.println("Wed*4/12/2019(20) Thu*5/12/2019(18)");
        printStream.println("Thu*5/12/2019(18) Fri*6/12/2019(17)");
        printStream.println("Fri*6/12/2019(17) Sat*7/12/2019(21)");
        printStream.println();
        printStream.println("Sat*7/12/2019(21) Sun*8/12/2019(19)");

        printStream.close();
    }
}
