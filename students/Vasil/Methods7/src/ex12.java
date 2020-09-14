import java.util.Scanner;

public class ex12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name;

        for (;;) {
            System.out.print("Please enter a name: ");
            name = scanner.nextLine();
            greetThem(name);
        }
    }

    public static void greetThem(String name){
        System.out.println("Hello, " + name);
    }
}
