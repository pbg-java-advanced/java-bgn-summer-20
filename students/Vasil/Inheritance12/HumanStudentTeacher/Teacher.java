package HumanStudentTeacher;

public class Teacher extends Human{
    private int workedHours;
    private double dailyWage;

    public Teacher(String firstName, String familyName, int workedHours, double dailyWage) {
        super(firstName,familyName);
        this.workedHours = workedHours;
        this.dailyWage = dailyWage;
    }

    public double calculateWagePerHour(){
        double wagePerHour = dailyWage / workedHours;
        return wagePerHour;
    }

    public int getWorkedHours() {
        return workedHours;
    }

    public double getDailyWage() {
        return dailyWage;
    }

    public String personalInfo(){
        return "Name: " + getFirstName() + " " + getFamilyName() + "\nWorked hours: " +getWorkedHours()
                + "\nDaily wage: " + getDailyWage() + "\nWage/hour: " + calculateWagePerHour();
    }

}
