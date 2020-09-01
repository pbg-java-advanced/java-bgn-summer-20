import java.util.Scanner;

public class Ex4 {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("The average of all exams is: " + enterExams());

    }
    public static double calculateGrades () {
        System.out.println("Please enter the number of students in class");
        int numberOfStudents = scanner.nextInt();
        double sum = 0;
        if (numberOfStudents >= 1) {
            for (int i = 1; i <= numberOfStudents; i++) {
                System.out.println("Please enter the grade for the " + i + " student");
                sum += getGrades();
            }
        } else
            System.out.println("You have entered an invalid number of students!");
        return sum / numberOfStudents;
    }
    public static double getGrades () {
        double grade = scanner.nextDouble();
        while (grade < 2 || grade > 6) {
            grade = scanner.nextDouble();
            scanner.nextLine();
            System.out.println("You have entered an invalid value!");
        }return grade;
    }
    public static double enterExams () {
        System.out.println("Please enter number of exams: ");
        int numberOfExams = scanner.nextInt();
        double temp;
        double sum = 0;
        for (int i = 1; i <= numberOfExams; i++) {
            temp = calculateGrades();
            System.out.println("The average grade per exam " + i + " is: " + temp);
            sum+=temp;
        } return sum/numberOfExams;
    }

}
