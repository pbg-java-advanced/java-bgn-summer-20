package ExCalculateFigureFeatures;

import java.util.Scanner;

public class Circle extends MathFigureFeatures{

    private Scanner scanner = new Scanner(System.in);
    final double pi = Math.PI;
    private double radius;

    @Override
    void calculatePerimeter() {
        System.out.println("What is the radius? (cm)");
        radius = Double.parseDouble(scanner.nextLine());
        double Perimeter = 2*pi*radius;
        System.out.println("Perimeter is " + Perimeter + "cm");
        calculateArea();
    }

    @Override
    void calculateArea() {
        double Area = pi*radius*radius;
        System.out.println("The area is: " + Area + "cm(^2)");
    }

}
