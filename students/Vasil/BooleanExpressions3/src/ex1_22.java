import java.util.Scanner;

public class ex1_22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] num1 = new int [3];
        int [] num2 = new int [3];
        int num;
        int left = 0;
        int right = 1;
        int count = 0;

        System.out.print("Enter first number --> ");
        num = scanner.nextInt();
        String check = String.valueOf(num);

        if(check.length() == 3){
            for(int i = 1; i < 4; i++){
                num1 [count++] = num % 10;
                num /= 10;
            }
        }else{
            System.out.println("You didn't enter a three-digit number!");
            System.exit(0);
        }
        count = 0;

        System.out.print("Enter second number --> ");
        num = scanner.nextInt();
        check = String.valueOf(num);

        if(check.length() == 3){
            for(int i = 1; i < 4; i++){
               num2 [count++] = num % 10;
               num /= 10;
           }
        }else{
            System.out.println("You didn't enter a three-digit number!");
            System.exit(0);
        }
        if(num1 [0] == num2 [2] && num1 [1] == num2 [1] && num1 [2] == num2 [0]){
                    System.out.println("Your entered numbers are simetrical!");
        }else{
            System.out.println("Your entered numbers are not simetrical!");
        }
    }

}
