import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int num1, num2, num3;

        System.out.print("Enter first number --> ");
        num1 = scanner.nextInt();
        System.out.print("Enter second number --> ");
        num2 = scanner.nextInt();
        System.out.print("Enter third number --> ");
        num3 = scanner.nextInt();

        if(num1 == num2 && num1 == num3 && num2 == num3){
            System.out.println("yes");
        }else{
            System.out.println("no");
        }

    }
}
