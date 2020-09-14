import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("How many elements will contain the array: ");
        int numElements = scanner.nextInt();
        int [] array = new int[numElements];
        int firstElementSwap, secondElementSwap;

        // save values
        for(int i = 0; i < array.length; i++){
            System.out.print("Enter value for element " + ++i + " of the array: ");
            array[--i] = scanner.nextInt();
        }

        // ask for elements to be swapped and check for array bounds
        while(true) {
            System.out.println();
            System.out.println("Which two elements to be swapped? ");
            System.out.print("First --> ");
            firstElementSwap = scanner.nextInt();
            System.out.print("Second --> ");
            secondElementSwap = scanner.nextInt();

            if (0 <= firstElementSwap && firstElementSwap < array.length && 0 <= secondElementSwap && secondElementSwap < array.length) {
                break;
            }else{
                System.out.println("Created array has bounds: '0' for first element and '" + (numElements-1) + "' for the last element!");
                System.out.println("Try again!");
                continue;
            }
        }

        // print original array
        System.out.print("That's your original array : [ ");
        for(int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if(i != array.length-1){
                System.out.print(", ");
            }
        }
        System.out.println(" ]");
        swap(firstElementSwap,secondElementSwap,array);

        // print modified array
        System.out.print("That's your array with swapped elements: [ ");
        for(int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if(i != array.length-1){
                System.out.print(", ");
            }
        }
        System.out.println(" ]");
    }

    public static void swap(int firstElement,int secondElement,int [] array){
        int temp = array[firstElement];
        array[firstElement] = array[secondElement];
        array[secondElement] = temp;
    }

}
