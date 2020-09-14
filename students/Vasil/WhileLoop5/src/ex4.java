import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int enteredNumber = 0;
        int summed = 0;

        while(enteredNumber != -1){
            summed += enteredNumber;
            System.out.print("Enter number for summing --> ");
            enteredNumber = scanner.nextInt();
        }
        System.out.println("Sum is " + summed);
    }
}
