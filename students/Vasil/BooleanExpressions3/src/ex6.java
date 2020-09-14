import java.util.Scanner;
//////////////////////////////////////////Quadratic equation solver
public class ex6 {
    public static Scanner scan = new Scanner(System.in);
    public static int a;
    public static int b;
    public static int c;
    public static int Deter;
    public static double root1;
    public static double root2;


    public static void main(String[] args) {
        System.out.println("Quadratic equation solver");
        getNumbers();
        Determinant();
        EquatRoots();

    }

    public static void getNumbers(){
        System.out.print("a is = ");
        a = scan.nextInt();
        System.out.print("b is = ");
        b = scan.nextInt();
        System.out.print("c is = ");
        c = scan.nextInt();
        System.out.println("Your equation is " + a + "x^2 + " + b +"x + " + c + " = 0");
    }

    public static void Determinant(){
        Deter = b*b - 4*a*c;
        System.out.println("Determinant is --> " + Deter);
        if(Deter < 0){
            System.out.println("The equation doesn't have real roots!");
            System.exit(0);
        }
    }

    public static void EquatRoots(){
        root1 = -b + Math.sqrt(Deter) / 2 * a;
        System.out.println("The first root is --> " + root1);
        root2 = -b - Math.sqrt(Deter) / 2 * a;
        System.out.println("The second root is --> " + root2);
    }

}
