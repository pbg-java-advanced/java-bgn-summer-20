import java.util.Scanner;

public class ex10Modification1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("How much rows with numbers (diagonally) --> ");
        int put = scanner.nextInt();


        for (int newLine = 1; newLine <= put; newLine++) {
            for (int print = 1; print <= put; print++) {
                if (print == newLine) {
                    System.out.print(newLine);
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();

        }
    }
}
