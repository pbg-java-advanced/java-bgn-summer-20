package l4forLoops;

/**
 * Print the range for the possible values of the three types: char, int, double
 */
public class Demo_5 {
    public static void main(String[] args) {
        System.out.println("Character range:");
        System.out.println("MIN: " + (int)Character.MIN_VALUE + "\tMAX: " + (int)Character.MAX_VALUE);
        System.out.println("Integer range:");
        System.out.println("MIN: " + Integer.MIN_VALUE + "\tMAX: " + Integer.MAX_VALUE);
        System.out.println("Double range:");
        System.out.println("MIN: " + Double.MIN_VALUE + "\tMAX: " + Double.MAX_VALUE);
    }
}
