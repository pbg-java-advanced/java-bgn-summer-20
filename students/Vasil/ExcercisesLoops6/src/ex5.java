import java.util.Random;
import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Enter number for down-limit: ");
        int down = scanner.nextInt();
        System.out.print("Enter number for top-limit: ");
        int top = scanner.nextInt();
        int number;

        number = random.nextInt(top - down) + down + 1;
        System.out.println("System chose number --> " + number);

    }
}
