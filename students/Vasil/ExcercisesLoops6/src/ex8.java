import java.util.Scanner;

public class ex8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number: ");
        int number = scanner.nextInt();

        System.out.print("Prime numbers from 1 to your entered number are: ");
        for(int start = 1; start <= number; start++){
            if(start % 2 != 0 ) {
                if (number - 1 == start) {
                    System.out.println(start);
                    break;
                } else {
                    System.out.print(start + ", ");
                }
            }
        }
    }
}
