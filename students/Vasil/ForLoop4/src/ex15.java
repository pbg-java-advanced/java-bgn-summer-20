import java.util.Scanner;
import java.util.concurrent.Callable;

public class ex15 {
    public static Scanner scanner = new Scanner(System.in);
    public static int countrows, countpos;
    public static char sign_1, sign_2;
    public static int Left_1, Left_2, Right_1, Right_2;

    public static void CalcSize_Signs(){
        System.out.print("Please enter count of rows --> ");
        countrows = scanner.nextInt();
        countpos = countrows*4;
        System.out.print("Please enter sign you want to be printed --> ");
        sign_1 = scanner.next().charAt(0);
        System.out.print("Please enter one more sign you want to be printed --> ");
        sign_2 = scanner.next().charAt(0);

        Left_1 = 1; Right_1 = countrows; Left_2 = countpos - countrows + 1; Right_2 = countpos;
    }

    public static void Define_And_Print() {
        for(int NewLine = 1; NewLine <= countrows; NewLine++){
            for(int position = 1; position <= countpos; position++){
                if( (position >= Left_1 && position <= Right_1) || (position >= Left_2 && position <= Right_2) ){
                    System.out.print(sign_1);
                }else{
                    System.out.print(sign_2);
                }
            }
            System.out.println();
            Left_1 += 2;    Right_1++;    Left_2 --;    Right_2 -= 2;
        }
    }


    public static void main(String[] args) {
        CalcSize_Signs();
        Define_And_Print();
    }
}
