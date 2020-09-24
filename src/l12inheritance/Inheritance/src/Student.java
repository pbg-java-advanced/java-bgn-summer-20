public class Student extends Person {

    public int grade;

    public Student(int id, String firstName, String familyName, int grade) {

        super(id, firstName, familyName);

        this.id = id;
        this.firstName = firstName;
        this.familyName = familyName;
        this.grade = grade;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFamilyName() {
        return familyName;
    }

    public void setFamilyName(String familyName) {
        this.familyName = familyName;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    @Override
    public String personalDetails(){
        return this.id + " " + this.firstName + " " + this.familyName + " " + this.grade;
    }


    public String personalDetails(int age){
        return this.id + " " + this.firstName + " " + this.familyName + " " + this.grade + " " + age;
    }
}
