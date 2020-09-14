import java.util.Scanner;

public class ex1_18 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number: ");
        int number = scanner.nextInt();
        int numberRemainder;
        String length = String.valueOf(number);
        int numberSevens = 0;

        if(number > 0 && (length.length()) == 3){
        while(number % 10 != 0) {
            numberRemainder = number % 10;

            if (numberRemainder % 7 == 0) {
                numberSevens++;
            }

            number /= 10;
        }
        }else{
            System.out.println("Your didn't enter three-digit positive number!");

        }        if(numberSevens == 0){
            System.out.println("There are no sevens in your entered number!");
        }else{
            System.out.println("There are " + numberSevens + " sevens in your entered number");
        }
    }
}
