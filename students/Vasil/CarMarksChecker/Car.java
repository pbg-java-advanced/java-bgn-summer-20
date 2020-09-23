package CarMarksChecker;

import java.util.Arrays;
import java.util.Scanner;


public class Car {
    public Scanner scanner = new Scanner(System.in);
    boolean isMarksFounded = false;

    /////1
    String mark;
    String model;
    String color;
    int power;
    String engineType;
    String transmission;
    int productionYear;

    public Car(){

    }

    public Car(String mark, String model, String color, int power, String engineType, String transmission, int productionYear){
        this.mark = mark;
        this.model = model;
        this.color = color;
        this.power = power;
        this.engineType = engineType;
        this.transmission = transmission;
        this.productionYear= productionYear;
    }

    /////2
    private static String[] cars = new String[5];

    public void returnSelectedCarsMarks(){

        int nextIndex = 0;
        while(nextIndex < cars.length) {
            System.out.print("Enter car mark: ");
            cars[nextIndex++] = scanner.nextLine();
        }
        System.out.println();
        System.out.println("Here are entered cars marks: " + Arrays.deepToString(cars));

        System.out.print("1.Which character to be selected cars marks by? --> ");
        char character = scanner.next().charAt(0);

        System.out.println("Founded cars marks with starting entered character:");
        for(int count = 0; count < cars.length; count++){
            if(cars[count].charAt(0) == character || cars[count].charAt(0) == character+32){
                System.out.println(cars[count]);
                isMarksFounded = true;
            }
        }
        if(isMarksFounded == false){
            System.out.println("No cars marks found with starting entered character!");
        }
        System.out.println();
        returnSortedCarsMarks();
    }

    /////3
    public void returnSortedCarsMarks() {

        char orderSelected;
        while (true) {
            System.out.println("2.Which order to be sorted cars marks in?");
            System.out.println("A - ascending / D - descending : ");
            orderSelected = scanner.next().charAt(0);

            if(orderSelected == 'A' || orderSelected == 'a'){
                orderSelected = 'A';
                break;
            }else if(orderSelected == 'D' || orderSelected == 'd'){
                orderSelected = 'D';
                break;
            }else{
                System.out.println("Invalid option!");
            }

        }

            switch (orderSelected) {
                case 'A':
                    ascending(orderSelected);
                    break;

                case 'D':
                    descending(orderSelected);
                    break;

            }
    }

    private void ascending(char orderSelected){
        for(int ascending = 0; ascending < cars.length*2; ascending++){

            if(cars[ascending].charAt(0) == orderSelected || cars[ascending].charAt(0) == orderSelected+32){
                if(ascending != cars.length*2-1){
                    System.out.print(cars[ascending] + ", ");
                }else{
                    System.out.println(cars[ascending]);
                }
            }

            orderSelected++;
            if(ascending == cars.length-1){
                ascending = 0;
            }
        }

    }

    private void descending(char orderSelected){
        orderSelected = 'Z';
        for(int descending = 0; descending < cars.length*2; descending++){

            if(cars[descending].charAt(0) == orderSelected || cars[descending].charAt(0) == orderSelected-32){
                if(descending != cars.length-1){
                    System.out.print(cars[descending] + ", ");
                }else{
                    System.out.println(cars[descending]);
                }
            }

            orderSelected--;
            if(descending == cars.length+1){
                descending = 0;
            }
        }

    }


    /////4



}














/*void car(){
        Car[] cars = new Car[5];
        cars[0] = new Car ("Audi", "TT", "Black", 255, "gasoline", "manual", 2006);
        cars[1] = new Car("Lexus", "LC Coupe", "White", 179, "gasoline", "automatic", 2019);
        cars[2] = new Car("BMW", "i8 Coupe", "Blue", 131, "diesel", "automatic", 2018);
        cars[3] = new Car("Volkswagen", "Arteon", "Brown", 240, "gasoline", "manual", 2020);
        cars[4] = new Car("Toyota", "C-HR", "Red", 184, "gasoline", "automatic", 2017);
    }*/
