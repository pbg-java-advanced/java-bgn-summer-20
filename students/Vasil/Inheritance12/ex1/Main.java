package ex1;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        Person[] people = new Person[3];
        people[0] = new Person("0087596652","Vasil","Manev");
        people[1] = new Student("0158723360", "Georgi", "Georgiev",5.5);
        people[2] = new Worker("8003025899","Ivan","Pavlov",50,8);

        System.err.println("From Person class");
        Thread.sleep(20);
        System.out.println(people[0].personalDetails());
        System.out.println();
        System.err.println("From Student class");
        Thread.sleep(20);
        System.out.println(people[1].personalDetails());
        System.out.println();
        Thread.sleep(20);
        System.err.println("From Worker class");
        System.out.println(people[2].personalDetails());
        System.out.println();

    }
}

