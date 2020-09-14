public class ex9 {
    public static void main (String [] args) {

        double bubble = 867.5309;
        double x = 10.01;
        double y = 8;
        int z = 5;
        printer(x, y, bubble);
        System.out.println("z = " + z);

    }

    public static void printer(double x, double y, double bubble) {

        System.out.println("x = " + x + " and y = " + y);
        y = bubble;
        System.out.println("x = " + x + " and y = " + y);
        System.out.println("The value from main is: " + bubble);

    }
}