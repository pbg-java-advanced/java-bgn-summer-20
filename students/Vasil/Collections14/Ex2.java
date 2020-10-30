import java.util.ArrayList;
import java.util.Scanner;

public class Ex2 {

    public static void main(String[] args) {

        ArrayList<String> savedStrings = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        Ex2 ex2 = new Ex2();

        System.out.println("When you enter 'stop' without whitespaces program starts to compare!");

        while (true) {
            System.out.println("Enter string: ");
            String checkString = scanner.nextLine();
            if(checkString.equals("stop")){
                break;
            }
            savedStrings.add(checkString);
        }

        ex2.maxLength(savedStrings);
    }


    void maxLength(ArrayList<String> savedStrings){
        if(savedStrings.isEmpty()){
            System.out.println("0");
            System.exit(0);
        }

        int length = 0;
        String string = "";
        for(String getString: savedStrings){
            if(0 <= getString.length()){
                length = getString.length();
                string = getString;
            }

        }

        System.out.println("Max length string is: \" " + string + " \" length: " + length);

    }


}
