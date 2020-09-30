package l9arrays.Homework;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many days with select");
        int n = scanner.nextInt();
        int[] array = new int[n];
        double sum = 0;
        double averageTemp = 0;
        int counter = 0;

        for (int i = 0; i < array.length; i++) {
            System.out.println("Please enter the temp of day" + (i + 1));
            array[i] = scanner.nextInt();
            sum = sum + array[i];
        }
        averageTemp = sum / n;
        System.out.println("The average temp is: " + averageTemp);

        for (int i = 0; i < array.length; i++){
            if (averageTemp > array[i]){
                counter++;
            }
        }
        System.out.println("The days with more than the average temp are: " +counter);

    }
}
