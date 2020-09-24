package Ex1;

public class Student {

    private static String name;
    private static int age;
    private static double marksAverage;

    private static void setName(String name) {
        Student.name = name;
    }
    private static String getName() {
        return name;
    }

    private static void setAge(int age) {
        Student.age = age;
    }
    private static int getAge() {
        return age;
    }

    private static void setMarksAverage(double marksAverage) {
        Student.marksAverage = marksAverage;
    }
    private static double getMarksAverage() {
        return marksAverage;
    }


    public Student(String name, int age, double marksAverage){
        this.name = name;
        this.age = age;
        this.marksAverage = marksAverage;
    }


}
