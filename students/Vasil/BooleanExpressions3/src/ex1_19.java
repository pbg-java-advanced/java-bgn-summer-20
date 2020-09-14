import java.util.Scanner;

public class ex1_19 {

    public static void main(String[] args) {
        int first=0, second=0, third=0;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number --> ");
        int number = scanner.nextInt();
        String digits = String.valueOf(number);
        int check = 0;

        while (digits.length() == 3) {
            while (number % 10 != 0) {
                ++check;
                switch (check) {
                    case 1:
                        first = number % 10;
                    case 2:
                        second = number % 10;
                    case 3:
                        third = number % 10;
                }
                number /= 10;
            }
            break;
        }
        if (check == 3) {
            if (first != second && first != third && second != third) {
                System.out.println("All number are different!");
            } else {
                System.out.println("There are similar numbers!");
            }
        }else{
            System.out.println("The number is not three-digit!");
        }
    }
}
