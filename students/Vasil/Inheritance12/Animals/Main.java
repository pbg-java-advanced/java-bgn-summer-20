package Animals;

import java.util.Scanner;

public class Main {

    Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Main getTo = new Main();
        Test test = new Test();
        System.out.println("Hi, check the relationship with your animal:\nBut first...");
        while(true) {
            switch (test.askUserAndDo()) {
                case "cat":
                   getTo.createAnimal("cat");
                   System.exit(0);
                case "dog":
                    getTo.createAnimal("dog");
                    System.exit(0);
                default:
                    System.out.println("Unknown animal!");
            }
        }

    }

    public void createAnimal(String typeAnimal){
        System.out.print("Enter name: ");
        String name = scanner.nextLine();
        System.out.print("Enter owner's name: ");
        String owner = scanner.nextLine();
        System.out.print("Enter animal's age: ");
        double age = Byte.parseByte(scanner.nextLine());
        System.out.print("Enter animal's breed: ");
        String breed = scanner.nextLine();
        System.out.print("Enter animal's gender: ");
        String gender = scanner.nextLine();

        switch(typeAnimal){
            case "cat":
                Cat cat = new Cat(name,owner,breed,gender);
                cat.checkAge(age);
                break;
            default:
                Dog dog = new Dog(name,owner,breed,gender);
                dog.checkAge(age);
                break;
        }

    }

}
