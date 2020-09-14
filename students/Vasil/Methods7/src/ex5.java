import java.util.Scanner;

public class ex5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter count '*' for first line --> ");
        int firstline = scanner.nextInt();
        System.out.print("Enter count '*' for second line --> ");
        int secondline = scanner.nextInt();
        System.out.print("Enter count '*' for third line --> ");
        int thirdline = scanner.nextInt();

        firstLine(firstline);
        secondLine(secondline);
        thirdLine(thirdline);

    }
    public static void firstLine(int firstline){
        for(int start = 1; start <= firstline; start++){
            System.out.print("*");
        }
        System.out.println();

    }
    public static void secondLine(int secondline){
        for(int start = 1; start <= secondline; start++){
            System.out.print("*");
        }
        System.out.println();

    }
    public static void thirdLine(int thirdline){
        for(int start = 1; start <= thirdline; start++){
            System.out.print("*");
        }
        System.out.println();

    }

}
