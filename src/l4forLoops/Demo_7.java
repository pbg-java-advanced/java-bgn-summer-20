package l4forLoops;

/**
 * Simple example of nested loops.
 */
public class Demo_7 {
    public static final int numRows = 5;
    public static final int numSymbols = 20;

    public static void main(String[] args) {
        for (int i = 1; i <= numRows; i++) {
            for (int j = 1; j <= numSymbols; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
