import jdk.nashorn.internal.runtime.arrays.ArrayIndex;

import java.util.Scanner;

public class ex14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number: ");
        String enteredNumber = scanner.nextLine();
        mostFrequentDigit(enteredNumber);
    }

    public static void mostFrequentDigit(String enteredNumber) {

        //loop initialize all array elements to zero
        int[] resultFromCheck = new int[10];

        //loop get index and the array saves results from number check
        for (int check = 0; check < enteredNumber.length(); check++) {
            switch (enteredNumber.charAt(check)) {
                case '0':
                    ++resultFromCheck[0];
                    break;
                case '1':
                    ++resultFromCheck[1];
                    break;
                case '2':
                    ++resultFromCheck[2];
                    break;
                case '3':
                    ++resultFromCheck[3];
                    break;
                case '4':
                    ++resultFromCheck[4];
                    break;
                case '5':
                    ++resultFromCheck[5];
                    break;
                case '6':
                    ++resultFromCheck[6];
                    break;
                case '7':
                    ++resultFromCheck[7];
                    break;
                case '8':
                    ++resultFromCheck[8];
                    break;
                case '9':
                    ++resultFromCheck[9];
                    break;
            }
        }

        // check for max value i.e. most frequent number
        int getFirstElement = resultFromCheck[0];
        int indexAtMaxValue = 0;
        for (int getNextIndex = 0; getNextIndex < resultFromCheck.length; getNextIndex++) {
            if (resultFromCheck[getNextIndex] > getFirstElement) {
                getFirstElement = resultFromCheck[getNextIndex];
                indexAtMaxValue = getNextIndex;
            }
        }

            System.out.print("Most frequent digit in the number is: " + indexAtMaxValue);


    }
}