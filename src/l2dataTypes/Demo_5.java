package l2dataTypes;

/**
 * This demo and the next one illustrate the
 * advantage of using variables.
 */
public class Demo_5 {

    /**
     * Calculate the total amount of purchase, including
     * tax and tip.
     */
    public static void main(String[] args) {
        System.out.print("Amount before tax: ");
        System.out.println(50);
        System.out.print("Tax:\t");
        System.out.println(50 * 0.2);
        System.out.print("Tip:\t");
        System.out.println(50 * 0.15);
        System.out.print("Total:\t");
        System.out.println(50 + 50 * 0.2 + 50 * 0.15);
    }
}
