import java.util.Scanner;

public class Zadacha_7 {

    // publichni promenlivi (vidimi za vseki metod v klasa)

       public static Scanner get = new Scanner(System.in);
       public static int number; // razmeri     (N)
       public static int getNumberLeft = 1; // vzema parvoto chislo ot saotvetnata kolona
       public static int getNumberRight; // vzema poslednoto chislo ot saotvetnata kolona

    // main metod
    public static void main(String[] args) {
        for(;;) {
            System.out.print("Enter number for N --> ");
            number = get.nextInt();
            if (number <= 0) {
                System.out.println("Enter number bigger than zero! :D");
            }else{
                break;
            }
        }
        getNumberRight = number;
        for(int counterRow = 1; counterRow <= number; counterRow++) {
            printLimits();
            printRow();
            System.out.println();
            getNumberLeft++;
            getNumberRight++;
        }
        for(int top = 1; top <= number; top++) {
            System.out.print("+--");
        }
        System.out.print("+");
        System.out.println();
    }

    // metod printirasht zifrite v matricata i kolona
    public static void printRow(){
        for(int red = getNumberLeft; red <= getNumberRight; red++){
            System.out.print("| " + red);
        }
        System.out.print("|");
    }

    //metod printirasht granicite otgore i otdolu (+--+)
    public static void printLimits(){
        for(int top = 1; top <= number; top++) {
            System.out.print("+--");
        }
        System.out.print("+");
        System.out.println();
    }

}
