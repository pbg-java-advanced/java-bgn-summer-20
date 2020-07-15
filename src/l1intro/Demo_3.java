package l1intro;

/**
 * A program that draws two boxes
 */
public class Demo_3 {
    public static void main(String[] args) {
        drawRectangle();
        System.out.println();
        drawRectangle();
    }

    private static void drawRectangle() {
        drawLine();
        drawMiddle();
        drawLine();
    }

    private static void drawMiddle() {
        System.out.println("|      |");
        System.out.println("|      |");
    }

    private static void drawLine() {
        System.out.println("+------+");
    }
}
