package animals;

import java.util.Scanner;

public class AnimalTest {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
      validateAnimal(chooseAnimal());

    }
    public static int chooseAnimal() {
        System.out.println("Please choose animal: \n1.Dog; \n2.Cat;");
        int selection = scanner.nextInt();
        scanner.nextLine();
        return selection;
    }

    public static int selectDog () {
        System.out.print("Please enter what kind is the animal: ");
        String animalKind = scanner.nextLine();
        System.out.print("Please enter the name of the dog: ");
        String dogName = scanner.nextLine();
        System.out.print("Please enter dog owner's name: ");
        String dogOwnersName = scanner.nextLine();
        System.out.print("Please enter the period while you are looking after the dog (human years): ");
        int humanYears = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Please enter the dog breed: ");
        String dogBreed = scanner.nextLine();
        System.out.print("Please enter the dog sex: ");
        String dogSex = scanner.nextLine();
        Dog dog = new Dog(animalKind, dogName, dogOwnersName,humanYears,dogBreed,dogSex);
        return dog.getHumanYears();
    }

    public static int selectCat () {
        System.out.print("Please enter what kind is the animal: ");
        String animalKind = scanner.nextLine();
        System.out.print("Please enter the name of the cat: ");
        String catName = scanner.nextLine();
        System.out.print("Please enter cat owner's name: ");
        String catOwnersName = scanner.nextLine();
        System.out.print("Please enter the period while you are looking after the cat (human years): ");
        int humanYears = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Please enter the cat breed: ");
        String catBreed = scanner.nextLine();
        System.out.print("Please enter the cat sex: ");
        String catSex = scanner.nextLine();
        Cat cat = new Cat(animalKind, catName, catOwnersName, humanYears,catBreed,catSex);
        return cat.getYears();
    }

    public static void validateAnimal (int selection) {
        switch (selection) {
            case 1:
                System.out.println("You have selected dog");
                Dog.dogLovesOwner(selectDog());
                break;
            case 2:
                System.out.println("you have selected cat");
                Cat.catLovesOwner(selectCat());
                break;
            default:
                System.out.println("There is not such an animal in the menu");
                break;
        }
    }


}
