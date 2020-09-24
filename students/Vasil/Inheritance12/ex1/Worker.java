package ex1;

public class Worker extends Person{

    private double dailyWage;
    private int workHours;

    public Worker(String id, String firstName, String familyname, double dailyWage, int workHours) {
        super(id, firstName, familyname);
        this.id = id;
        this.firstName = firstName;
        this.familyname = familyname;
        this.dailyWage = dailyWage;
        this.workHours = workHours;
    }

    public double getHourlyWage(double dailyWage, int workHours){
        double payPerHour = dailyWage / workHours;
        return payPerHour;
    }

    public double getDailyWage() {
        return dailyWage;
    }

    public int getWorkHours() {
        return workHours;
    }

    @Override
    public String personalDetails(){
        return "First name: " + getFirstName() + "\nFamily name: " + getFamilyname() + "\nID: " + getId() + "\nDaily wage: " + getDailyWage()
                + "\nWork hours: " + getWorkHours() + "\nHourly wage: " + getHourlyWage(getDailyWage(),getWorkHours());
    }

}
