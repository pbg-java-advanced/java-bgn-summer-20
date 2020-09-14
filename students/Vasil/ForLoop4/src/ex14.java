import java.util.Scanner;

public class ex14 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number: ");
        int countrows = scanner.nextInt();
        int countsigns = countrows+1;
        int left = countrows+1, right = countrows+1;
        countrows *= 2;

        for(int nextLine = 1; nextLine < countrows; nextLine += 2){
            for(int print = 1; print < countsigns*2; print++){
                if(print >= left && print <= right){
                    System.out.print(nextLine);
                }else{
                    System.out.print("-");
                }
            }
            System.out.println();
            left--;
            right++;
        }
    }
}
