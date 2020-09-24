/*
package Ex1;

import java.util.Random;
import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);
    static Random random = new Random();

    public static void mainn(String[] args) {
        System.out.print("How many students objects will you create? --> ");
        int numberOfStudents = scanner.nextInt();

        String name;
        int age;
        double marksAverage;
        int facultyNumber;

        for(int countUp = 0; countUp < numberOfStudents; countUp++) {
            System.out.println("For student " + ++countUp);
            System.out.print("Enter their name: ");
            name = scanner.next();

            while(true) {
                System.out.print("Enter their age: ");
                age = scanner.nextInt();
                if (0 < age && age < 50) {
                    break;
                }
            }

            while(true) {
                System.out.print("Enter their average mark :");
                marksAverage = scanner.nextDouble();

            }
            new Student(name,age,marksAverage);
            countUp--;
        }
        System.out.println();

        for(int countUp = 0; countUp < numberOfStudents; countUp++){
            System.out.println("For student " + ++countUp + " : faculty number 0112 " + );
            countUp--;
        }

    }



}
*/
