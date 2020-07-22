package l4forLoops;

/**
 * Demonstrates the use of a class constant for easy variation
 * of the size of the figure.
 */
public class Demo_4 {

    public static final int SIZE = 5;

    public static void main(String[] args) {
        printLine();
        for (int i = 1; i <= SIZE; i++) {
            printBodySegment();
        }
        printLine();
    }

    public static void printLine(){
        int numDashes = (SIZE - 1)*2;
        System.out.print("+");
        for( int i = 1; i <= numDashes; i++){
            System.out.print("-");
        }
        System.out.println("+");
    }

    public static void printBodySegment(){
        System.out.print("\\");
        printSpaces();
        System.out.println("/");
        System.out.print("/");
        printSpaces();
        System.out.println("\\");
    }

    private static void printSpaces() {
        int numSpaces = (SIZE - 1)*2;
        for(int i = 1; i <= numSpaces; i++){
            System.out.print(" ");
        }
    }
}
