import java.util.Scanner;

public class ex1_21 {
    public static void main(String[] args) {
        int first=0, second=0, third=0;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Vavedi chislo --> ");
        int number = scanner.nextInt();
        String digits = String.valueOf(number);
        int check = 0;

        while (digits.length() == 3) {
            while (number % 10 != 0) {
                ++check;
                switch (check) {
                    case 1:
                        third = number % 10;
                    case 2:
                        second = number % 10;
                    case 3:
                        first = number % 10;
                }
                number /= 10;
            }
            break;
        }
        if(first > second && second > third){
            System.out.println("Chisloto obrazuva strogo namalqvashta redica!");
        }else if(first < second && second < third){
            System.out.println("Chisloto obrazuva strogo narastvashta redica!");
        }else{
            System.out.println("Chisloto obrazuva monotonna redica!");
        }
    }
}
