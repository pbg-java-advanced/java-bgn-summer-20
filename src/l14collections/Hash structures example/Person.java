import java.util.Objects;

public class Person {
    private String firstName;
    private String familyName;
    private int years;

    public Person(String firstName, String familyName, int years) {
        this.firstName = firstName;
        this.familyName = familyName;
        this.years = years;
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

    public int getYears() {
        return years;
    }

    public void setYears(int years) {
        this.years = years;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        //if (years != person.years) return false;
        if (firstName != null ? !firstName.equals(person.firstName) : person.firstName != null) return false;
        return familyName != null ? familyName.equals(person.familyName) : person.familyName == null;
    }

    @Override
    public int hashCode() {
        int result = firstName != null ? firstName.hashCode() : 0;
        result = 31 * result + (familyName != null ? familyName.hashCode() : 0);
        //result = 31 * result + years;
        return result;
    }
}
