package CompanyInformation;

import java.util.Scanner;

public class CompanyET extends Company {

    public static CompanyET company = new CompanyET();
    private Scanner scanner = new Scanner(System.in);

    private static String nameOfOwner;
    private static double startCapital;
    private static double actualCapital;

    public double CompanyET() {
        Company();
        System.out.print("Enter owner's name: ");
        this.nameOfOwner = scanner.nextLine();
        System.out.print("Enter start capital: ");
        this.startCapital = scanner.nextDouble();
        System.out.print("Enter actual capital: ");
        this.actualCapital = scanner.nextDouble();

        return actualCapital - startCapital;
    }

    }




