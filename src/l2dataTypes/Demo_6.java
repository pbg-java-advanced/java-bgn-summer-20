package l2dataTypes;

/**
 * This demo and the previous one illustrate the
 * advantage of using variables.
 */
public class Demo_6 {

    /**
     * Calculate the total amount of purchase, including
     * tax and tip.
     */
    public static void main(String[] args) {
        int amount = 50;
        System.out.print("Amount before tax: ");
        System.out.println(amount);  // 50.0
        System.out.print("Tax:\t");
        System.out.println(amount * 0.2);
        System.out.print("Tip:\t");
        System.out.println(amount * 0.15);
        System.out.print("Total:\t");
        System.out.println(amount + amount * 0.2 + amount * 0.15);
    }
}
