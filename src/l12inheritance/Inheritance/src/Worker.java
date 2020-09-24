public class Worker extends Student{

    private double workHours;

    public Worker(int id, String firstName, String familyName, int grade, double workHours) {
        super(id, firstName, familyName,grade);
        this.id = id;
        this.firstName = firstName;
        this.familyName = familyName;
        this.workHours = workHours;
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


}
