import java.util.Random;
import java.util.Scanner;

public class Random {
    public static void main(String[] args) {
        Random random = new Random();
        int min = 4;
        int max = 16;

        for(int i=0;i<10;i++){
            int number = random.nextInt(max-min) + min;
            if(number%2==0){
                System.out.println(number);
            }
        }


    }
}
