import java.util.Scanner;

public class ex5 {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Vavedi dvoichno chislo: ");
        long chislo = scanner.nextLong();
        System.out.println("Prevarnato v desetichno chislo: " + Long.parseLong(String.valueOf(chislo),2));
        System.out.println("Prevarnato v dvoivchno chislo: " + Long.toHexString(chislo));
    }

}
