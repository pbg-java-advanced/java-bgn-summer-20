import java.util.Arrays;
import java.util.Scanner;

public class ex16 {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
       getAndSaveElements(Intro());
    }

    public static int[][] Intro(){
        int[][] array = new int[3][2];
        System.out.println("Array size (3x2)");
        System.out.println();
        return array;
    }

    public static void getAndSaveElements(int[][] array){
        int element = 1;
        for(int rowIndex = 0; rowIndex < 3; rowIndex++){
            for(int colomnIndex = 0; colomnIndex < 2; colomnIndex++){
                System.out.print("Enter value for " + element++ + " element: ");
                array[rowIndex][colomnIndex] = scanner.nextInt();
            }
        }
        System.out.println();
        firstWay(array);
        secondWay(array);
    }

    public static void firstWay(int [][] array){
        System.out.println("First way: ");
        for(int rowIndex = 0; rowIndex < 3; rowIndex++){
            System.out.print("[ ");
            for(int colomnIndex = 0; colomnIndex < 2; colomnIndex++){
                System.out.print(array[rowIndex][colomnIndex]);
                if(colomnIndex != 1){
                    System.out.print(", ");
                }else{
                    System.out.print(" ]");
                }
            }
            System.out.println();
        }

    }

    public static void secondWay(int [][] array){
        System.out.println("Second way: ");
        System.out.print(Arrays.deepToString(array));
    }

}
