package HumanStudentTeacher;

public class Student extends Human{
    private double grade;

    public Student(String firstName, String familyName ,double grade){
        super(firstName,familyName);
        this.grade = grade;
    }

    public double getGrade() {
        return grade;
    }

    public String personalInfo(){
        return "Name: " + getFirstName() + " " + getFamilyName() + "\nGrade: " + getGrade();
    }

}
