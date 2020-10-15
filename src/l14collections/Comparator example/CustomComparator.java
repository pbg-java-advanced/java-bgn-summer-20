import java.util.Comparator;

public class CustomComparator implements Comparator<Customer> {

    @Override
    public int compare(Customer o1, Customer o2) {
        //String firstCustomerName = o1.getName().toUpperCase();
        //String secondCustomerName = o2.getName().toUpperCase();

        int firstCustomerYears = o1.getYears();
        int secondCustomerYears = o2.getYears();

        //asc
        //return firstCustomerName.compareTo(secondCustomerName);
        //return firstCustomerYears - secondCustomerYears;

        //desc
        //return secondCustomerName.compareTo(firstCustomerName);
        return secondCustomerYears - firstCustomerYears;
    }
}
