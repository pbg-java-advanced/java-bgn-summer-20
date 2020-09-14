import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int number_1 = scanner.nextInt();
        System.out.print("Enter second number: ");
        int number_2 = scanner.nextInt();
        System.out.print("Enter third number: ");
        int number_3 = scanner.nextInt();

        if(number_1 > number_2 && number_1 > number_3) {
            System.out.println("The biggest number is: " + number_1);
        }else if (number_2 > number_1 && number_2 > number_3){
            System.out.println("The biggest number is: " + number_2);
        }else{
            System.out.println("The biggest number is: " + number_3);
        }
    }
}
