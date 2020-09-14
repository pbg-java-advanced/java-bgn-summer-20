import java.util.Scanner;

public class ex8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("How much rows with numbers --> ");
        int put = scanner.nextInt();


        for (int newLine = 1; newLine <= put; newLine++) {
            for (int print = 1; print <= newLine; print++) {
                System.out.print(newLine);
            }
            System.out.println();
        }
    }
}
