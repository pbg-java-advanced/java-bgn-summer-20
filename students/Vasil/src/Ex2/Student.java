package Ex2;

public class Student {
    private String name;
    private int age;
    private int grade;
    private String specialy;
    private double averageMark;

    public Student(String name, int age, int grade, String specialty, double averageMark){
        this.name = name;
        this.age = age;
        this.grade = grade;
        this.specialy = specialty;
        this.averageMark = averageMark;
    }

    public Student(){

    }


    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getGrade() {
        return grade;
    }

    public String getSpecialy() {
        return specialy;
    }

    public double getAverageMark() {
        return averageMark;
    }

}
