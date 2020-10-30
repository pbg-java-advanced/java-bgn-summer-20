import java.util.*;

public class Ex3 {

    String numberForHashing = "";

    public static void main(String[] args) {

        Ex3 ex3 = new Ex3();
        LinkedList<Double> listOfNumbers = new LinkedList();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Program for searching unique values");
        System.out.println("Enter 'stop' without whitespaces to start searching!");
        String scanned = "";

        while(true){
            System.out.println("Enter number: ");
            scanned = scanner.nextLine();
            if(scanned.equals("stop"))
                break;
            try {
                listOfNumbers.add(Double.parseDouble(scanned));
            }catch (Exception e){
                System.out.println("Input value is not a number!");
            }
        }

        ex3.countUnique(listOfNumbers);

    }

    void countUnique(LinkedList<Double> listOfNumbers){

        HashMap <Double,Double> removeRepeated = new HashMap<>();

        for(int i = 0; i < listOfNumbers.size(); i++){
            removeRepeated.put(listOfNumbers.get(i),0.0);
        }

        System.out.println("Unique numbers are: ");
        System.out.print("[ ");
        for(Double number : removeRepeated.keySet()){
            System.out.print(number + "   ");
        }
        System.out.println("]" + "length: " + removeRepeated.size());
    }

}
