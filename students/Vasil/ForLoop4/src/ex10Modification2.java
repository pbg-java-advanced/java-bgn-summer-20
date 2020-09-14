import java.util.Scanner;

public class ex10Modification2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("How much rows with numbers (diagonally like X) --> ");
        int put = scanner.nextInt();
        int left = 1, right = put;

        for(int newLine = 1; newLine <= put; newLine++){
            for(int print = 1; print <= put; print++) {
                if(print == left && print == right){
                    System.out.print(left);
                    break;
                }
                if (print == left) {
                    System.out.print(left);
                } else {
                    System.out.print(" ");
                }
                if(print == right){
                    System.out.print(right);
                }else {
                System.out.print(" ");
            }
            }
            System.out.println();
            left++;
            right--;
            }

        }
    }

