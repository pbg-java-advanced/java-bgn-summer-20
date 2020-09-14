import java.util.Scanner;

public class ex4 {

        public static String answear = "Yes";
        public static long getNum;
        public static long SaveFact;
        public static int numZeros = 0;
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
                    checkNumberZeros();
                    System.out.println("Result of " + getNum + "! is " + SaveFact + "and has " + numZeros + " zeros in its end!");
                    checkAnswear();
                    continue;
                }

                for (int counter = 1; counter <= getNum; counter++) {
                    SaveFact *= counter;
                }
                checkNumberZeros();
                System.out.println("Result of " + getNum + "! is " + SaveFact + " and has " + numZeros + " zeros in its end!");
                checkAnswear();
                numZeros = 0;

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

    public static void checkNumberZeros() {
        String factResult = String.valueOf(SaveFact);
        int left = factResult.length() - 1;
        int right = factResult.length();

        while(factResult.substring(left,right).equals("0")) {
            numZeros++;
            left--;
            right--;
        }
    }

    }


