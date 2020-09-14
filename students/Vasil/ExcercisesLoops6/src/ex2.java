import java.util.Scanner;

public class ex2 {
    public static String answear = "Yes";
    public static long getNum;
    public static long SaveFact;
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        while( answear.equals("Yes") || answear.equals("yes") ) {
            System.out.print("Factorial of which number you want to know? --> ");
            getNum = scanner.nextLong();
            SaveFact = 1;

            if (getNum < 0) {
                System.out.println("Factorial of negative numbers doesn't exist! :)");
                checkAnswear();
                continue;
            } else if (getNum == 0) {
                System.out.println(getNum + "! = " + SaveFact);
                checkAnswear();
                continue;
            }

            for (int counter = 1; counter <= getNum; counter++) {
                SaveFact *= counter;
            }
            System.out.println(getNum + "! = " + SaveFact);
            checkAnswear();

        }
    }
    public static void checkAnswear() {
        System.out.print("Do you continue? (Yes/No) --> ");
        answear = scanner.next();
        while (true) {

            if ( answear.equals("No") || answear.equals("no") ) {
                System.exit(0);
            } else if ( answear.equals("Yes") || answear.equals("yes") ){
                break;
            }else{
                System.out.println("I don't understand your answear!");
                System.out.print("Do you continue? (Yes/No) --> ");
                answear = scanner.next();
                continue;

            }
        }
    }

}
