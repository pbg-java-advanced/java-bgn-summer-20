package sellers;

public class Seller {

    private String name;
    private String egn;
    private int shiftNumber;
    private String grade;

    public Seller() {
    }

    public Seller(String name, String egn, int shiftNumber, String grade) {
        this.name = name;
        if(egn.length()==10) {
            this.egn = egn;
        }else {
            System.out.println("You have entered and invalid EGN. It needs to consist of 10 digits");
        }
        this.shiftNumber = shiftNumber;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEgn() {
        return egn;
    }

    public void setEgn(String egn) {
        if (egn.length() == 10) {
            this.egn = egn;
        } else {
            System.out.println("You have entered and invalid EGN. It needs to consist of 10 digits");
        }
    }

    public int getShiftNumber(){
        return shiftNumber;
    }

    public void setShiftNumber(int shiftNumber) {
        this.shiftNumber = shiftNumber;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }
}
