package l3conditionals;

/**
 * Demonstrates comparison of strings. Try to understand
 * this program and predict the output. Then run it and
 * check your prediction.
 */
public class Demo_3 {
    public static void main(String[] args) {
        String str = "bira";
        String anotherStr = str;
        String bi = "bi";
        String ra = "ra";
        String thirdStr = bi + ra;
        System.out.println("str = " + str);
        System.out.println("anotherStr = " + anotherStr);
        System.out.println("thirdStr = " + thirdStr);
        System.out.println(str == anotherStr);
        System.out.println(str == thirdStr);
//        System.out.println(str.equals(thirdStr));
    }
}
