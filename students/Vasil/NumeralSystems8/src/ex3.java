import java.util.Scanner;

public class ex3 {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Vavedi desetichno chislo: ");
        long chislo = scanner.nextLong();
        System.out.println("Prevarnato v osmichno chislo: " + Long.toOctalString(chislo));
    }
}
