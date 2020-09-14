import java.util.Scanner;

public class ex11 {

    public static void main(String[] args) {
        int getNumber; // vzema vsqka cifra ot chisloto
        int sum = 0; // darji sumata na vsichki chisla
        int left = 0, right = 1; // granicite na edna cifra v string-a
        String scanned;  // vzema chisloto
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number for summing --> ");
        scanned = scanner.nextLine();

        while(right <= scanned.length()){
            getNumber = Integer.parseInt((scanned.substring(left,right)));
            sum += getNumber;
            left++;  right++;
        }
        System.out.println("The sum of all digits in the entered number is --> " + sum);


    }
}
