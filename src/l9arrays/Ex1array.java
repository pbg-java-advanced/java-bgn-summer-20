package l9arrays;

import java.util.Scanner;

public class Ex1array {

    public static void main(String[] args) {
        System.out.println("Please enter the number of days");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int[] numbers = new int[a];
        double sum = 0;
        int counter = 0;
        double averageTemp = 0;
        for (int i = 0;i < numbers.length;i++){
            System.out.println("Please enter the temperature of day" + (i+1));
             numbers[i] = scanner.nextInt();
            sum = sum + numbers[i];
        }
        averageTemp = sum / numbers.length;
        System.out.println("The average temperature is: " + averageTemp);
        for (int i = 0; i < numbers.length;i++){
            if (numbers[i] > averageTemp){
                System.out.println("Day " + (i + 1) + " more than the average"); ;
                counter++;
            }

        }
        System.out.println("The days with more than average temp are: " +counter);
    }
}