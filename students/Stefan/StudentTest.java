package students;

public class StudentTest {

    public static void main(String[] args) {

        Student student = new Student("Ivan", 20, 5.00);
        Student student1 = new Student("Stefan", 20, 2.00);

        System.out.println("The number of students is: " + Student.getCounter());

        System.out.println("Student name is: " + student.getName() + "\n Student age: " + student.getAge() + "\n Student grade: "
                + student.getAvgGrade() + "\n Student number: F" + student.getStudentsNUmber());

    }
}
