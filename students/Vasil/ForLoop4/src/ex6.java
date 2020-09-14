///////////////////////////////////// redicata na fibonachi
public class ex6 {

    public static int first = 1;
    public static int second = 1;
    public static int sum = 0;

    public static void main(String[] args) {
        System.out.print(first + " ");
        System.out.print(second + " ");
        after();
    }
    public static void after(){
        for(int count = sum; count < 10; count++) {
            sum = first + second;
            first = second;
            second = sum;
            System.out.print(sum + " ");
        }
    }
}
