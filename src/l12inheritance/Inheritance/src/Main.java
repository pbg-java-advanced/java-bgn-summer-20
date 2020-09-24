public class Main {
    public static void main(String[] args) {

        Person person = new Person(1, "John", "Doe");
        Student student = new Student(2, "Georgi", "Petrovv", 6);
        Worker worker = new Worker(3, "Petko", "Petrov", 5, 8);


        System.out.println(worker.personalDetails());

        Student[] students = new Student[10];
        students[0] = student;

        Person[] people = new Person[3];
        people[0] = person;
        people[1] = student;
        people[2] = worker;

        for(int i=0; i<people.length;i++){
            System.out.println(   people[i].personalDetails()     );
        }


    }
}
