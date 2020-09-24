public class Person {

    public int id;
    public String firstName;
    public String familyName;

    public Person(int id, String firstName, String familyName) {
        this.id = id;
        this.firstName = firstName;
        this.familyName = familyName;
    }

    public String personalDetails(){
        return this.id + " " + this.firstName + " " + this.familyName;
    }
}
