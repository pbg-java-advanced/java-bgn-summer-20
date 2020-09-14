import java.util.Scanner;

public class ex6 {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Vavedi chislo: ");
        String chislo = scanner.nextLine();
        System.out.print("V kakva broina sistema e chisloto : ");
        byte brSistema = scanner.nextByte();
        System.out.print("V kakva broina sistema da se prevarne : ");
        byte transfbrSistema = scanner.nextByte();
        if(brSistema == 2) {
            ZaDvoichna(chislo, transfbrSistema);
        }else if(brSistema == 8){
            ZaOsmichna(chislo, transfbrSistema);
        }else if(brSistema == 10){
            ZaDesetichna(chislo, transfbrSistema);
        }else if(brSistema == 16){
            ZaHex(chislo, transfbrSistema);
        }
    }

    public static void ZaDvoichna(String chislo, byte transfbrSistema){
            switch (transfbrSistema) {
                case 10:
                    System.out.println("Prevarnato v desetichno chislo: " + Integer.parseInt(String.valueOf(chislo), 2));
                    break;
                case 8:
                    int get__10 = Integer.parseInt(String.valueOf(chislo), 2);
                    String get__8 = Integer.toOctalString(get__10);
                    System.out.println("Prevarnato v osmichno chislo: " + get__8);
                    break;
                case 16:
                    int get_10 = Integer.parseInt(String.valueOf(chislo), 2);
                    String get_8 = Integer.toHexString(get_10);
                    System.out.println("Prevarnato v shestnadesetichno chislo: \"" + get_8 + "\"");
                    break;
            }
        }
    public static void ZaOsmichna(String chislo, byte transfbrSistema){
        switch (transfbrSistema) {
            case 10:
                System.out.println("Prevarnato v desetichno chislo: " + Integer.parseInt(String.valueOf(chislo), 8));
                break;
            case 2:
                int get_10 = Integer.parseInt(String.valueOf(chislo),8);
                String get_2 = Integer.toBinaryString(get_10);
                System.out.println("Prevarnato v dvoichno chislo: " + get_2);
                break;
            case 16:
                System.out.println("Prevarnato v shestnadesetichno chislo " + Integer.toHexString(Integer.parseInt(chislo)));
                break;
        }
    }
    public static void ZaDesetichna(String chislo, byte transfbrSistema){
        switch (transfbrSistema) {
            case 2:
                System.out.println("Prevarnato v dvoichno chislo: " + Integer.toBinaryString(Integer.parseInt(chislo)));
                break;
            case 8:
                System.out.println("Prevarnato v osmichno chislo: " + Integer.toOctalString(Integer.parseInt(chislo)));
                break;
            case 16:
                System.out.println("Prevarnato v shestnadesetichno chislo: \"" + Integer.toHexString(Integer.parseInt(chislo)) + "\"");
                break;
        }
    }
    public static void ZaHex(String chislo, byte transfbrSistema){
        switch (transfbrSistema) {
            case 10:
                System.out.println("Prevarnato v desetichno chislo: " + Integer.parseInt(String.valueOf(chislo), 16));
                break;
            case 8:
                int get__10 = Integer.parseInt(String.valueOf(chislo),16);
                String get_8 = Integer.toOctalString(get__10);
                System.out.println("Prevarnato v osmichno chislo: " + get_8);
                break;
            case 2:
                int get_10 = Integer.parseInt(String.valueOf(chislo),16);
                String get_2 = Integer.toBinaryString(get_10);
                System.out.println("Prevarnato v dvoichno chislo " + get_2);
                break;
        }
    }

}
