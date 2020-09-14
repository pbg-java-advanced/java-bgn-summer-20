import java.util.Scanner;

public class ex13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("What do you want to print? --> ");
        String s = scanner.nextLine();
        System.out.print("How many times to be printed? --> ");
        int count = scanner.nextInt();
        repeat(s,count);
    }

    public static void repeat( String s, int count ){
        for(int start = 1; start <= count; start++){
            System.out.print(s);
        }
    }
}
