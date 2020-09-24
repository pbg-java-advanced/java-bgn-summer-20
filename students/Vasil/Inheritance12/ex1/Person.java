package ex1;

public class Person {
    public String id;
    public String firstName;
    public String familyname;

    public Person(String id, String firstName, String familyname) {
        this.id = id;
        this.firstName = firstName;
        this.familyname = familyname;
    }

    public String getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getFamilyname() {
        return familyname;
    }

    public String personalDetails(){
        return "First name: " + getFirstName() + "\nFamily name: " + getFamilyname() + "\nID: " + getId();
    }

}
