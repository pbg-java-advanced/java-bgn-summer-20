import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number: ");
        int number_1 = scanner.nextInt();
        System.out.print("Enter one more number: ");
        int number_2 = scanner.nextInt();

        if(number_1 * number_2 < 0) {
            System.out.println(" - ");
        }else{
            System.out.println(" + ");
        }

    }
}
