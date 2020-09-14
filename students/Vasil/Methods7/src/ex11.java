public class ex11 {
    public static void main(String[] args) {
        double tempf = 98.6;
        double tempc = 0.0;
        tempc = ftoc(tempf, tempc);
        System.out.println("Body temp in C is: " + tempc);
    }

    // converts Fahrenheit temperatures to Celsius
    public static double ftoc(double tempf, double tempc) {
        tempc = (tempf - 32) * 5 / 9;
        return tempc;
    }
}
