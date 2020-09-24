package Ex2;

public class Main {



    public static void main(String[] args) {

        Student[] students = new Student[5];
        {
            students[0] = new Student("Димитър",18,12,"История",4.5);
            students[1] = new Student("Мария",7,1,"Начално",5);
            students[2] = new Student("Илияна",10,4,"Начално",5);
            students[3] = new Student("Мартин",16,10,"Природни науки",6);
            students[4] = new Student("Иван",13,7,"Математика",4);
        }

        for(int i = 0; i < 5; i++){
            System.out.println("Ученик " + ++i + ":");
            i--;
            System.out.print("Име: " + students[i].getName() + " Вързаст: " + students[i].getAge());
            System.out.print(" Клас: " + students[i].getGrade() + " Изучавана наука: " + students[i].getSpecialy());
            System.out.println(" Оценка(Средно-аритметично): " + students[i].getAverageMark());
        }

    }


}
