package l4forLoops;

/**
 * Illustrates the local scope of variables
 */
public class Demo_3 {

    public static void main(String[] args) {

        int numPrint = 5;
        for (int i = 1; i <= numPrint; i++) {
            System.out.println(i + " of " + numPrint);   // can use both i and numPrint inside the loop
            printInfo();                                 // try to print i and numPrint in a different method
        }
        //System.out.println("Value of i after the loop is " + i); // cannot use i outside the loop
        System.out.println("Printed " + numPrint + " lines.");
    }

    public static void printInfo(){
        //System.out.println(i + " of " + numPrint);  // cannot use i and numPrint outside their method
    }
}
