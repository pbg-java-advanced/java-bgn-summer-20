package HumanStudentTeacher;

public class Main {

    public static void main(String[] args) {

        Human human = new Human("Super","Mario");
        Student student = new Student("Vasil", "Manev", 4);
        Teacher teacher = new Teacher("Angel", "Botev",8,70);

        Human[] humans = new Human[3];
        humans[0] = human;
        humans[1] = student;
        humans[2] = teacher;

        System.out.println("From Human class");
        System.out.println(human.personalInfo());
        System.out.println();
        System.out.println("From Student class");
        System.out.println(student.personalInfo());
        System.out.println();
        System.out.println("From Teacher class");
        System.out.println(teacher.personalInfo());

    }
}
