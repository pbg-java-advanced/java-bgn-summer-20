import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class Ex4 {

    public static void main(String[] args) {
        HashMap<String,String> forchecking = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        Ex4 ex4 = new Ex4();
        System.out.println("Program for searching duplicates (person - friend)");

        System.out.println("How many people will you add?");
        byte peopleNumber = Byte.parseByte(scanner.nextLine());

        int counter = 1;
        while(counter <= peopleNumber){

            System.out.println("Enter first person's name:");
            String person = scanner.nextLine();
            System.out.println("Enter their friend's name");
            String friend = scanner.nextLine();

            forchecking.put(person,friend);
            counter++;
        }

        System.out.println(ex4.isUnique(forchecking, peopleNumber));
    }

    boolean isUnique(HashMap<String,String> toBeChecked, int peopleNumber){
        HashSet<String> noDuplicates = new HashSet();

        noDuplicates.addAll(toBeChecked.values());

        return noDuplicates.size() == peopleNumber;

    }


}
