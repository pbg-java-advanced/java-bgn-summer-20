package ex1;

public class Student extends Person {

    private double grade;

    public Student(String id, String firstName, String familyname, double grade) {
        super(id, firstName, familyname);
        this.id = id;
        this.firstName = firstName;
        this.familyname = familyname;
        this.grade = grade;
    }

    public double getGrade() {
        return grade;
    }

    @Override
    public String personalDetails(){
        return "First name: " + getFirstName() + "\nFamily name: " + getFamilyname() + "\nID: " + getId() + "\nGrade: " + getGrade();
    }

}
