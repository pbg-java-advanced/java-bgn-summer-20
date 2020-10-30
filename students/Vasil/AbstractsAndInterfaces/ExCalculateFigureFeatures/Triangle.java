package ExCalculateFigureFeatures;

import java.util.Scanner;

public class Triangle extends MathFigureFeatures {

    private Scanner scanner = new Scanner(System.in);
    double a, b, c;
    String side;

    @Override
    void calculatePerimeter() {
        while(true) {
            try {
                System.out.println("First side is (cm): ");
                a = Double.parseDouble(scanner.nextLine().replaceAll(",", "."));
            } catch (Exception e) {
                System.out.println("Invalid input!");
                continue;
            }
            break;
        }
        while(true) {
            try {
                System.out.println("Second side is (cm): ");
                b = Double.parseDouble(scanner.nextLine().replaceAll(",", "."));
            } catch (Exception e) {
                System.out.println("Invalid input!");
                continue;
            }
            break;
        }
        while(true) {
            try {
                System.out.println("Third side is (cm): ");
                c = Double.parseDouble(scanner.nextLine().replaceAll(",", "."));
            } catch (Exception e) {
                System.out.println("Invalid input!");
                continue;
            }
            break;
        }
            double Perimeter = a + b + c;
            System.out.println("Perimeter is: " + Perimeter + "cm");
            calculateArea();

    }


    @Override
    void calculateArea() {
        double area;
        double height;
        while(true) {

            try {
                System.out.println("Choose side for calculating area:");
                side = scanner.nextLine();

                switch (side) {
                    case "a":
                        System.out.println("What is the height opposite this side (cm)?");
                        height = Double.parseDouble(scanner.nextLine());
                        area = (a * height) / 2;
                        break;
                    case "b":
                        System.out.println("What is the height opposite this side (cm)?");
                        height = Double.parseDouble(scanner.nextLine());
                        area = (b * height) / 2;
                        break;
                    case "c":
                        System.out.println("What is the height opposite this side (cm)?");
                        height = Double.parseDouble(scanner.nextLine());
                        area = (c * height) / 2;
                        break;
                    default:
                        System.out.println("Invalid character!");
                        continue;
                }
                break;
            }catch (Exception e){
               e.printStackTrace();
            }

        }

        System.out.println("The area is: " + area + "cm(^2)");
    }

}
