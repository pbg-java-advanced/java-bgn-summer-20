import java.util.Scanner;

public class ex1 {

    /*public static void main(String[] args) {
        public static void printStars(int n) {
            for (int i = 0; i < n; i++) {
                System.out.print("*");
            }
            System.out.println();   // end the line of output
        }
    }*/

    public static void main(String[] args) {
        System.out.print("How many stars to be printed? --> ");
        Scanner scanner = new Scanner(System.in);
        int numberStars = scanner.nextInt();
        printStars(numberStars);
    }
    public static void printStars(int n) {
        if (n == 0) {
            System.out.println();
        }else{
            System.out.print("*");
            printStars(n-1);
        }

    }

}
