import java.util.Random;
import java.util.Scanner;

public class ex12 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
       shuffle(createArrayAndFill());
    }

    public static void shuffle(int[] shuffledArray){

        Random random = new Random();
        int getRandomIndex;

        for(int countIndex = 0; countIndex < shuffledArray.length; countIndex++){
            getRandomIndex = random.nextInt(shuffledArray.length);
            int temp = shuffledArray[getRandomIndex];
            shuffledArray[getRandomIndex] = shuffledArray[countIndex];
            shuffledArray[countIndex] = temp;
        }

        System.out.print("Shuffled array is: [ ");
        for(int print = 0; print < shuffledArray.length; print++){
            System.out.print(shuffledArray[print]);
            if(print != shuffledArray.length-1){
                System.out.print(", ");
            }
        }
        System.out.println(" ]");

    }

    public static int[] createArrayAndFill(){
        System.out.print("Enter number of elements to be reserved: ");
        int numElements = scanner.nextInt();
        int[] array = new int[numElements];

        for(int get = 0; get < numElements; get++){
            System.out.print("Fill element " + ++get + " of the array: ");
            array[--get] = scanner.nextInt();
        }
        return array;
    }

}
