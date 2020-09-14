import java.util.Scanner;
////////////////////////////////////////////proverqva dali dadena tochka e v okrajnost C(0,1) s radius = 5
public class ex1_8 {
    public static double dot_x;
    public static double dot_y;
    public static final int center_x = 0;
    public static final int center_y = 1;
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        getDotCoordinates();
        CheckisOutCircle();
    }

    public static void getDotCoordinates(){
        System.out.print("Enter X-coordinate of your point --> ");
        dot_x = scanner.nextDouble();
        System.out.print("Enter Y-coordinate of your point --> ");
        dot_y = scanner.nextDouble();
    }

    public static void CheckisOutCircle(){
        if(dot_x > 5 || dot_x < -5){
            if(dot_y > 6 || dot_y < -4){
                System.out.println("Your point is out of the circle!");
            }
        }else if(dot_x == 5 || dot_x == -5){
            if(dot_y == 6 || dot_y == -4){
                System.out.println("Your point is on the border of the circle!");
            }
        }else{
            System.out.println("Your point is in the circle!");
        }
    }
}
