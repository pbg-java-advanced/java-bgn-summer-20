import java.util.Scanner;

public class ex4{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of elements of array: ");
        int numElements = scanner.nextInt();
        int[] array = new int[numElements];

        for (int index = 0; index < numElements; index++){
            System.out.print("Enter value for " + ++index + " element: ");
            index--;
            array[index] = scanner.nextInt();
        }
        reverse(array);

    }

    public static void reverse(int[] array){
        int tempVar = 0;
        for(int index = 0; index < array.length/2 ; index++){
            tempVar = array[index];
            array[index] = array[(array.length-index)-1];
            array[(array.length-index)-1] = tempVar;
        }

        //print reversed array
        for(int print = 0; print < array.length; print++){
            System.out.print(array[print]);
            if(print != array.length-1){
                System.out.print(", ");
            }
        }
    }

}