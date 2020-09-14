import java.util.Scanner;

public class ex8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Firstly enter number of elements to be reserved: ");
        int numElements = scanner.nextInt();
        int [] arraySaver = new int [numElements];

        // get and save values
        for(int count = 0; count < arraySaver.length; count++){
            System.out.print("Enter value for " + ++count + " element of the array: ");
            arraySaver[--count] = scanner.nextInt();
        }
        System.out.println();

        // create new array
        modifyArray(arraySaver);
    }

    public static void modifyArray(int arraySaver []){
        int modifiedArray [] = new int [arraySaver.length*2];
        int arraySaverElem = 0;

        for(int put = 0; put < modifiedArray.length; put += 2){
            for(int limit = put; limit <= put+1; limit++){
                modifiedArray[limit] = arraySaver[arraySaverElem];
            }
            arraySaverElem++;
        }

        System.out.print("Original array: [ ");
        for(int print = 0; print < arraySaver.length; print++){
            System.out.print(arraySaver[print]);
            if(print != arraySaver.length-1){
                System.out.print(", ");
            }
        }
        System.out.print(" ]");
        System.out.println();

        System.out.print("Modified array: [ ");
        for(int print = 0; print < modifiedArray.length; print++){
            System.out.print(modifiedArray[print]);
            if(print != modifiedArray.length-1){
                System.out.print(", ");
            }
        }
        System.out.print(" ]");
    }

}
