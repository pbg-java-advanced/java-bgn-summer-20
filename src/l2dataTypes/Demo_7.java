package l2dataTypes;

public class Demo_7 {
    public static void main(String[] args) {

        int x = 3;     // declaration and initialization on the same line

        System.out.println("x = " + x);    // use of the variable x in expression

        x = 4 + 3;    // assign another value of the variable x
        System.out.println("now x = " + x);
        System.out.println(x + 7 * 8);  //63
        x = x - 2;    // decrease the value of x by 2
        System.out.println("decreased x is " + x);
    }
}
