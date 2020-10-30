package InstrumentsInfo;

public class Main {

    public static void main(String[] args) {
        ElectricGuitar electricGuitar = new ElectricGuitar();
        ElectricBassGuitar electricBassGuitar = new ElectricBassGuitar();

        System.out.println("From electric guitar class:");
        electricGuitar.play();

        System.out.println();

        System.out.println("From electric bass guitar class:");
        electricBassGuitar.play();


    }

}
