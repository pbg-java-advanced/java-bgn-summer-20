package l5whileLoops;

import java.util.Scanner;

public class Ex4 {

    public static final int SENTINEL = -1;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        while( n != SENTINEL ){
            sum += n;
            n = Integer.parseInt(scanner.nextLine());
        }
        System.out.println(sum);
    }
}
