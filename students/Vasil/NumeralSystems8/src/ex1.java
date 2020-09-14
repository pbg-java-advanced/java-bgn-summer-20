import java.util.Scanner;

public class ex1 {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Vavedi dvoichno chislo: ");
        String chislo = scanner.nextLine();
        System.out.println("Prevarnato v desetichno chislo: " + Integer.valueOf(chislo,2));
    }

}
