import java.util.Random;

public class ex9 {
    //////////////////////////////////////////////////// hvarlqne na dva zara do diushesh (12)

   public static void main(String[] args) {

        Random rand = new Random();
        int min = 1;
        int max= 7;
        int sum = 0;
        int zar1;
        int zar2;

        while(sum != 12){
            zar1 = rand.nextInt(max - min)+min;
            zar2 = rand.nextInt(max - min)+min;
            sum = zar1 + zar2;
            System.out.println( zar1 + " + " + zar2 + " = " + sum);

    }
        System.out.println("Дюшеш!");
    }

}
