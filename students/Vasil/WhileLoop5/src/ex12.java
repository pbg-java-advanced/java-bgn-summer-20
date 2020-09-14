import java.util.Scanner;

public class ex12 {
    public static void main(String[] args) {
        int getNumber; // vzema vsqka cifra ot chisloto
        int countodds = 0; // broi kolko chisla sa nechetni
        int left = 0, right = 1; // granicite na edna cifra v string-a
        String scanned;  // vzema chisloto
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number for checking --> ");
        scanned = scanner.nextLine();

        while(right <= scanned.length()){
            getNumber = Integer.parseInt((scanned.substring(left,right)));
            if(getNumber % 2 != 0){
                countodds++;
            }
            left++;  right++;
        }
        System.out.println("There are " + countodds + " odd digits in the entered number!");


    }
}
