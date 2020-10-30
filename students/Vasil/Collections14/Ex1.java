import java.util.ArrayList;
import java.util.Scanner;

public class Ex1 {

    public static void main(String[] args) {

        Ex1 ex1 = new Ex1();
        ArrayList<Integer> saveNumbers = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("When you enter a string different from a integer program starts to compare!");
        while(true) {
            try {
                System.out.println("Enter number: ");
                saveNumbers.add(Integer.parseInt(scanner.nextLine()) );
            }catch (Exception e){
                break;
            }
        }

        System.out.println("Result: ");
        boolean result = ex1.hasOdd(saveNumbers);
        System.out.println(result);
    }


    boolean hasOdd(ArrayList<Integer> savedNumbers){

        if(savedNumbers.isEmpty()){
            return false;
        }

        for(Integer number : savedNumbers){
            if(!(number % 2 == 0)){
                return true;
            }
        }
        return false;
    }


}
