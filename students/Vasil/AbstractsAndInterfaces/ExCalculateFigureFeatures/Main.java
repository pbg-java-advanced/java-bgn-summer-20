package ExCalculateFigureFeatures;

import java.util.Scanner;

public class Main{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Circle circle = new Circle();
        Triangle triangle = new Triangle();

        while(true) {
            System.out.println("What figure will you calculate?");
            System.out.println("1.Triangle");
            System.out.println("2.Circle");
            byte figure = Byte.parseByte(scanner.nextLine());
            switch (figure) {
                case 1:
                    triangle.calculatePerimeter();
                    break;
                case 2:
                    circle.calculatePerimeter();
                    break;
                default:
                    System.out.println("Invalid input!");
                    continue;
            }
            break;
        }


    }

}
