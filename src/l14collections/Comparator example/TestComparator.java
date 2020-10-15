import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TestComparator {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(30);
        numbers.add(5);
        numbers.add(50);

        Collections.sort(numbers);

        //System.out.println(numbers.toString());

        ArrayList<Customer> listOfCustomers  = new ArrayList<>();
        listOfCustomers.add(new Customer("Adam",18));
        listOfCustomers.add(new Customer("Saly", 19));
        listOfCustomers.add(new Customer("Bob", 15));
        listOfCustomers.add(new Customer("Marry", 21));

        Collections.sort(listOfCustomers, new CustomComparator());

        System.out.println(listOfCustomers.toString());

    }
}
