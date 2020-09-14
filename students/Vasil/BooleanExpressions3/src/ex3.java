import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number: ");
        int number_1 = scanner.nextInt();
        System.out.print("Enter one more number: ");
        int number_2 = scanner.nextInt();
        int get;

        if(number_1 > number_2){
            get = number_1;
            number_1 = number_2;
            number_2 = get;
        }
        System.out.println("First number: " + number_1);
        System.out.println("Second number: " + number_2);
    }
}
