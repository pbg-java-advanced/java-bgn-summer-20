import java.util.Scanner;

////////////////////////////////////////////////////////kod za izchislqvane na vaveden chas sled 15 minuti

public class ex8 {

    public static Scanner scan = new Scanner(System.in);
    public static int hour,minutes;
    public static int br=0;
    public static int ostavashtiMinuti;
    public static String ans;
    public static String hourr,minutess;

    public static void main(String[] args) {

        System.out.println("Zdravei!");
        ans = "da";

        while (ans == "da") {
            hour = 24;
            minutes = 61;
            while (hour > 23 || hour < 0) {
                System.out.print("Vavedi chas: ");
                hour = scan.nextInt();
                hourr = String.format("%02d", hour);
                if (hour > 23 || hour < 0) {
                    System.out.println("Nevaliden chas!");
                }
            }

            while (minutes >= 60 || minutes < 0) {
                System.out.print("Vavedi minuti: ");
                minutes = scan.nextInt();
                minutess = String.format("%02d", minutes);
                if (minutes >= 60 || minutes < 0) {
                    System.out.println("Nevalidni minuti!");
                }
            }
            minutes += 15;
///////////////////////////////////////////////////////// dotuk s vavejdaneto

            if (minutes == 60) {
                minutes = 0;
                minutess = String.format("%02d", minutes);
                hour++;
                if (hour > 23) {
                    hour = 0;
                }
                hourr = String.format("%02d", hour);
                System.out.println("Chasat sled 15 minuti shte e --> " + hourr + " : " + minutess);
                Otgovor();
                if (ans == "da") {
                    continue;
                } else {
                    System.out.println("Ne razbiram otgovora ti!");
                    while(ans!="da") {
                        Otgovor();
                    }
                }

            }
            if (minutes > 59) {
                minutes = Math.abs(59 - minutes);
                minutes--;
                minutess = String.format("%02d", minutes);
                hour++;
                if (hour > 23) {
                    hour = 0;
                }
                hourr = String.format("%02d", hour);
                System.out.println("Chasat sled 15 minuti shte e --> " + hourr + " : " + minutess);
                Otgovor();
                if (ans == "da") {
                    continue;
                } else {
                    System.out.println("Ne razbiram otgovora ti!");
                    while(ans!="da") {
                        Otgovor();
                    }
                }
                    }

            if (minutes > 0 && minutes <= 59) {
                minutess = String.format("%02d", minutes);
                System.out.println("Chasat sled 15 minuti shte e --> " + hourr + " : " + minutess);
                Otgovor();
                    if (ans == "da") {
                        continue;
                    } else {
                        System.out.println("Ne razbiram otgovora ti!");
                        while(ans!="da") {
                            Otgovor();
                        }
                    }
                }
            }
        }

    public static void Otgovor(){
        System.out.print("Shte prodaljish li da proverqvash chasa? (da ili ne) --> ");
        ans = scan.next();
        switch(ans) {
            case ("da"):
                ans = "da";
                break;
            case("ne"):
                System.exit(0);
            }
        }

    }

