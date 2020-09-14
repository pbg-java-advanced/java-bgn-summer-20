import java.util.Scanner;

public class ex4 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("How many elements will contain your array? --> ");
        int numberElements = scanner.nextInt();
        int[] array = new int[numberElements];

        fillArray(array);
        System.out.print("Enter number for comparison --> ");
        int compareNumber = scanner.nextInt();

        // compareNumber = search(compareNumber, array); //for-loop

        //recursion
        int index = 0;
        int indexToReturn = -1;
        indexToReturn = search(compareNumber,array,index,indexToReturn);
        System.out.println("Your entered number is equal to array element with index " + indexToReturn);

    }

    public static void fillArray(int[] array){
        for(int index = 0; index != array.length; index++) {
            System.out.print("Enter value for element " + index + " --> ");
            array[index] = scanner.nextInt();
        }

    }

    //the way with for-loop
    /*public static int search(int compareNumber, int[] array) {
        int getIndexOfFoundNumber = -1;
        for (int index = 0; index < array.length; index++) {
            if (array[index] == compareNumber) {
                getIndexOfFoundNumber = index;
                break;
            }
        }

        if (getIndexOfFoundNumber == -1) {
            return getIndexOfFoundNumber;
        } else {
            return getIndexOfFoundNumber;
        }

    }*/

    //the way with recursion
    public static int search(int compareNumber, int[] array, int index, int indexToReturn) {
        if (index < array.length) {
            if (Integer.valueOf(array[index]) == compareNumber) {
                indexToReturn = index;
                return indexToReturn;
            } else {
                return search(compareNumber, array, index + 1, indexToReturn);
            }
        }
        return indexToReturn;
    }

}
