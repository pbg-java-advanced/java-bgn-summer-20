package Animals;

import java.util.Scanner;

public class Test {

    Scanner scanner = new Scanner(System.in);

    public String askUserAndDo(){
        System.out.print("What kind of animal will you enter? ");
        String animalType = scanner.nextLine();
        System.out.println();
        animalType = animalType.replaceAll(" ","").toLowerCase();

        return animalType;
    }

}
