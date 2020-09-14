import java.util.Scanner;

public class ex5 {
    /////////////////////////////////////////////////////////////////////////// za izvejdane na min i max chislo
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int getDig[] = new int[10];
        int posr;
        int br = 0;

        while (br<10) {
            System.out.print("Vavedi " + ++br + "-to chislo --> ");
            --br;
            posr = scan.nextInt();
            getDig[br] = posr;
            ++br;
        }


        for(br = 0; br<10; br++){
            for(int next = br+1; next<10; next++){
                if(getDig[br]>getDig[next]){
                    posr = getDig[next];
                    getDig[next] = getDig[br];
                    getDig[br] = posr;
                }
            }
        }

        System.out.println("Nai-malkoto chislo ot vavedenite e --> " + getDig[0]);
        System.out.println("Nai-golqmoto chislo ot vavedenite e --> " + getDig[9]);
    }
}
