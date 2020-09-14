import java.util.Scanner;

public class ex10 {
    public static void main(String[] args) {
        int getnum;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter 1 number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter 2 number: ");
        int num2 = scanner.nextInt();
        System.out.print("Enter 3 number: ");
        int num3 = scanner.nextInt();

        if(num2 < num3){
            getnum = num2;
            num2 = num3;
            num3 = getnum;

        }
        if(num1 < num3){
            getnum = num1;
            num1 = num3;
            num3 = getnum;
        }

        if(num1 < num2){
            getnum = num1;
            num1 = num2;
            num2 = getnum;

        }
        System.out.println("Numbers in descending order --> " + num1 + " " + num2 + " " + num3);
    }
    }

