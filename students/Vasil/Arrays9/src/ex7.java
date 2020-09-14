import java.util.Scanner;

public class ex7 {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        saveValuesReturnAver();
    }

    public static void saveValuesReturnAver(){
        System.out.print("How many elements to be reserved for the array: ");
        int numberElements = scanner.nextInt();
        int [] saveValues = new int [numberElements];
        double averValue = 0;

        // get and save values
        for(int count = 0; count < saveValues.length; count++){
            System.out.print("Enter value for " + ++count + " element of the array: ");
            saveValues[--count] = scanner.nextInt();
        }
        // calculate average value and print it
        for(int count = 0; count < saveValues.length; count++){
            averValue += saveValues[count];
        }

        averValue /= saveValues.length;
        System.out.println("Average value is: " + averValue);
    }

}
