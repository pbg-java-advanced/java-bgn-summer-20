import java.util.Random;

////////////////////////////////////////programa za generirane na sluchaini chisla
public class ex8 {
    ////////////////////////// ot 0 do 7 vkluchitelno
    public static void mai(String[] args) {
        Random random = new Random();
        int number = random.nextInt(8);
        System.out.print("Sluchainoto chislo mejdu 0 i 7 e --> " + number);
    }
    ////////////////////////// ot 5 do 10 vkluchitelno
    public static void mainn(String[] args) {
        Random random = new Random();
        int number = random.nextInt(6) + 5;
        System.out.print("Sluchainoto chislo mejdu 5 i 10 e --> " + number);
    }
    ////////////////////////// ot 4 do 12 vkluchitelno
    public static void main(String[] args) {
        Random random = new Random();
        int number = random.nextInt(5) + (12-4);
        System.out.print("Sluchainoto chislo mejdu 4 i 12 e --> " + number);
    }
}
