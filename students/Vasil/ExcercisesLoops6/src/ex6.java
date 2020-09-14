import java.util.Random;
import java.util.Scanner;


public class ex6 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            Random random = new Random();

            System.out.print("Enter number for down-limit: ");
            double down = scanner.nextDouble();
            System.out.print("Enter number for top-limit: ");
            double top = scanner.nextDouble();
            double number;

            number = random.nextDouble()*(top-down)+down;
            System.out.println("System chose number --> " + number);

        }

}



