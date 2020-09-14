import java.util.Scanner;
/////////////////////////////////////// N! / K!
public class ex3 {

        public static String answear = "Yes";
        public static int getNum1;
        public static int counter_1 = 1;
        public static int getNum2;
        public static int counter_2 = 1;
        public static Scanner scanner = new Scanner(System.in);

        public static void main(String[] args) {

            while( answear.equals("Yes") || answear.equals("yes") ) {
                System.out.print("Enter number for defining --> ");
                getNum1 = scanner.nextInt();
                System.out.print("Enter one more number for defining --> ");
                getNum2 = scanner.nextInt();

                if (getNum1 < 0 || getNum2 < 0) {
                    System.out.println("Factorial of negative numbers doesn't exist! :)");
                    checkAnswear();
                    continue;
                } else if (getNum1 == 0 && getNum2 == 0) {
                    System.out.println(getNum1 + "! / " + getNum2 + "! = " + 1);
                    checkAnswear();
                    continue;
                }

                if(getNum1 > getNum2) {
                    for (int counter1 = 1; counter1 <= getNum1; counter1++) {
                        counter_1 *= counter1;
                    }
                    for (int counter2 = 1; counter2 <= getNum2; counter2++) {
                        counter_2 *= counter2;
                    }
                }else{
                    System.out.println("The first number need to be bigger than the second!");
                    checkAnswear();
                    continue;
                }

                System.out.println(getNum1 + "! / " + getNum2 + "! = " + (counter_1 / counter_2) );
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


