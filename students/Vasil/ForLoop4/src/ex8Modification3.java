import java.util.Scanner;

public class ex8Modification3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("How much rows with numbers --> ");
        int put = scanner.nextInt();
        int limit = 1;

        for (int newLine = 1; newLine <= put; newLine++) {
            for (int print = 1; print <= put; print++) {
                if (print >= limit) {
                    System.out.print(newLine);
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
            limit++;
        }
    }
}
