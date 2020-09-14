import java.util.Scanner;

public class ex7_Triangle {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter length for the base --> ");
        int lengthbase = scanner.nextInt();
        Exceptions(lengthbase);
        lengthbase *= 2;
        forTwosides(lengthbase);
        forBase(lengthbase);

    }
    public static void Exceptions(int lengthbase){
        if(lengthbase == 0){
            System.exit(0);
        }else if(lengthbase == 1){
            System.out.println("△");
            System.exit(0);
        }
    }

    public static void forTwosides(int lengthbase) {
        int firstRow = 1;
        int leftside = lengthbase / 2;
        int rightside = lengthbase / 2;

        while (rightside <= lengthbase - 1) {
            for (int start = 1; start <= lengthbase; start++) {
                if (start == leftside && start == rightside) {
                    firstRow = 2;
                    start += leftside;
                } else if (start == leftside + 1){
                    System.out.print("/");
                } else if (start == rightside) {
                    System.out.print("\\");
                } else {
                    System.out.print(" ");
                }
            }
            if (firstRow == 2) {
                leftside--;
                rightside++;
                System.out.println();
            }
        }
    }

    public static void forBase(int lengthbase) {
        System.out.print("/");
        for (int start = 2; start <= lengthbase - 1; start++) {
            System.out.print("_");
        }
        System.out.print("\\");
    }
}




