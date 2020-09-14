import java.util.Scanner;
////////////////////////////////////////////proverqva dali tochka e v okrajnost s radius = x
public class ex1_9 {

        public static double dot_x;
        public static double dot_y;
        public static double center_x;
        public static double center_y;
        public static double radius;
        public static Scanner scanner = new Scanner(System.in);

        public static void main(String[] args) {
            System.out.println("Dot-Circle Localizer");
            getCenterCoords_and_radius();
            getDotCoordinates();
            CheckDotOutOfCircle();
        }

        public static void getDotCoordinates(){
            System.out.print("Enter X-coordinate of your point --> ");
            dot_x = scanner.nextDouble();
            System.out.print("Enter Y-coordinate of your point --> ");
            dot_y = scanner.nextDouble();
        }

    public static void getCenterCoords_and_radius(){
        System.out.print("Enter X-coordinate of center --> ");
        center_x = scanner.nextDouble();
        System.out.print("Enter Y-coordinate of center --> ");
        center_y = scanner.nextDouble();
        System.out.print("Enter the length of the radius --> ");
        radius = scanner.nextDouble();
    }

    public static void CheckDotOutOfCircle(){
            if(dot_x > center_x + radius || dot_x < center_x - radius){
                if(dot_y > center_y + radius || dot_y < center_y - radius){
                    System.out.println("Your point is out of the circle!");
                }
            }else if(dot_x == center_x + radius || dot_x == center_x - radius){
                if(dot_x == center_x + radius || dot_x == center_x - radius){
                    System.out.println("Your point is on the border of the circle!");
                }
            }else{
                System.out.println("Your point is in the circle!");
            }
        }

}

