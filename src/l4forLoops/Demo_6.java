package l4forLoops;

/**
 * Print the characters between 'A' and 'z', together
 * with their ASCII values
 */
public class Demo_6 {
    public static void main(String[] args) {
        for (char c = 'A'; c <= 'z'; c++){
            System.out.println(c + ": " + (int)c);
        }
    }
}
