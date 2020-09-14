import java.util.Random;
import java.util.Scanner;
///////////////////////////////// programa za tablicata za umnojenie
public class ex10 {

    public static void mainn(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
        int min = 1;
        int max = 10;
        int proiz;
        int num1;
        int num2;
        int broiPravilniOtgovori = 0;
        int br = 1;

        do {
            num1 = rand.nextInt(max - min) + min;
            num2 = rand.nextInt(max - min) + min;
            System.out.print("Kolko e : " + num1 + " . " + num2 + " = ");
            proiz = scan.nextInt();

            if (proiz == num1 * num2) {
                System.out.println("Pravilen otgovor! :)");
                broiPravilniOtgovori++;
                br++;
            } else {
                System.out.println("Greshen otgovor, gubish! :/");
                break;
            }
        } while (br < 6);
        if (broiPravilniOtgovori == 5) {
            System.out.println("Bravo, pechelish! :D");
        }
    }
/////////////////////////////////////////////////////// modifikaciq
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
        int min = 1;
        int max = 10;
        int proiz;
        int num1;
        int num2;
        int broiPravilniOtgovori = 0;
        int br = 1;

        do {
            num1 = rand.nextInt(max - min) + min;
            num2 = rand.nextInt(max - min) + min;
            System.out.print("Kolko e : " + num1 + " . " + num2 + " = ");
            proiz = scan.nextInt();

            if (proiz == num1 * num2) {
                System.out.println("Pravilen otgovor! :)");
                broiPravilniOtgovori++;
            } else {
                System.out.println("Greshen otgovor, gubish! :/");
                System.out.println("Pravilniqt otgovor za vaprosa --> " + num1 + " . " + num2 + " e " + num1 * num2);
                break;
            }
        } while (true);
        System.out.println("Ti imash " + broiPravilniOtgovori + " pravilni otgovori!");
    }
}
