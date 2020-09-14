import java.util.Random;
import java.util.Scanner;

public class ex11 {
    static Scanner scanner = new Scanner(System.in);
    static Random random = new Random();

    public static void main(String[] args) {
       int[] forPrinting = randomArray(getArguments());

       System.out.print("The random array is: [ ");
       for(int printIndex = 0; printIndex < forPrinting.length; printIndex++) {
           System.out.print(forPrinting[printIndex]);
           if(printIndex != forPrinting.length-1){
               System.out.print(", ");
           }
       }
        System.out.print(" ]");
    }

    public static int[] getArguments(){
        System.out.print("Enter size for your array: ");
        int size = scanner.nextInt();
        System.out.print("Enter min value limit: ");
        int min = scanner.nextInt();
        System.out.print("Enter max value limit: ");
        int max = scanner.nextInt();

        int [] info = new int []{size, min, max};
        return info;

    }

    public static int[] randomArray(int [] info){
        int[] toBeReturned = new int [info[0]];

        //fill array with random numbers (min - max)
        for(int fillIndex = 0; fillIndex < toBeReturned.length; fillIndex++){
            toBeReturned[fillIndex] = random.nextInt(info[2] - info[1]) + info[1];
        }
        return toBeReturned;
    }

}
