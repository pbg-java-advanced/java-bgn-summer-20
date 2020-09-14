import java.util.ArrayList;
import java.util.Scanner;

public class ex13 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList cherti = new ArrayList();
        ArrayList cifri = new ArrayList();
        System.out.print("Vavedi broi cifri --> ");
        int BroiCifri = scan.nextInt();
        System.out.print("Vavedi broi cherti --> ");
        int granica = scan.nextInt();

        int vzemi;

        while (granica > 0) {
            for (int i = 1; i <= BroiCifri; i++) {
                if (i == BroiCifri) {
                    i = 0;
                    cifri.add(i);
                    --granica;
                    break;
                } else {
                    cifri.add(i);
                }
            }
        }
        for (int j = 0; j < cifri.size(); j++) {
            if ((int) cifri.get(j) == 0) {
                cherti.add('|');
            } else {
                cherti.add(' ');
            }
        }
        for (int k = 0; k < cifri.size(); k++) {
            System.out.print(cherti.get(k));
        }
        System.out.println();
        for (int l = 0; l < cifri.size(); l++) {
            System.out.print(cifri.get(l));
        }

    }
}
