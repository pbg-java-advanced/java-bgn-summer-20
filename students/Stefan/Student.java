package students;

public class Student {

    private String name;
    private int age;
    private double avgGrade;
    private int studentsNUmber;
    private static int counter;

    public Student() {
    }

    public Student(String name, int age, double avgGrade) {
        this.name = name;
        if (age < 18) {
            System.out.println("Not a valid age");
        } else {
            this.age = age;
        }
        if (avgGrade <= 2){
            System.out.println("Not a valid grade");
        } else {
            this.avgGrade = avgGrade;
        }
        counter++;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getAvgGrade() {
        return avgGrade;
    }

    public void setAvgGrade(double avgGrade) {
        this.avgGrade = avgGrade;
    }

    public double getStudentsNUmber() {
        return studentsNUmber;
    }

    public void setStudentsNUmber(int studentsNUmber) {
        this.studentsNUmber = studentsNUmber;
    }

    public static int getCounter () {
        return counter;
    }


}
