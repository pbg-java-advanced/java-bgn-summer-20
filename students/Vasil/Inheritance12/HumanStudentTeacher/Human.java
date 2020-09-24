package HumanStudentTeacher;

public class Human {
    private String firstName;
    private String familyName;


    public Human(String firstName, String familyName) {
        this.firstName = firstName;
        this.familyName = familyName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getFamilyName() {
        return familyName;
    }

    public String personalInfo(){
        return "Name: " + getFirstName() + " " + getFamilyName();
    }

}
