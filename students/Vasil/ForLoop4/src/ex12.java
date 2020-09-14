public class ex12 {

/////////////////////////////////////////////////////////////////////////// ot 1-9 sledva 0 i nad neq se slaga cherta --> 6 pati
    public static void main(String[] args) {
        int br = 0;
        int brr = 10;
        int krai = 1;

        for (int cifri = 1; cifri <= 10; cifri++) {
            br++;

            if (br == brr) {
                System.out.print("|");
                cifri=0;
                br=0;
                krai++;
                if(krai==7){
                    break;
                }
                continue;
            }
            System.out.print(" ");
        }
            System.out.println();

            br = 0;
            brr = 10;
            krai = 1;

            for (int cifri = 1; cifri <= 10; cifri++) {
                br++;

                if (br == brr) {
                    System.out.print("0");
                    cifri = 0;
                    br = 0;
                    krai++;
                    if (krai == 7) {
                        break;
                    }
                    continue;
                }
                System.out.print(cifri);
            }

        }
}
