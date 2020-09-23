import java.text.DecimalFormat;
import java.util.Scanner;

public class AdditionalExercises {

    public static Scanner scanner = new Scanner(System.in);

    ////////////////////////// zadacha1
    public static void mainn(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number: ");
        int scanned = scanner.nextInt();
        if (scanned % 2 == 0) {
            System.out.println("Chisloto e chetno");
        } else {
            System.out.println("Chisloto e nechetno");
        }

    }

    /////////////////////////// zadacha2
    public static void mainnn(String[] args) {
        System.out.print("Enter number: ");
        int first = scanner.nextInt();
        System.out.print("Enter one more number: ");
        int second = scanner.nextInt();
        System.out.println("The bigger number is: " + getMax(first, second));
    }

    public static int getMax(int first, int second) {
        if (first < second) {
            return second;
        } else {
            return first;
        }
    }

    ////////////////////////////////// zadacha3
    public static void mainnnn(String[] args) {
        System.out.print("Enter temperature: ");
        double temperature = scanner.nextDouble();
        System.out.print("V kakva merna edinica vavejdate temperaturata? --> ");
        char type = scanner.next().charAt(0);
        double converted = 0;
        while (type != 'C' || type != 'F') {
            if (type == 'F') {
                type = 'C';
                converted = Fahrenheit(temperature);
                break;

            } else if (type == 'C') {
                type = 'F';
                converted = Celsius(temperature);
                break;
            } else {
                System.out.println("Invalid input!");
                System.out.print("V kakva merna edinica vavejdate temperaturata? --> ");
                type = scanner.next().charAt(0);
                continue;
            }
        }
        System.out.println("The converted temperature in " + type + " is " + converted);
    }


    public static double Fahrenheit(double temperature) {
        double converted = (9 * temperature / 5) + 32;
        return converted;
    }

    public static double Celsius(double temperature) {
        double converted = 5 * (temperature - 32) / 9;
        return converted;
    }


    /////////////////////////////////////////////////////////// zadacha4

    private static DecimalFormat df2 = new DecimalFormat("0.00");
    public static int broiUchenici;
    public static int broiKontrolni;

    public static void main(String[] args) {
        vzemiNuzhnataInfo();
    }
    public static void vzemiNuzhnataInfo(){
        System.out.print("Vavedi broq uchenici v klas: ");
        broiUchenici = scanner.nextInt();
        System.out.print("Vavedi broq kontrolni: ");
        broiKontrolni = scanner.nextInt();
        System.out.println();
        vzemiOcenkite(broiUchenici, broiKontrolni);
    }
    public static void vzemiOcenkite(int broiUchenici, int broiKontrolni) {
        int ocenki [][] = new int [broiUchenici][broiKontrolni];
        int temp;
        for (int broqchUchenici = 0; broqchUchenici < broiUchenici; broqchUchenici++) { // broi do broq uchenici
            for (int broqchKontrolni = 0; broqchKontrolni < broiKontrolni; broqchKontrolni++) { // broi do broq kontrolni
                for(;;) {   // varshi se bezkraen cikal dokato ne se vavede validna ocenka
                    System.out.print("Vavedi ocenka ot " + ++broqchKontrolni + " kontrolno za " + ++broqchUchenici + " uchenik: ");
                    temp = scanner.nextInt();
                    broqchKontrolni--;
                    broqchUchenici--;
                    if (2 <= temp && temp <= 6) {
                        ocenki[broqchUchenici][broqchKontrolni] = temp;
                        break;
                    } else {
                        System.out.println("Nevalidna ocenka!");
                    }
                }
            }
            System.out.println();
        }
        printiraiSredniteOcenki(ocenki);
        printiraiSrochniteOcenki(ocenki);
    }

    public static void printiraiSredniteOcenki(int ocenki[][]){
        //presmqta sredno-aritemitchno ocenkite ot vsqko kontrolno
        double srednoOcenkite [] = new double[broiKontrolni];
        for(int ocenka = 0; ocenka < broiKontrolni; ocenka++) {
            for (int uchenik = 0; uchenik < broiUchenici; uchenik++) {
                srednoOcenkite[ocenka] += ocenki[uchenik][ocenka];
            }
            srednoOcenkite[ocenka] /= broiUchenici;
        }
        //printira ocenkite
        for(int print = 0; print < srednoOcenkite.length; print++){
            System.out.println("Sredno za " + ++print + " kontrolno: " + df2.format(srednoOcenkite[--print]) );
        }
        System.out.println();
    }
    public static void printiraiSrochniteOcenki(int ocenki[][]){
        //presmqta srochnite ocenki
        double srochniOcenki [] = new double[broiUchenici];
        for(int uchenik = 0; uchenik < broiUchenici; uchenik++){
            for(int kontrolno = 0; kontrolno < broiKontrolni; kontrolno++){
                srochniOcenki[uchenik] += ocenki[uchenik][kontrolno];
            }
            srochniOcenki[uchenik] /= broiKontrolni;
        }
        //printira ocenkite
        for(int uchenik = 0; uchenik < broiUchenici; uchenik++){
            System.out.println("Srochnata ocenka za " + ++uchenik + " uchenik: " + df2.format(srochniOcenki[--uchenik]) );
        }
        System.out.println();
    }

}
