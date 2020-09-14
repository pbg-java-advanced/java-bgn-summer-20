import java.util.Scanner;

public class ex6 {
    public static byte counter = 1;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter count of first sentence: ");
        int count = scanner.nextInt();
        chant(count);
        chant(5);
    }

    public static void chant(int count){
        if(counter == 1) {
            for (int start = 1; start <= count; start++) {
                System.out.println("I am a great coder");
            }
        }else{
            for (int start = 1; start <= count; start++) {
                System.out.println("I am the greatest coder");
            }
        }
        ++counter;
    }
}

