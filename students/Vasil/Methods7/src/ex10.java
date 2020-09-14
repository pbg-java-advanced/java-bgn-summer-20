import java.util.Scanner;

public class ex10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("What do you want to print? --> ");
        String string = scanner.nextLine();
        System.out.print("How many times to be printed? --> ");
        int counter = scanner.nextInt();
        printStrings(string, counter);
    }

    public static void printStrings(String string, int counter){
        for(int print = 1; print <= counter; print++){
            System.out.print(string);
        }
    }
}
